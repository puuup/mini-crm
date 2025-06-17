package com.mini.crm.event.service;

import com.mini.crm.event.controller.dto.EventRequestDto;

public interface EventService {

    void sendToQueue(EventRequestDto requestDto);
}
