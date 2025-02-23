package com.scarlxrd.minix.controller.DTO;

import java.util.List;

public record FeedDto(List<FeedItemDto> feedItens,
                      int page,
                      int pageSize,
                      int totalPages,
                      long totalElements) {
}
