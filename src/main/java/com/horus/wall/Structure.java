package com.horus.wall;

import java.util.List;
import java.util.Optional;

public interface Structure {

    Optional<Block> findBlockByColor(String color) throws BlockException;

    List<Block> findBlocksByMaterial(String material);

    int count();
}
