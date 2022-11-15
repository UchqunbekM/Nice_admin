package com.example.nice_admin.repositories;

import com.example.nice_admin.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
