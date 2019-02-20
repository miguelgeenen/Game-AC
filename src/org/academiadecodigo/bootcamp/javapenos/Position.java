package org.academiadecodigo.bootcamp.javapenos;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Position {

    private Rectangle rectangle;
    private Grid grid;
    private static final double JAVASIZE = 10;
    private double x;
    private double y;


    public Position(double x, double y, Grid grid) {
        this.grid = grid;
        this.x = x;
        this.y = y;
        this.rectangle = new Rectangle(x, y, JAVASIZE, JAVASIZE);
        show();
    }


    public void show() {
        rectangle.fill();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void hide() {

        rectangle.delete();
    }


    public void moveInDirection(double goY) {
        double moveY = Math.abs(goY - y);

        while (y < grid.getHeight()) {

            rectangle.translate(0, 10);
        }

    }

}
