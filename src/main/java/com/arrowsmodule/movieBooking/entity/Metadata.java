package com.arrowsmodule.movieBooking.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Metadata {
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
