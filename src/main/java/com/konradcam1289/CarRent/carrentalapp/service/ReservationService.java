package com.konradcam1289.CarRent.carrentalapp.service;

import com.konradcam1289.CarRent.carrentalapp.dto.RegistrationDto;
import com.konradcam1289.CarRent.carrentalapp.entity.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {
    void createReservation(RegistrationDto reservationDto, String carUrl);

    boolean isCarAvailableForReservation(Long carId, LocalDate startDate, LocalDate endDate);

    List<Reservation> getUserReservationsByUserId(Long id);

    void deleteReservation(Long id);


    Reservation getReservationById(Long id);

//    List<Car> searchCars(String query);

}