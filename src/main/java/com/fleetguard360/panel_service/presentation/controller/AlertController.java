package com.fleetguard360.panel_service.presentation.controller;

import com.fleetguard360.panel_service.presentation.dto.AlertResponseDTO;
import com.fleetguard360.panel_service.service.interfaces.AlertService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class AlertController {

    private final AlertService alertService;

    @QueryMapping
    public List<AlertResponseDTO> getAllAlerts() {
        log.info("GraphQL query: getAllAlerts");
        return alertService.getAllAlerts();
    }

    @QueryMapping
    public AlertResponseDTO getAlertById(@Argument Long id) {
        log.info("GraphQL query: getAlertById with id: {}", id);
        return alertService.getAlertById(id);
    }
}

