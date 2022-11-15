package com.example.nice_admin.repositories;

import com.example.nice_admin.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
