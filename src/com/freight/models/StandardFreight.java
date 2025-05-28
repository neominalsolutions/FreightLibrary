package com.freight.models;

public class StandardFreight extends Freight {

    public StandardFreight(double weight) {
        super(weight);
    }

    public StandardFreight(double height, double width, double length) {
        super(height, width, length);
    }

}
