package com.github.yifanzhuzhu.items;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.item.SwordItem;

public class ItemGildingSword extends SwordItem {
    public ItemGildingSword() {
        super(MItemTier.GILDING, 6, -2.4F, new Settings().group(GroupLoader.GILDING));
    }
}
