package com.github.yifanzhuzhu.items;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.item.Item;

public class ItemFiveNutFilling extends Item {
    public ItemFiveNutFilling()
    {
        super(new Settings().group(GroupLoader.COUNTRY));
    }
}
