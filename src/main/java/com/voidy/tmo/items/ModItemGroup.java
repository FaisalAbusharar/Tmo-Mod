package com.voidy.tmo.items;

import com.voidy.tmo.TooManyOresMain;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup TooManyOres;

    public static void registerItemGroups() {
        TooManyOres = FabricItemGroup.builder(new Identifier(TooManyOresMain.MOD_ID, "citrine"))
                .displayName(Text.translatable("Too Many Ores"))
                .icon(() -> new ItemStack(ModItems.CITRINE)).build();
    }
}
