package com.jwt.example.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private String email;
    private String password;

}
