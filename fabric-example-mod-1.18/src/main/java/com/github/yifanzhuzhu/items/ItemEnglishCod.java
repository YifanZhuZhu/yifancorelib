package com.github.yifanzhuzhu.items;

import com.github.yifanzhuzhu.group.GroupLoader;
import net.minecraft.item.SwordItem;

public class ItemEnglishCod extends SwordItem {
    public ItemEnglishCod() {
        super(CItemTier.COUNTRY, 40, -3.95F, new Settings().group(GroupLoader.COUNTRY));
    }
}
