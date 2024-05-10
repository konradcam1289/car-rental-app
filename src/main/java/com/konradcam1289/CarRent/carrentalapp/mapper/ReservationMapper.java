package com.konradcam1289.CarRent.carrentalapp.mapper;

import com.konradcam1289.CarRent.carrentalapp.dto.RegistrationDto;
import com.konradcam1289.CarRent.carrentalapp.entity.Reservation;

public class ReservationMapper {
    public static RegistrationDto mapToReservationDto(Reservation reservation){
        return RegistrationDto.builder()
                .ID(reservation.getID())
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .totalCost(reservation.getTotalCost())
                .build();
    }

    public static Reservation mapToReservation(RegistrationDto reservationDto){
        return Reservation.builder()
                .ID(reservationDto.getID())
                .startDate(reservationDto.getStartDate())
                .endDate(reservationDto.getEndDate())
                .totalCost(reservationDto.getTotalCost())
                .build();
    }
}
