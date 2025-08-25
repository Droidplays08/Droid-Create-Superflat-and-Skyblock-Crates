package net.droidplays08.create_ss_crate.item;

import net.droidplays08.create_ss_crate.CreateSSCrate;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateSSCrate.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
