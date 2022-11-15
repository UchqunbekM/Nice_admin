package com.example.nice_admin.repositories;

import com.example.nice_admin.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
