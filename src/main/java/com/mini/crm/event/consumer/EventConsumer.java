package com.mini.crm.event.consumer;

import com.mini.crm.event.controller.dto.EventRequestDto;
import com.mini.crm.event.entity.UserEvent;
import com.mini.crm.event.repository.UserEventRepository;
import com.mini.crm.event.service.mapper.DtoToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventConsumer {

    private final UserEventRepository userEventRepository;

    public void consume(EventRequestDto requestDto) {
        UserEvent userEvent = DtoToEntityMapper.eventRequestDtoToUserEvent(requestDto);
        userEventRepository.save(userEvent);
    }
}
