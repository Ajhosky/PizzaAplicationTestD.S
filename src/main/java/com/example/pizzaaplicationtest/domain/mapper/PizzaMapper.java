package com.example.pizzaaplicationtest.domain.mapper;

import com.example.pizzaaplicationtest.data.entity.PizzaEntity;
import com.example.pizzaaplicationtest.remote.rest.dto.response.PizzaDto;

public class PizzaMapper {
    public PizzaDto mapToPizzaDto(PizzaEntity pizzaEntity){
        PizzaDto pizza = new PizzaDto();
        pizza.setId(pizza.getId());
        pizza.setName(pizza.getName());
        return pizza;
    }
}