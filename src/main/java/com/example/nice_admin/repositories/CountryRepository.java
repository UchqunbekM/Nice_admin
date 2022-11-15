package com.example.nice_admin.repositories;

import com.example.nice_admin.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
