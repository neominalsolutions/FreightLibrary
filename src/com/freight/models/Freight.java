package com.freight.models;

public abstract class Freight implements PriceCalculator {
    private double weight;
    private double height;
    private double length;
    private double width;

    // ağır bir cisimse
    public Freight(double weight) {
        this.weight = weight;
    }

    // hafifse
    public Freight(double height, double width, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public double getWeight() {

        double volume = 0;

        if (this.height != 0 && this.length != 0 && this.width != 0){
             volume = (this.width * this.height * this.length) / 5000;
        }

        if(volume > this.weight){
            this.weight = volume;
        }

       return this.weight;
    }

    @Override
    public double calculatePrice(double unitPrice) {
        return this.getWeight() * unitPrice;
    }
}
