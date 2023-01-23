package com.github.yifanzhuzhu.items;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.item.SwordItem;

public class ItemMooncake extends SwordItem {
    public ItemMooncake() {
        super(CItemTier.COUNTRY, 114513, 114510, new Settings().group(GroupLoader.COUNTRY));
    }
}
