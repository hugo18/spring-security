package com.hugo.spring_security.controllers.dtos;

public record FeedItemDTO(long tweetId, String content, String username) {
}
