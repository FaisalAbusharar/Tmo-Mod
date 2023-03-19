package com.voidy.tmo;

import com.voidy.tmo.block.ModBlocks;
import com.voidy.tmo.items.ModItemGroup;
import com.voidy.tmo.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TooManyOresMain implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "tmo-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("tmo-mod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}