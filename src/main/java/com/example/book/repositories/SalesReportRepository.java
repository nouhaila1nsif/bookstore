package com.example.book.repositories;

import com.example.book.entities.SalesReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SalesReportRepository extends JpaRepository<SalesReport, Long> {
    // ... (Optional custom methods)
}
