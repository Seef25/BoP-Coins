package band.of.pros;

import band.of.pros.item.ModItemGroup;
import band.of.pros.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoPCoins implements ModInitializer {
	public static final String MOD_ID = "bopcoins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
	}
}