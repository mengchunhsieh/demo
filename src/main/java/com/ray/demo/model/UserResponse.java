package com.ray.demo.model;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "user" })
public class UserResponse {

    @JsonProperty("user")
    @JsonPropertyDescription("user response")
    private List<User> userList = new ArrayList<>();

    @JsonProperty("user")
    public void setUser(User user) {
        this.userList.add(user);
    }

    @JsonProperty("user")
    public List<User> getUserList() {
        return this.userList;
    }
}
