package band.of.pros.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Colors;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;

public class PrismaticCoin extends Item {
    public PrismaticCoin(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("The last coin out of the 6!").formatted(Formatting.BLUE));
        } else {
            tooltip.add(Text.literal("a coin from high in the sky | Press Shift for more info!").formatted(Formatting.BLUE));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
