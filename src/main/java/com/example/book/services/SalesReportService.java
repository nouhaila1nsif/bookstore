package com.example.book.services;

import com.example.book.entities.SalesReportData;

import java.time.LocalDate;
import java.util.List;

public interface SalesReportService {
    List<SalesReportData> generateSalesReportByPeriod(LocalDate startDate, LocalDate endDate);
    List<SalesReportData> generateSalesReportByCategory(String category);
    // Add methods for other report types (e.g., by customer, by product)
}
