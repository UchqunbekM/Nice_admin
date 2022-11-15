package com.example.nice_admin.repositories;

import com.example.nice_admin.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
