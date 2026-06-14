package com.github.dragonscutes.bronzetobeyond.item;

import com.github.dragonscutes.bronzetobeyond.BronzetoBeyond;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BronzetoBeyond.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
}
