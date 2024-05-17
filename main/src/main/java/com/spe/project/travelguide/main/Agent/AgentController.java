package com.spe.project.travelguide.main.Agent;

import com.spe.project.travelguide.main.Package.PackageRepository;
import com.spe.project.travelguide.main.dto.requests.*;
import com.spe.project.travelguide.main.dto.response.AgencyAuthenticationResponse;
import com.spe.project.travelguide.main.dto.response.AgentAuthenticationResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("agent")
@RequiredArgsConstructor
@Tag(name="Agent")
public class AgentController {
    private final PackageRepository packageRepository;
    private final AgentRepository agentRepository;
    private final AgentService agentService;


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> register(@RequestBody @Valid AgentRegistrationRequest request) throws MessagingException {
        agentService.register(request);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/login")
    public ResponseEntity<AgentAuthenticationResponse> authenticate(@RequestBody @Valid AgentAuthenticationRequest authenticationRequest){

        return ResponseEntity.ok(agentService.authenticate(authenticationRequest));

    }

    @GetMapping("/activate-account")
    public void confirm(@RequestBody @Valid AgentActivationRequest agentActivationRequest) throws MessagingException {
        agentService.activateAccount(agentActivationRequest);
    }


}
