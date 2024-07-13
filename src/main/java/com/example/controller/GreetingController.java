package com.example.controller;

import com.example.model.GreetingRequest;
import com.example.model.GreetingResponse;
import com.example.service.GreetingService;
import io.americanexpress.synapse.service.rest.controller.BaseReadMonoController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
@Api(value = "Greeting", tags = "Greeting API")
public class GreetingController extends BaseReadMonoController<GreetingRequest, GreetingResponse, GreetingService> {
}
