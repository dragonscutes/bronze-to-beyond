package com.github.dragonscutes.bronzetobeyond;

import com.github.dragonscutes.bronzetobeyond.block.ModBlocks;
import com.github.dragonscutes.bronzetobeyond.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BronzetoBeyond.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.bronzetobeyond"))
            .icon(() -> ModItems.RAW_TIN.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.RAW_TIN.get());
                output.accept(ModItems.TIN_INGOT.get());
                output.accept(ModBlocks.BLOCK_OF_RAW_TIN.get());
                output.accept(ModBlocks.BLOCK_OF_TIN.get());
                output.accept(ModBlocks.TIN_ORE_BLOCK.get());
                output.accept(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get());
                output.accept(ModBlocks.NETHER_TIN_ORE_BLOCK.get());
                output.accept(ModBlocks.END_TIN_ORE_BLOCK.get());
            }).build());
}
