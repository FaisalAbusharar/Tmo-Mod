package com.voidy.tmo.block;

import com.voidy.tmo.TooManyOresMain;
import com.voidy.tmo.items.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(4.0f).
                    requiresTool()), ModItemGroup.TooManyOres);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name,block,group);
        return Registry.register(Registries.BLOCK, new Identifier(TooManyOresMain.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TooManyOresMain.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));


        ItemGroupEvents.modifyEntriesEvent(group).register(entries
                -> entries.add(item));

        return item;
    }
    public static void registerModBlocks() {
        TooManyOresMain.LOGGER.info("Registering ModBlocks for " + TooManyOresMain.MOD_ID);



    }

}
