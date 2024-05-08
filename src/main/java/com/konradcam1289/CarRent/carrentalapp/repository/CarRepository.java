package com.konradcam1289.CarRent.carrentalapp.repository;

import com.konradcam1289.CarRent.carrentalapp.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
