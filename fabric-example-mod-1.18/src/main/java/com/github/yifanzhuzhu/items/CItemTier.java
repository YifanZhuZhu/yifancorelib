package com.github.yifanzhuzhu.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import org.apache.logging.log4j.util.Supplier;

public enum CItemTier implements ToolMaterial
{
    COUNTRY(3, 700, 4.0F, 0.0F, 65536, () -> {
        return Ingredient.ofItems(ItemLoader.FRENCHBREAD);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    CItemTier(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient)
    {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability()
    {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier()
    {
        return this.miningSpeed;
    }

    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    public int getMiningLevel()
    {
        return this.miningLevel;
    }

    public int getEnchantability()
    {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }
}