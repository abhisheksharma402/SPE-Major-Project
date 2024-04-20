package com.spe.project.travelguide.main.Agency;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agency")
@RequiredArgsConstructor
@Tag(name="Agency")
public class AgencyController {
}
