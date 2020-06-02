package io.github.epbxiii.craftable_saddle;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftableSaddle implements ModInitializer {
	public static final String MODID = "craftable_saddle";

	@Override
	public void onInitialize() {
		//register items
		Registry.register(Registry.ITEM, new Identifier(MODID, "saddle_tree"), CraftableSaddleItems.SADDLE_TREE);
	}
}
