package net.droidplays08.droid_create_ss_crate.item;

import net.droidplays08.droid_create_ss_crate.Droid_Create_SS_Crate;
import net.droidplays08.droid_create_ss_crate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Droid_Create_SS_Crate.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DROID_CREATE_SS_CRATE_TAB = CREATIVE_MODE_TABS.register("droid_create_ss_crate_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.DIRT_CRATE.get()))
                    .title(Component.translatable("creativetab.droid_create_ss_crate_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DIRT_CRATE.get());
                        output.accept(ModBlocks.BEGINNER_CRATE.get());
                        output.accept(ModBlocks.STARTER_CRATE.get());
                        output.accept(ModBlocks.STONE_CRATE.get());
                        output.accept(ModBlocks.ORE_CRATE.get());
                        output.accept(ModBlocks.FARMER_CRATE.get());
                        output.accept(ModBlocks.CREATE_STONE_CRATE.get());
                        output.accept(ModBlocks.NETHER_CRATE.get());
                        output.accept(ModBlocks.ELITE_NETHER_CRATE.get());
                        output.accept(ModBlocks.LEGENDARY_NETHER_CRATE.get());
                        output.accept(ModBlocks.SCULK_CRATE.get());
                        output.accept(ModBlocks.DEEP_DARK_CRATE.get());
                        output.accept(ModBlocks.RUIN_CRATE.get());
                        output.accept(ModBlocks.OCEAN_CRATE.get());
                        output.accept(ModBlocks.SHERD_CRATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
