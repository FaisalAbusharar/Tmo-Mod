package com.voidy.tmo.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippedBlockRegistry {
    public static void strippedBlockRegistry() {
        StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_LOG);
        StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD, ModBlocks.STRIPPED_RED_MAPLE_WOOD);
    }
}
