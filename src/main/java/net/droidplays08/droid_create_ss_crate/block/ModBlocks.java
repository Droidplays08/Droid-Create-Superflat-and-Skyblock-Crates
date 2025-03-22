package net.droidplays08.droid_create_ss_crate.block;

import net.droidplays08.droid_create_ss_crate.Droid_Create_SS_Crate;
import net.droidplays08.droid_create_ss_crate.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Droid_Create_SS_Crate.MOD_ID);

    public static final RegistryObject<Block> DIRT_CRATE = registerBlock("dirt_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> BEGINNER_CRATE = registerBlock("beginner_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> STARTER_CRATE = registerBlock("starter_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> STONE_CRATE = registerBlock("stone_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> NETHER_CRATE = registerBlock("nether_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> ORE_CRATE = registerBlock("ore_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> BLAZING_NETHER_CRATE = registerBlock("blazing_nether_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> FARMER_CRATE = registerBlock("farmer_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> CREATE_STONE_CRATE = registerBlock("create_stone_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> NETHERITE_CRATE = registerBlock("netherite_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> SCULK_CRATE = registerBlock("sculk_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> SHERD_CRATE = registerBlock("sherd_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> SNIFFER_CRATE = registerBlock("sniffer_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)
            ));
    public static final RegistryObject<Block> DEEP_DARK_CRATE = registerBlock("deep_dark_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> OCEAN_CRATE = registerBlock("ocean_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> ANDESITE_CRATE_SHELL = registerBlock("andesite_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> BRASS_CRATE_SHELL = registerBlock("brass_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> INCOMPLETE_BRASS_CRATE_SHELL = registerBlock("incomplete_brass_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> INCOMPLETE_ANDESITE_CRATE_SHELL = registerBlock("incomplete_andesite_crate_shell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> INCOMPLETE_NETHERITE_CRATE = registerBlock("incomplete_netherite_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> INCOMPLETE_SNIFFER_CRATE = registerBlock("incomplete_sniffer_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> INCOMPLETE_SHERD_CRATE = registerBlock("incomplete_sherd_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));
    public static final RegistryObject<Block> INCOMPLETE_SCULK_CRATE = registerBlock("incomplete_sculk_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));
    public static final RegistryObject<Block> INCOMPLETE_DEEP_DARK_CRATE = registerBlock("incomplete_deep_dark_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    public static final RegistryObject<Block> INCOMPLETE_OCEAN_CRATE = registerBlock("incomplete_ocean_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1.0F,2F)
                    .noOcclusion()
                    .mapColor(MapColor.PODZOL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
