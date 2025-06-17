package com.mini.crm.event.controller;

import com.mini.crm.event.controller.dto.EventRequestDto;
import com.mini.crm.event.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crm/events")
@RequiredArgsConstructor
public class EventApiController {

    private final EventService eventService;

    @PostMapping
    public ResponseEntity<Void> trackEvent(@RequestBody EventRequestDto requestDto) {

        eventService.sendToQueue(requestDto);

        return ResponseEntity
                .ok()
                .build();
    }
}
