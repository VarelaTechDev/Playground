package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.americanexpress.synapse.service.rest.model.BaseServiceResponse;

public class GreetingResponse extends BaseServiceResponse {
    private String message;

    public GreetingResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @JsonIgnore
    public String getId() {
        return super.getId();
    }

    @Override
    @JsonIgnore
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
