package com.example.nice_admin.Repository;

import com.example.nice_admin.Model.Client;
import com.example.nice_admin.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
