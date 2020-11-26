package com.company.storables;

public class Coordinates {
    private Long x; //Максимальное значение поля: 270, Поле не может быть null
    private int y; //Значение поля должно быть больше -510

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Coordinates(Long x, int y) {
        this.x = x;
        this.y = y;
    }
}