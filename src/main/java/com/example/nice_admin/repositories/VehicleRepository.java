package com.example.nice_admin.repositories;

import com.example.nice_admin.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
