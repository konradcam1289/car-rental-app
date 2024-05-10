package com.konradcam1289.CarRent.carrentalapp.repository;

import com.konradcam1289.CarRent.carrentalapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    Optional<Role> findById(Long id);
}
