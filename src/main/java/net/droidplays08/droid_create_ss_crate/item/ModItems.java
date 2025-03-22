package net.droidplays08.droid_create_ss_crate.item;

import net.droidplays08.droid_create_ss_crate.Droid_Create_SS_Crate;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Droid_Create_SS_Crate.MOD_ID);

    public static final RegistryObject<Item> INCOMPLETE_NETHER_CRATE = ITEMS.register("incomplete_nether_crate",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
