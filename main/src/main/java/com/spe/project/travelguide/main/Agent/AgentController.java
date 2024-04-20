package com.spe.project.travelguide.main.Agent;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agent")
@RequiredArgsConstructor
@Tag(name="Agent")
public class AgentController {
}
