package net.xunren.redeemer.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.xunren.redeemer.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab CRYSTALIRON_TAB = new CreativeModeTab("crystalirontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CRYSTALIRON_ORE.get());
        }
    };
}
