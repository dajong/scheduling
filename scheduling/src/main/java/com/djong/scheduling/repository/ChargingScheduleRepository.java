package com.djong.scheduling.repository;

import com.djong.scheduling.model.ChargingSchedule;
import com.djong.scheduling.model.DbChargingSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChargingScheduleRepository extends MongoRepository<DbChargingSchedule, String>{
    List<DbChargingSchedule> findAllByVehicleId(String vehicleId);

    ChargingSchedule findByVehicleId(String vehicleId);
    void deleteByVehicleId(String vehicleId);
    void save(ChargingSchedule chargingSchedule);
}
