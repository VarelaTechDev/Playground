package com.example.model;

import io.americanexpress.synapse.service.rest.model.BaseServiceRequest;

public class GreetingRequest implements BaseServiceRequest {

    private String name;

    public GreetingRequest(){}

    public GreetingRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
