package net.ronan.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GOOBER_TAB = new CreativeModeTab("Goober tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MEDS.get());
        }
    };

}
