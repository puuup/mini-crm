package com.mini.crm.event.service;

import com.mini.crm.event.controller.dto.EventRequestDto;
import com.mini.crm.event.queue.EventQueueSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventQueueSender eventQueueSender;

    @Override
    public void sendToQueue(EventRequestDto requestDto) {
        eventQueueSender.send(requestDto);
    }
}
