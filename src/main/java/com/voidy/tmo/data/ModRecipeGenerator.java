package com.voidy.tmo.data;

import com.voidy.tmo.block.ModBlocks;
import com.voidy.tmo.items.ModItems;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerSmelting(exporter, List.of(ModItems.RAW_CITRINE), RecipeCategory.MISC, ModItems.CITRINE, 1f,200,"citrine");
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.CITRINE, RecipeCategory.MISC,ModBlocks.CITRINE_BLOCK);

    offer2x2CompactingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_MAPLE_WOOD, ModBlocks.RED_MAPLE_LOG);

    offerShapelessRecipe(exporter, ModBlocks.RED_MAPLE_PLANKS, ModBlocks.RED_MAPLE_LOG, "BUILD_BLOCKS",4);
    offerShapelessRecipe(exporter, ModBlocks.RED_MAPLE_PLANKS, ModBlocks.RED_MAPLE_WOOD, "BUILD_BLOCKS",4);


        //EMERALD

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE).pattern("SSS").pattern(" C ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL).pattern(" S ").pattern(" C ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_SHOVEL)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_AXE).pattern("SS ").pattern("SC ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_AXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_SWORD).pattern(" S ").pattern(" S ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_SWORD)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_HOE).pattern("SS ").pattern(" C ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_HOE)));

        //CITRINE

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_PICKAXE).pattern("SSS").pattern(" C ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_SWORD).pattern(" S ").pattern(" S ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_SWORD)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_AXE).pattern("SS ").pattern("SC ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_AXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_HOE).pattern("SS ").pattern(" C ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_HOE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_SHOVEL).pattern(" S ").pattern(" C ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_SHOVEL)));




        //FOR FUTURE SHAPED RECIPES
       /* ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_AXE)
                .pattern("SS ")
                .pattern("SC ")
                .pattern(" C ")
                .input('S', ModItems.CITRINE)
                .input('C', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_AXE)));*/



    }
}
