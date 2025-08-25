package net.droidplays08.create_ss_crate.item;

import net.droidplays08.create_ss_crate.CreateSSCrate;
import net.droidplays08.create_ss_crate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateSSCrate.MODID);

    public static final Supplier<CreativeModeTab> CREATE_SS_CRATE_TAB = CREATIVE_MODE_TAB.register("create_ss_crate_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLAZING_NETHER_CRATE.get()))
                    .title(Component.translatable("creativetab.create_ss_crate_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DIRT_CRATE.get());
                        output.accept(ModBlocks.WOOD_CRATE.get());
                        output.accept(ModBlocks.STARTER_CRATE.get());
                        output.accept(ModBlocks.STONE_CRATE.get());
                        output.accept(ModBlocks.ORE_CRATE.get());
                        output.accept(ModBlocks.FARMER_CRATE.get());
                        output.accept(ModBlocks.CREATE_STONE_CRATE.get());
                        output.accept(ModBlocks.NETHER_CRATE.get());
                        output.accept(ModBlocks.BLAZING_NETHER_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_NETHERITE_CRATE.get());
                        output.accept(ModBlocks.NETHERITE_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_SCULK_CRATE.get());
                        output.accept(ModBlocks.SCULK_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_DEEP_DARK_CRATE.get());
                        output.accept(ModBlocks.DEEP_DARK_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_SNIFFER_CRATE.get());
                        output.accept(ModBlocks.SNIFFER_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_OCEAN_CRATE.get());
                        output.accept(ModBlocks.OCEAN_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_SHERD_CRATE.get());
                        output.accept(ModBlocks.SHERD_CRATE.get());
                        output.accept(ModBlocks.INCOMPLETE_ANDESITE_CRATE_SHELL.get());
                        output.accept(ModBlocks.ANDESITE_CRATE_SHELL.get());
                        output.accept(ModBlocks.INCOMPLETE_BRASS_CRATE_SHELL.get());
                        output.accept(ModBlocks.BRASS_CRATE_SHELL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
