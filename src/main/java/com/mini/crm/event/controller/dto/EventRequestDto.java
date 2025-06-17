package com.mini.crm.event.controller.dto;

import lombok.Data;

@Data
public class EventRequestDto {

    private String userId;
    private String productId;
    private String eventType;
}
