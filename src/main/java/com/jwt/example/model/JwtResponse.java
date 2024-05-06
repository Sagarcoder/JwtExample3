package com.jwt.example.model;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {

    private String jwtToken;
    private String username;
}
