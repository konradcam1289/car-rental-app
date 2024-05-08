package com.konradcam1289.CarRent.carrentalapp.service;

import com.konradcam1289.CarRent.carrentalapp.dto.CarDto;

import java.util.List;

public interface CarService {

    List<CarDto> findAllCars();
    void createCar(CarDto carDto);
    CarDto findCarById(Long ID);
    void updateCar(CarDto carDto);
    void deleteCar(Long carID);
    CarDto findCarByUrl(String carUrl);
    List<CarDto> searchCar(String query);
}
