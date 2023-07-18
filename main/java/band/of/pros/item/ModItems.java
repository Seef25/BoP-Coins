package band.of.pros.item;

import band.of.pros.BoPCoins;
import band.of.pros.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.extensibility.IRemapper;

public class ModItems {
    public static final Item GOLD = registerItem("goldcoin", new GoldCoin(new FabricItemSettings()));
    public static final Item LEMON = registerItem("lemoncoin", new LemonCoin(new FabricItemSettings()));
    public static final Item SHROOM = registerItem("shroomcoin", new ShroomCoin(new FabricItemSettings()));
    public static final Item SOOF = registerItem("soofcoin", new SoofCoin(new FabricItemSettings()));
    public static final Item NETHERITE = registerItem("netheritecoin", new NetheriteCoin(new FabricItemSettings()));
    public static final Item PRISMATIC = registerItem("prismaticcoin", new PrismaticCoin(new FabricItemSettings()));


    private static void addItemsToBoPCoinsTabItemGroup(FabricItemGroupEntries entries) {
         entries.add(GOLD);
         entries.add(LEMON);
         entries.add(SHROOM);
         entries.add(SOOF);
         entries.add(NETHERITE);
         entries.add(PRISMATIC);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoPCoins.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BoPCoins.LOGGER.info("Registering mod items for" + BoPCoins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToBoPCoinsTabItemGroup);
    }
}
