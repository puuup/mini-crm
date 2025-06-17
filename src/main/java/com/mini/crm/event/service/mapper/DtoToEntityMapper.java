package com.mini.crm.event.service.mapper;

import com.mini.crm.event.controller.dto.EventRequestDto;
import com.mini.crm.event.entity.EventType;
import com.mini.crm.event.entity.Product;
import com.mini.crm.event.entity.UserEvent;

public class DtoToEntityMapper {

    public static UserEvent eventRequestDtoToUserEvent(EventRequestDto requestDto) {
        return UserEvent.builder()
                .userId(requestDto.getUserId())
                .productId(requestDto.getProductId())
                .eventType(EventType.valueOf(requestDto.getEventType().toUpperCase()))
                .build();
    }
}
