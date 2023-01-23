package com.github.yifanzhuzhu.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BlockHgOre extends Block {
    public BlockHgOre() {
        super(FabricBlockSettings.of(Material.STONE).strength(4.0f, 4.0f));
    }
}
