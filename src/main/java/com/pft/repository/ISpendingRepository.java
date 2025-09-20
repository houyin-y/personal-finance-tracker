package com.pft.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pft.model.Spending;

@Repository
public interface ISpendingRepository extends CrudRepository<Spending, Long> {
    
    public List<Spending> findByCategory(String category);

    public List<Spending> findByDateBetween(LocalDate startDate, LocalDate endDate);

    /* @Query("SELECT s FROM spendings WHERE :startDate < date AND date > :endDate")
    List<Spending> findByDateRange(
        @Param("startDate") LocalDate startDate, 
        @Param("endDate")LocalDate endDate
    ); */
} 
