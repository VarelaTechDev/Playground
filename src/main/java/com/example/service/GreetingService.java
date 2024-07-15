package com.example.service;

import com.example.model.GreetingRequest;
import com.example.model.GreetingResponse;
import io.americanexpress.synapse.service.rest.service.BaseReadMonoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class GreetingService extends BaseReadMonoService<GreetingRequest, GreetingResponse> {

    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);

    @Override
    protected GreetingResponse executeRead(HttpHeaders httpHeaders, GreetingRequest greetingRequest) {
        logger.info("Received greeting request for name: {}", greetingRequest.getName());

        GreetingResponse greetingResponse = new GreetingResponse("Hello " + greetingRequest.getName() + "!");
        greetingResponse.setId(UUID.randomUUID().toString());

        logger.debug("Generated greeting response with ID: {}", greetingResponse.getId());

        return greetingResponse;
    }
}