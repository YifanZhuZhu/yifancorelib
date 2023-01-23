package com.github.yifanzhuzhu.items;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.item.Item;

public class ItemHgIngot extends Item {
    public ItemHgIngot()
    {
        super(new Settings().group(GroupLoader.GILDING));
    }
}
