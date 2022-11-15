package com.example.nice_admin.repositories;

import com.example.nice_admin.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
