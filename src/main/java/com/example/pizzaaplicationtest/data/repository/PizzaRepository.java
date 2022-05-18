package com.example.pizzaaplicationtest.data.repository;

import com.example.pizzaaplicationtest.data.entity.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Integer, PizzaEntity> {
}
