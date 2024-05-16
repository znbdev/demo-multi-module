package com.example.demo.controller.dto;

import lombok.Builder;
import lombok.Value;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Value
public class ItemDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    Long id;
    String name;
    Integer price;
    LocalDateTime createAt;

    public static ItemDto of(Long id, String name, Integer price, LocalDateTime createAt) {
        return ItemDto.builder()
                .id(id)
                .name(name)
                .price(price)
                .createAt(createAt)
                .build();
    }
}
