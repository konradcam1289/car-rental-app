package com.konradcam1289.CarRent.carrentalapp.repository;

import com.konradcam1289.CarRent.carrentalapp.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
