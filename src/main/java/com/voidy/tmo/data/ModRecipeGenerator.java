package com.voidy.tmo.data;

import com.voidy.tmo.block.ModBlocks;
import com.voidy.tmo.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
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



        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE).pattern("SSS").pattern(" C ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL).pattern(" S ").pattern(" C ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_SHOVEL)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_AXE).pattern("SS ").pattern("SC ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_AXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_SWORD).pattern(" S ").pattern(" S ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_SWORD)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_HOE).pattern("SS ").pattern(" C ").pattern(" C ").input('S', Items.EMERALD).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_PICKAXE).pattern("SSS").pattern(" C ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_SWORD).pattern(" S ").pattern(" S ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_SWORD)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_AXE).pattern("SS ").pattern("SC ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_HOE).pattern("SS ").pattern(" C ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_SHOVEL).pattern(" S ").pattern(" C ").pattern(" C ").input('S', ModItems.CITRINE).input('C', Items.STICK).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_HELMET).pattern("SSS").pattern("S S").pattern("   ").input('S', ModItems.CITRINE).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_CHESTPLATE).pattern("S S").pattern("SSS").pattern("SSS").input('S', ModItems.CITRINE).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_LEGGINGS).pattern("SSS").pattern("S S").pattern("S S").input('S', ModItems.CITRINE).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CITRINE_BOOTS).pattern("   ").pattern("S S").pattern("S S").input('S', ModItems.CITRINE).criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE), FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CITRINE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_HELMET).pattern("SSS").pattern("S S").pattern("   ").input('S', Items.EMERALD).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_CHESTPLATE).pattern("S S").pattern("SSS").pattern("SSS").input('S', Items.EMERALD).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_LEGGINGS).pattern("SSS").pattern("S S").pattern("S S").input('S', Items.EMERALD).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMERALD_BOOTS).pattern("   ").pattern("S S").pattern("S S").input('S', Items.EMERALD).criterion(FabricRecipeProvider.hasItem(Items.EMERALD), FabricRecipeProvider.conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.EMERALD_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CURSED_STAR).pattern("XVX").pattern("VSV").pattern("XVX").input('S', Items.NETHER_STAR).input('V', ModItems.ENDERIUM).input('X', Items.DIAMOND).criterion(FabricRecipeProvider.hasItem(Items.NETHER_STAR), FabricRecipeProvider.conditionsFromItem(Items.NETHER_STAR)).criterion(FabricRecipeProvider.hasItem(ModItems.ENDERIUM), FabricRecipeProvider.conditionsFromItem(ModItems.ENDERIUM)).criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), FabricRecipeProvider.conditionsFromItem(Items.DIAMOND)).offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CURSED_STAR)));


        //FOR FUTURE SHAPED RECIPES
      /* ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MAPLE_STICK)
                .pattern("   ")
                .pattern(" S  ")
                .pattern(" S ")
                .input('S', ModBlocks.RED_MAPLE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RED_MAPLE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.RED_MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MAPLE_STICK)));*/




    }
}
