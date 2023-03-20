package com.voidy.tmo.items;

import com.voidy.tmo.TooManyOresMain;
import com.voidy.tmo.tool.toolMaterial.Citrine_ToolMaterial;
import com.voidy.tmo.tool.toolBase.Pickaxe_Base;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings()));


    public static ToolItem CITRINE_PICKAXE_BASE = new Pickaxe_Base(Citrine_ToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());


    public static final Item CITRINE_PICKAXE = registerItem("citrine_pickaxe",
            CITRINE_PICKAXE_BASE);


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TooManyOresMain.MOD_ID, name), item);

    }


    public static void addItemsToItemGroup() {

        addToItemGroup(ModItemGroup.TooManyOres, CITRINE);
        addToItemGroup(ModItemGroup.TooManyOres, RAW_CITRINE);
        addToItemGroup(ModItemGroup.TooManyOres, CITRINE_PICKAXE);


    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }



    public static void registerModItems() {


        TooManyOresMain.LOGGER.info("Registering Mod Items For " + TooManyOresMain.MOD_ID);
        addItemsToItemGroup();

    }
}
