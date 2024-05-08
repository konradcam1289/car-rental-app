package com.konradcam1289.CarRent.carrentalapp.mapper;

import com.konradcam1289.CarRent.carrentalapp.dto.ReservationDto;
import com.konradcam1289.CarRent.carrentalapp.entity.Reservation;

public class ReservationMapper {
    public static ReservationDto mapToReservationDto(Reservation reservation){
        return ReservationDto.builder()
                .ID(reservation.getID())
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .totalCost(reservation.getTotalCost())
                .build();
    }

    public static Reservation mapToReservation(ReservationDto reservationDto){
        return Reservation.builder()
                .ID(reservationDto.getID())
                .startDate(reservationDto.getStartDate())
                .endDate(reservationDto.getEndDate())
                .totalCost(reservationDto.getTotalCost())
                .build();
    }
}
