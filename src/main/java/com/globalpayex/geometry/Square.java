package com.globalpayex.geometry;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int areaSquare(){
        return this.side * this.side;
    }

    public int peri(){
        return 4 * this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
