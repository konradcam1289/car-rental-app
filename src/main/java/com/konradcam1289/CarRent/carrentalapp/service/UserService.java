package com.konradcam1289.CarRent.carrentalapp.service;

import com.konradcam1289.CarRent.carrentalapp.dto.RegistrationDto;
import com.konradcam1289.CarRent.carrentalapp.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByPesel(String Pesel);

    User findByEmail(String email);

    Optional<User> findUsersById(Long id);

    List<User> getUsersByRoleId(Long roleId);

    void deleteById(Long id);

    User findUserById(Long id);

}
