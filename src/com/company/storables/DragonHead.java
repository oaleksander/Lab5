package com.company.storables;

public class DragonHead {
    private Long size; //Поле может быть null

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public DragonHead(Long size) {
        this.size = size;
    }
}
