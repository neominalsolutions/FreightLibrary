package com.freight.dtos;

public class FreightResponseDto {
    private double listPrice;
    private double weight;

    public FreightResponseDto(double listPrice, double weight) {
        this.listPrice = listPrice;
        this.weight = weight;
    }

    public double getListPrice() {
        return listPrice;
    }

    public double getWeight() {
        return weight;
    }
}
