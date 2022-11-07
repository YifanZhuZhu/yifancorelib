package com.github.yifanzhuzhu.items;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.item.SwordItem;

public class ItemFrenchBread extends SwordItem {
    public ItemFrenchBread() {
        super(CItemTier.COUNTRY, 20, -3.9F, new Settings().group(GroupLoader.COUNTRY));
    }
}
