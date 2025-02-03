package com.hugo.spring_security.controllers.dtos;

import java.util.List;

public record FeedDTO(List<FeedItemDTO> feedItems, int page, int pageSize, int totalPage, long totalElements) {
}
