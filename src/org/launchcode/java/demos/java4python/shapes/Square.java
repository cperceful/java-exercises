package org.launchcode.java.demos.java4python.shapes;

/**
 * Created by cperc on 3/19/2017.
 */
public class Square extends Shape {

    //protected static final Integer NUMBER_OF_SIDES = 4;
    protected Double width;
    protected Double height;

    public Square(Double width, Double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public Double getWidth(){
        return width;
    }

    public Double getHeight(){
        return height;
    }

    public void setWidth(Double aWidth){
        width = aWidth;
    }

    public void setHeight(Double aHeight){
        height = aHeight;
    }

    public Double getArea(){
        return getHeight() * getWidth();
    }



}
