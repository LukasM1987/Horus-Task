package com.horus.wall;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {

    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) throws BlockException {
        return blocks.stream()
                .filter(b -> b.getColor().equalsIgnoreCase(color))
                .findFirst()
                .map(Optional::of)
                .orElseThrow(() -> new BlockException("Block with this color is not exist."));
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(b -> b.getMaterial().equalsIgnoreCase(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }
}

