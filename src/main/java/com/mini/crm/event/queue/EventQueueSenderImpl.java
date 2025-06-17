package com.mini.crm.event.queue;

import com.mini.crm.event.controller.dto.EventRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventQueueSenderImpl implements EventQueueSender {

    private final MessageChannel eventInputChannel;

    @Override
    public void send(EventRequestDto requestDto) {
        eventInputChannel.send(
                MessageBuilder
                .withPayload(requestDto)
                .build()
        );
    }
}
