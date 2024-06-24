package com.djong.scheduling.model;

import lombok.Builder;

@Builder

public record ChargingSchedule(
        String vehicleId,
        int duration,
        int startHour,
        int startMinute,
        int endHour,
        int endMinute,
        Status status
) {
}
