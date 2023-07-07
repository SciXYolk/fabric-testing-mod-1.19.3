package net.asurayolk.testingmod.item;

import net.asurayolk.testingmod.TestingMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE;

    public static void registerItemGroups(){
        CITRINE = FabricItemGroup.builder(new Identifier(TestingMod.MOD_ID, "citinre"))
                .displayName(Text.translatable("itemgroup.citrine"))
                .icon(() -> new ItemStack(ModItems.CITRINE)).build();
    }
}
