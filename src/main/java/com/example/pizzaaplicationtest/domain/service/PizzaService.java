package com.example.pizzaaplicationtest.domain.service;

import com.example.pizzaaplicationtest.data.repository.PizzaRepository;

public class PizzaService {

    private PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public void addPizza(){

    }
}
