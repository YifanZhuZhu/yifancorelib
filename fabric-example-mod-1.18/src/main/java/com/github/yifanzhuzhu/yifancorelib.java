package com.github.yifanzhuzhu;

import com.github.yifanzhuzhu.blocks.BlockLoader;
import com.github.yifanzhuzhu.items.ItemLoader;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class yifancorelib implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("yifancorelib");
	private static ConfiguredFeature<?, ?> HP_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
			(Feature.ORE, new OreFeatureConfig(
					OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
					BlockLoader.HP_ORE.getDefaultState(),
					9)); // vein size
	public static PlacedFeature HP_ORE_PLACED_FEATURE = new PlacedFeature(
			RegistryEntry.of(HP_ORE_CONFIGURED_FEATURE),
			Arrays.asList(
					CountPlacementModifier.of(5), // number of veins per chunk
					SquarePlacementModifier.of(), // spreading horizontally
					HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
			)); // height
	@Override
	public void onInitialize()
	{
		new ItemLoader();
		new BlockLoader();
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
				new Identifier("yifancorelib", "hp_ore"), HP_ORE_CONFIGURED_FEATURE);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("yifancorelib", "hp_ore"),
				HP_ORE_PLACED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
				RegistryKey.of(Registry.PLACED_FEATURE_KEY,
						new Identifier("yifancorelib", "hp_ore")));
		System.out.println("Fuck Fabric world!");
	}
}
