package com.example.service;

import com.example.model.GreetingRequest;
import com.example.model.GreetingResponse;
import io.americanexpress.synapse.service.rest.service.BaseReadMonoService;
import io.americanexpress.synapse.service.rest.service.BaseService;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GreetingService extends BaseReadMonoService<GreetingRequest, GreetingResponse> {

    @Override
    protected GreetingResponse executeRead(HttpHeaders httpHeaders, GreetingRequest greetingRequest) {
        GreetingResponse greetingResponse = new GreetingResponse("Hello " + greetingRequest.getName() + "!");
        greetingResponse.setId(UUID.randomUUID().toString());
        return greetingResponse;
    }
}
