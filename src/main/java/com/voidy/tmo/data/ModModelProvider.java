package com.voidy.tmo.data;

import com.voidy.tmo.block.ModBlocks;
import com.voidy.tmo.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CITRINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CITRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_CITRINE_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.RED_MAPLE_LOG).log(ModBlocks.RED_MAPLE_LOG).wood(ModBlocks.RED_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_RED_MAPLE_LOG).log(ModBlocks.STRIPPED_RED_MAPLE_LOG).wood(ModBlocks.STRIPPED_RED_MAPLE_WOOD);


        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.RED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERIUM_ORE);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CITRINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CITRINE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ENDERIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.CITRINE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE_SHOVEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERIUM_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_SHOVEL, Models.GENERATED);


        itemModelGenerator.register(ModItems.EMERALD_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.CITRINE_HELMET,Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE_LEGGINGS,Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE_CHESTPLATE,Models.GENERATED);
        itemModelGenerator.register(ModItems.CITRINE_BOOTS,Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERIUM_HELMET,Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_CHESTPLATE,Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_LEGGINGS,Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_BOOTS,Models.GENERATED);

        itemModelGenerator.register(ModItems.MAPLE_STICK,Models.GENERATED);






    }
}
