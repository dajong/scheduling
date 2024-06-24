package com.djong.scheduling.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@Document(collection = "charging_schedule")
public class DbChargingSchedule {
    @Id
    private String vehicleId;
    private ChargingSchedule chargingSchedule;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    // This is used for optimistic locking
    @Version
    private Integer version;
}
