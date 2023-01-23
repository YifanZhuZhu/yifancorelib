package com.github.yifanzhuzhu.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemLoader {
    public static final Item HG_INGOT = new ItemHgIngot();
    public static final Item GILDING = new ItemGilding();
    public static final Item GILDING_SWORD = new ItemGildingSword();
    public static final Item FRENCHBREAD = new ItemFrenchBread();
    public static final Item ENGLISHCOD = new ItemEnglishCod();
    public static final Item MOONCAKE = new ItemMooncake();
    public static final Item FIVE_NUT_FILLING = new ItemFiveNutFilling();
    public ItemLoader() {
        register("hydrargyrum_ingot", HG_INGOT);
        register("gilding", GILDING);
        register("gilding_sword", GILDING_SWORD);
        register("french_bread",FRENCHBREAD);
        register("english_cod",ENGLISHCOD);
        register("mooncake",MOONCAKE);
        register("five_nut_filling",FIVE_NUT_FILLING);
    }
    private void register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier("yifancorelib", name), item);
    }
}
