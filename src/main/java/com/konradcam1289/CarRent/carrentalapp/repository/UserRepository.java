package com.konradcam1289.CarRent.carrentalapp.repository;

import com.konradcam1289.CarRent.carrentalapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByPesel(String pesel);

    List<User> findUsersByRolesId(Long roleId);

    @Override
    void deleteById(Long ID);


    User findByEmail(String email);

}
