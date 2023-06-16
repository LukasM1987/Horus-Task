package com.horus.wall;

import java.util.List;

public class SingleBlock implements CompositeBlock {

    private final String color;
    private final String material;

    public SingleBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public List<Block> getBlocks() {
        return null;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}
