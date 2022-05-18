package com.example.pizzaaplicationtest.data.repository;

import com.example.pizzaaplicationtest.data.entity.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<Integer, SizeEntity> {
}
