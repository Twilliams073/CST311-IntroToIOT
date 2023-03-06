package com.cst499.safepi.repository;

import com.cst499.safepi.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
    // all crud database methods
}
