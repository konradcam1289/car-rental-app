package com.konradcam1289.CarRent.carrentalapp.mapper;

import com.konradcam1289.CarRent.carrentalapp.dto.CarDto;
import com.konradcam1289.CarRent.carrentalapp.entity.Car;

public class CarMapper {

    public static CarDto mapToCarDto(Car car){
        return CarDto.builder().ID(car.getID())
                .brand(car.getBrand())
                .model(car.getModel())
                .price(car.getPrice())
                .horsepower(car.getHorsepower())
                .description(car.getDescription())
                .fuel(car.getFuel())
                .location(car.getLocation())
                .bodyType(car.getBodyType())
                .fuelType(car.getFuelType())
                .seatsNumber(car.getSeatsNumber())
                .color(car.getColor())
                .productionYear(car.getProductionYear())
                .url(car.getUrl())
                .doorsNumber(car.getDoorsNumber())
                .build();
    }

    public static Car mapToCar(CarDto carDto){
        return Car.builder()
                .ID(carDto.getID())
                .brand(carDto.getBrand())
                .model(carDto.getModel())
                .price(carDto.getPrice())
                .horsepower(carDto.getHorsepower())
                .description(carDto.getDescription())
                .fuel(carDto.getFuel())
                .location(carDto.getLocation())
                .bodyType(carDto.getBodyType())
                .fuelType(carDto.getFuelType())
                .seatsNumber(carDto.getSeatsNumber())
                .color(carDto.getColor())
                .productionYear(carDto.getProductionYear())
                .url(carDto.getUrl())
                .doorsNumber(carDto.getDoorsNumber())
                .build();
    }
}
