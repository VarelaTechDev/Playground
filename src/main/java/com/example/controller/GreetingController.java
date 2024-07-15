package com.example.controller;

import com.example.model.GreetingRequest;
import com.example.model.GreetingResponse;
import com.example.service.GreetingService;
import io.americanexpress.synapse.service.rest.controller.BaseReadMonoController;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
@Api(value = "Greeting", tags = "Greeting API")
public class GreetingController extends BaseReadMonoController<GreetingRequest, GreetingResponse, GreetingService> {

    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @Override
    public ResponseEntity<GreetingResponse> read(HttpHeaders headers, GreetingRequest request) {
        logger.info("Received greeting request in controller");
        ResponseEntity<GreetingResponse> response = super.read(headers, request);
        logger.info("Sending greeting response from controller. Status: {}", response.getStatusCode());
        return response;
    }
}