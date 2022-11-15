package com.example.nice_admin.repositories;

import com.example.nice_admin.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
