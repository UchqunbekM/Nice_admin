package com.example.nice_admin.repositories;

import com.example.nice_admin.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
