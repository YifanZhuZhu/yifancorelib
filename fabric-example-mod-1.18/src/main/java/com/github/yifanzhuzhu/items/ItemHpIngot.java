package com.github.yifanzhuzhu.items;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.item.Item;

public class ItemHpIngot extends Item {
    public ItemHpIngot()
    {
        super(new Settings().group(GroupLoader.GILDING));
    }
}
