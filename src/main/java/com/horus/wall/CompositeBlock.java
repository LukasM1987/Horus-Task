package com.horus.wall;

import java.util.List;

interface CompositeBlock extends Block {

    List<Block> getBlocks();
}

