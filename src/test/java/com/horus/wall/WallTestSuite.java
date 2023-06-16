package com.horus.wall;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WallTestSuite {

    @Test
    public void findBlockByColorTest() throws BlockException {
        //Given
        List<Block> blocks = new ArrayList<>();
        blocks.add(new SingleBlock("Blue", "Wood"));
        blocks.add(new SingleBlock("Red", "Wood"));
        blocks.add(new SingleBlock("Red", "Metal"));
        blocks.add(new SingleBlock("Gray", "Stone"));
        blocks.add(new SingleBlock("Red", "Brick"));
        Wall wall = new Wall(blocks);

        //When
        Optional<Block> color = wall.findBlockByColor("Red");

        //Then
        Assert.assertNotEquals("Blue", color.get().getColor());
        Assert.assertEquals("Red", color.get().getColor());
        Assert.assertEquals("Wood", color.get().getMaterial());

    }

    @Test
    public void findBlocksByMaterialTest() {
        //Given
        List<Block> blocks = new ArrayList<>();
        blocks.add(new SingleBlock("Red", "Wood"));
        blocks.add(new SingleBlock("Blue", "Wood"));
        blocks.add(new SingleBlock("Red", "Metal"));
        blocks.add(new SingleBlock("Gray", "Stone"));
        blocks.add(new SingleBlock("Red", "Brick"));
        Wall wall = new Wall(blocks);

        //When
        int size = wall.findBlocksByMaterial("Wood").size();
        List<Block> materials = wall.findBlocksByMaterial("Wood");

        //Then
        Assert.assertEquals(2, size);
        Assert.assertEquals("Wood", materials.get(1).getMaterial());
    }

    @Test
    public void countTest() {
        //Given
        List<Block> blocks = new ArrayList<>();
        blocks.add(new SingleBlock("Red", "Wood"));
        blocks.add(new SingleBlock("Blue", "Wood"));
        blocks.add(new SingleBlock("Red", "Metal"));
        blocks.add(new SingleBlock("Gray", "Stone"));
        blocks.add(new SingleBlock("Red", "Brick"));
        Wall wall = new Wall(blocks);

        //When
        int size = wall.count();

        //Then
        Assert.assertEquals(5, size);
    }
}
