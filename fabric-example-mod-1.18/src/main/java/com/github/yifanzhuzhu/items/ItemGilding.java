package com.github.yifanzhuzhu.items;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.item.Item;

public class ItemGilding extends Item {
    public ItemGilding()
    {
        super(new Settings().group(GroupLoader.GILDING));
    }
}
