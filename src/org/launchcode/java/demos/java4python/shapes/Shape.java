package org.launchcode.java.demos.java4python.shapes;

/**
 * Created by cperc on 3/19/2017.
 */
public abstract class Shape {

    private final Integer numberOfSides;

    Shape(Integer numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public Integer getNumberOfSides(){
        return numberOfSides;
    }

    public abstract Double getArea();
}
