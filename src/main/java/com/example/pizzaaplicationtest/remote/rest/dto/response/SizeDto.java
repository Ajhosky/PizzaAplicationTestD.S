package com.example.pizzaaplicationtest.remote.rest.dto.response;

import com.example.pizzaaplicationtest.domain.model.SizeType;

import java.math.BigDecimal;

public class SizeDto {

    private Integer id;
    private SizeType sizeType;
    private BigDecimal price;

    public SizeDto(){

    }

    public SizeDto(Integer id, SizeType sizeType, BigDecimal price) {
        this.id = id;
        this.sizeType = sizeType;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

