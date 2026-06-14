package com.github.dragonscutes.bronzetobeyond.block;

import com.github.dragonscutes.bronzetobeyond.BronzetoBeyond;
import com.github.dragonscutes.bronzetobeyond.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BronzetoBeyond.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItems(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //ORES
    public static final DeferredBlock<Block> TIN_ORE_BLOCK = registerBlock("tin_ore", () -> new Block(BlockBehaviour.Properties.of().strength(4f)));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE_BLOCK = registerBlock("deepslate_tin_ore", () -> new Block(BlockBehaviour.Properties.of().strength(4f)));
    public static final DeferredBlock<Block> NETHER_TIN_ORE_BLOCK = registerBlock("nether_tin_ore", () -> new Block(BlockBehaviour.Properties.of().strength(4f)));
    public static final DeferredBlock<Block> END_TIN_ORE_BLOCK = registerBlock("end_tin_ore", () -> new Block(BlockBehaviour.Properties.of().strength(4f)));

    //BLOCKS
    public static final DeferredBlock<Block> BLOCK_OF_RAW_TIN= registerBlock("block_of_raw_tin", () -> new Block(BlockBehaviour.Properties.of().strength(4f)));
    public static final DeferredBlock<Block> BLOCK_OF_TIN= registerBlock("block_of_tin", () -> new Block(BlockBehaviour.Properties.of().strength(4f)));

}
