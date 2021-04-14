package com.infinity.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JWTResponse {

    private String id = "JWT Token";
    private int expiry = 8 * 60 * 60;
    private String token;

    public JWTResponse(String token) {
        this.token = token;
    }
}
