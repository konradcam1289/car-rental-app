package com.konradcam1289.CarRent.carrentalapp.service.ServiceImpl;

import com.konradcam1289.CarRent.carrentalapp.dto.CarDto;
import com.konradcam1289.CarRent.carrentalapp.entity.Car;
import com.konradcam1289.CarRent.carrentalapp.mapper.CarMapper;
import com.konradcam1289.CarRent.carrentalapp.repository.CarRepository;
import com.konradcam1289.CarRent.carrentalapp.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private CarRepository carRepository;
    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }
    @Override
    public List<CarDto> findAllCars() {
        List<Car> posts = carRepository.findAll();
        return posts.stream().map(CarMapper::mapToCarDto)
                .collect(Collectors.toList());
    }

    @Override
    public void createCar(final CarDto carDto) {
        Car car = CarMapper.mapToCar(carDto);
        carRepository.save(car);
    }

    @Override
    public CarDto findCarById(final Long ID) {
        Car car = carRepository.findById(ID).get();
        return CarMapper.mapToCarDto(car);

    }

    @Override
    public void updateCar(final CarDto carDto) {

    }

    @Override
    public void deleteCar(final Long carID) {

    }

    @Override
    public CarDto findCarByUrl(final String carUrl) {
        return null;
    }

    @Override
    public List<CarDto> searchCar(final String query) {
        return null;
    }
}
