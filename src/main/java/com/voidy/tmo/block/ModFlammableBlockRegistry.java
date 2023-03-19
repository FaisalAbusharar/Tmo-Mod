package com.voidy.tmo.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.RED_MAPLE_PLANKS, 5,20);
        registry.add(ModBlocks.RED_MAPLE_LOG, 5,20);
        registry.add(ModBlocks.STRIPPED_RED_MAPLE_WOOD, 5,20);
        registry.add(ModBlocks.STRIPPED_RED_MAPLE_LOG, 5,20);
        registry.add(ModBlocks.RED_MAPLE_LEAVES, 5,20);
        registry.add(ModBlocks.RED_MAPLE_WOOD, 5,20);

    }
}
