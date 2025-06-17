package com.mini.crm.event.queue;

import com.mini.crm.event.controller.dto.EventRequestDto;

public interface EventQueueSender {

    void send(EventRequestDto requestDto);
}
