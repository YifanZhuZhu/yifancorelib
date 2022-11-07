package com.github.yifanzhuzhu.group;

import com.github.yifanzhuzhu.items.ItemLoader;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class GroupLoader {
    public static final ItemGroup GILDING = FabricItemGroupBuilder.build(
            new Identifier("yifancorelib", "gilding_group"),
            () -> new ItemStack(ItemLoader.GILDING));
    public static final ItemGroup COUNTRY = FabricItemGroupBuilder.build(
            new Identifier("yifancorelib", "country_group"),
            () -> new ItemStack(ItemLoader.FRENCHBREAD));
}
