package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {

    public Automobile(double m, double a) {
        mpg = m;
        gallons = a;
    }



    public void fillUp(double f) {
        gallons += f;

    }

    public void takeTrip(double x) {
        gallons -= x;

    }

    public double reportFuel() {
        double w = gallons;
        return w;
    }

    public double mpg;
    public double gallons;
}
