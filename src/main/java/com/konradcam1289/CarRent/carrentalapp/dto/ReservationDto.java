package com.konradcam1289.CarRent.carrentalapp.dto;

import com.konradcam1289.CarRent.carrentalapp.entity.Car;
import com.konradcam1289.CarRent.carrentalapp.entity.User;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ReservationDto {


    private Long id;
    private User user;
    private Car car;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal totalCost;
}
