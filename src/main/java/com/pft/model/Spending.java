package com.pft.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name= "spendings")
public class Spending {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(length = 40, nullable = false)
    private String category;

    @Column(length = 120)
    private String description;

    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal price;

    @Column(length = 400)
    private String remarks;
}
