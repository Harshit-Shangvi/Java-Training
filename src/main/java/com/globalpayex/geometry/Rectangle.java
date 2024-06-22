package com.globalpayex.geometry;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    public int area(){
        return this.length * this.breadth;
    }

    public int perimeter(){
        return 2 * (this.length + this.breadth);
    }
}
