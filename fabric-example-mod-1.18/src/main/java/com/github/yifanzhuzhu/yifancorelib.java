package com.github.yifanzhuzhu;

import com.github.yifanzhuzhu.blocks.BlockLoader;
import com.github.yifanzhuzhu.items.ItemLoader;
import com.github.yifanzhuzhu.ores.FeatureLoader;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yifancorelib implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("yifancorelib");
	@Override
	public void onInitialize()
	{
		new ItemLoader();
		new BlockLoader();
		new FeatureLoader();
		System.out.println("Fuck Fabric world!");
	}
}
