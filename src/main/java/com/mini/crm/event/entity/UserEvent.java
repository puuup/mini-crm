package com.mini.crm.event.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
public class UserEvent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_event_id")
    private Long id;

    private String userId;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

    private String productId;

    private LocalDateTime eventTime;
}
