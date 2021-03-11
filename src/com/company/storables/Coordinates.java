package com.company.storables;

/**
 * Coordinates where Dragon can be at
 * @see Dragon
 */
public class Coordinates {
    private double x;
    private Long y; //Can't be null

    /**
     * Gets x coordinate
     * @return x coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Sets x coordinate
     * @param x new x coordinate
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets y coordinate
     * @return y coordinate
     */
    public Long getY() {
        return y;
    }

    /**
     * Sets y coordinate
     * @param y new y coordinate
     */
    public void setY(Long y) {
        if(y == null)
            throw new IllegalArgumentException("y can't be null");
        this.y = y;
    }

    /**
     * Coordinates constructor
     * @param x x coordinate
     * @param y y coordinate
     */
    public Coordinates(double x, Long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ";y=" + y +
                '}';
    }
}