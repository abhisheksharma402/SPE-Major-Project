package com.spe.project.travelguide.main.Agency;


import com.spe.project.travelguide.main.Itinerary.ItineraryItemEntity;
import com.spe.project.travelguide.main.Itinerary.ItineraryService;
import com.spe.project.travelguide.main.Package.PackageEntity;
import com.spe.project.travelguide.main.Package.PackageRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("agency")
@RequiredArgsConstructor
@Tag(name="Agency")
public class AgencyController {

    private final PackageRepository packageRepository;
    private final ItineraryService itineraryService;

    @PostMapping("/makePackage")
    ResponseEntity<PackageEntity> makePackage(@RequestBody PackageEntity packageEntity){
        if (packageEntity.getItinerary() != null) {
            for (ItineraryItemEntity itineraryItemEntity : packageEntity.getItinerary()) {
                itineraryItemEntity.setPackageEntity(packageEntity);
            }
        }
        packageRepository.save(packageEntity);

        return ResponseEntity.ok(packageEntity);
    }

}
