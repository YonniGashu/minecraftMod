package com.Vym.firstMod.items;

import com.Vym.firstMod.StartingMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(StartingMod.TAB));
    }
}
