package com.github.yifanzhuzhu.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemLoader {
    public static final Item HP_INGOT = new ItemHpIngot();
    public static final Item GILDING = new ItemGilding();
    public static final Item GILDING_SWORD = new ItemGildingSword();
    public static final Item FRENCHBREAD = new ItemFrenchBread();
    public static final Item ENGLISHCOD = new ItemEnglishCod();
    public ItemLoader() {
        register("hydrargyrum_ingot", HP_INGOT);
        register("gilding", GILDING);
        register("gilding_sword", GILDING_SWORD);
        register("french_bread",FRENCHBREAD);
        register("english_cod",ENGLISHCOD);
    }
    private void register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier("yifancorelib", name), item);
    }
}
