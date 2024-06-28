package com.arrowsmodule.movieBooking.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserMetadata {
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime lastActiveAt;
}
