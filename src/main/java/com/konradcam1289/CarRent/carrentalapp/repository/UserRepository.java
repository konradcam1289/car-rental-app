package com.konradcam1289.CarRent.carrentalapp.repository;

import com.konradcam1289.CarRent.carrentalapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}
