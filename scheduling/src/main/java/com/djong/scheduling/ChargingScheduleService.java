package com.djong.scheduling;

import com.djong.scheduling.model.ChargingSchedule;
import com.djong.scheduling.repository.ChargingScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ChargingScheduleService {
    private final ChargingScheduleRepository chargingScheduleRepository;

    public ChargingScheduleService(ChargingScheduleRepository chargingScheduleRepository) {
        this.chargingScheduleRepository = chargingScheduleRepository;
    }

    public void saveChargingSchedule(ChargingSchedule chargingSchedule) {
        chargingScheduleRepository.save(chargingSchedule);
    }

    public ChargingSchedule getChargingSchedule(String vehicleId) {
        return chargingScheduleRepository.findByVehicleId(vehicleId);
    }
}
