package com.djong.scheduling;

import com.djong.scheduling.model.ChargingSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/chargingSchedule")
public class ChargingScheduleController {
    @Autowired
    private ChargingScheduleService chargingScheduleService;

    @GetMapping("/{vehicleId}")
    public ChargingSchedule getChargingSchedule(String vehicleId) {
        return chargingScheduleService.getChargingSchedule(vehicleId);
    }
}
