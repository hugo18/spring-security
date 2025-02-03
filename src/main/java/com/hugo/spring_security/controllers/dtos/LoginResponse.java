package com.hugo.spring_security.controllers.dtos;

public record LoginResponse(String accessToken, Long expiresIn) {
}
