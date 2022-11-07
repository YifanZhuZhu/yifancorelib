package com.github.yifanzhuzhu.blocks;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockLoader {
    public static final Block HP_ORE = new BlockHpOre();

    public BlockLoader()
    {
        register("hydrargyrum_ore", HP_ORE);
    }

    private void register(String name, Block block)
    {
        Registry.register(Registry.BLOCK, new Identifier("yifancorelib", name), block);
        Registry.register(Registry.ITEM, new Identifier("yifancorelib", name), new BlockItem(block, new Item.Settings().group(GroupLoader.GILDING)));
    }
}
