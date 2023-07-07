package net.asurayolk.testingmod;

import net.asurayolk.testingmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//dada
public class TestingMod implements ModInitializer {
	public static final String MOD_ID = "testingmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testingmod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}