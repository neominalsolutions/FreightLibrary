package com.freight.dtos;

import java.time.LocalDate;

public class FreightRequestDto {
    private boolean isLight;
    private double weight;
    private double height;
    private double length;
    private double width;
    private LocalDate shippedDate;
    private double unitPrice;
    private String freightType;

    public FreightRequestDto(boolean isLight, double weight, double height, double length, double width,double unitPrice, LocalDate shippedDate, String freightType) {
        this.isLight = isLight;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.width = width;
        this.unitPrice = unitPrice;
        this.shippedDate = shippedDate;
        this.freightType = freightType;
    }

    public boolean getLight() {
        return  this.isLight;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public LocalDate getShippedDate() {
        return this.shippedDate;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public String getFreightType() {
        return this.freightType;
    }

}
