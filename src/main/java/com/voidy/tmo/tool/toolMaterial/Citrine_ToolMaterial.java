package com.voidy.tmo.tool.toolMaterial;

import com.voidy.tmo.TooManyOresMain;
import com.voidy.tmo.items.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Citrine_ToolMaterial implements ToolMaterial {

    public static final Citrine_ToolMaterial INSTANCE = new Citrine_ToolMaterial();


    @Override
    public int getDurability() {
        return 2500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0F;
    }

    @Override
    public float getAttackDamage() {
        return 4.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.CITRINE);
    }


    public static void registerToolMaterial() {
        TooManyOresMain.LOGGER.info("Registering Mod Material For " + TooManyOresMain.MOD_ID);



    }
}
