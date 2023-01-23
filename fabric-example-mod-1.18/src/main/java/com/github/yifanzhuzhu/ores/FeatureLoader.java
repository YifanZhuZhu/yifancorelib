package com.github.yifanzhuzhu.ores;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

import static com.github.yifanzhuzhu.ores.OreFeature.HG_ORE_CONFIGURED_FEATURE;
import static com.github.yifanzhuzhu.ores.OreFeature.HG_ORE_PLACED_FEATURE;

public class FeatureLoader {
    public FeatureLoader() {
        register("hg_ore",HG_ORE_CONFIGURED_FEATURE,HG_ORE_PLACED_FEATURE);
    }
    private void register(String name, ConfiguredFeature<?, ?> ORE_CONFIGURED_FEATURE, PlacedFeature ORE_PLACED_FEATURE) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("yifancorelib", name), ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("yifancorelib", name),
                ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("yifancorelib", name)));
    }
}
