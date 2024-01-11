package net.ronan.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ronan.tutorialmod.tutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutorialMod.MOD_ID);
    public static final RegistryObject<Item> USED_MEDS = Items.register("used_meds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOOBER_TAB)));
    public static final RegistryObject<Item> MEDS = Items.register("meds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GOOBER_TAB)));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
