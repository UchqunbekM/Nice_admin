package com.example.nice_admin.repositories;

import com.example.nice_admin.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
