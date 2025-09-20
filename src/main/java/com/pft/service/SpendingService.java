package com.pft.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pft.model.Spending;
import com.pft.repository.ISpendingRepository;

@Service
public class SpendingService {
    @Autowired
    private ISpendingRepository repository;

    public Spending findById(Long id) {
        Optional<Spending> result = repository.findById(id);
        return result.get();
    }

    public List<Spending> findByCategory(String category) {
        return repository.findByCategory(category);
    }

    public List<Spending> findByDateBetween(LocalDate startDate, LocalDate endDate) {
        return repository.findByDateBetween(startDate, endDate);
    }
}
