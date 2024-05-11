package ancient.flavored.item;

import ancient.flavored.Flavored;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup FLAVORED = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Flavored.MOD_ID, "flavored"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.flavored"))
                    .icon(() -> new ItemStack(ModItems.CHOCOLATE_BAR)).entries(((displayContext, entries) -> {
                        /* MAIN FLAVORS */
                        entries.add(ModItems.CHOCOLATE_BAR);
                        entries.add(ModItems.MINT);

                        entries.add(ModItems.VANILLA_PODS);
                        entries.add(ModItems.DRIED_VANILLA_PODS);

                        entries.add(ModItems.CINNAMON_CANE);
                        /* ICE CREAMS */
                        entries.add(ModItems.BERRIES_ICE_CREAM);
                        entries.add(ModItems.CHOCOLATE_ICE_CREAM);
                        entries.add(ModItems.HONEY_ICE_CREAM);
                        entries.add(ModItems.MINT_ICE_CREAM);
                        entries.add(ModItems.VANILLA_ICE_CREAM);
                        entries.add(ModItems.WATERMELON_ICE_CREAM);
                        /* CAKE SLICES */
                        entries.add(ModItems.BERRIES_TART_SLICE);
                        entries.add(ModItems.CHOCOLATE_CAKE_SLICE);
                        entries.add(ModItems.CINNAMON_CAKE_SLICE);
                        entries.add(ModItems.HONEY_CAKE_SLICE);
                        entries.add(ModItems.MINT_CAKE_SLICE);
                        entries.add(ModItems.VANILLA_CAKE_SLICE);
                        /* SHAKES */
                        entries.add(ModItems.BERRIES_SHAKE);
                        entries.add(ModItems.CHOCOLATE_SHAKE);
                        entries.add(ModItems.HONEY_SHAKE);
                        entries.add(ModItems.MINT_SHAKE);
                        entries.add(ModItems.VANILLA_SHAKE);
                        entries.add(ModItems.WATERMELON_SHAKE);
                        /* SPECIAL ITEMS */
                        entries.add(ModItems.MINT_FILLED_CHOCOLATE);
                        entries.add(ModItems.VANILLA_FILLED_CHOCOLATE);
                        entries.add(ModItems.MINTS);
                        entries.add(ModItems.MARSHMALLOW);
                        entries.add(ModItems.HOT_CHOCOLATE);
                        entries.add(ModItems.CINNAMON_ROLLS);
                        /* UTILITY ITEMS */
                        entries.add(ModItems.MUG);
                    })).build());

    public static void registerAll() {
        Flavored.LOGGER.info("Registering ItemGroup for " + Flavored.MOD_ID);
    }
}
