package com.example.nice_admin.repositories;

import com.example.nice_admin.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
