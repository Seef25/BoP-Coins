package band.of.pros.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import band.of.pros.BoPCoins;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BoPCoinsGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BoPCoins.MOD_ID, "gold"),
            FabricItemGroup.builder().displayName(Text.translatable("BoP Coins"))
                    .icon(() -> new ItemStack(ModItems.GOLD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLD);
                        entries.add(ModItems.LEMON);
                        entries.add(ModItems.SHROOM);
                        entries.add(ModItems.SOOF);
                        entries.add(ModItems.NETHERITE);
                        entries.add(ModItems.PRISMATIC);
                    }).build());


    public static void registerItemGroups() {
        BoPCoins.LOGGER.info("Registering Item Groups for " + BoPCoins.MOD_ID);
    }
}