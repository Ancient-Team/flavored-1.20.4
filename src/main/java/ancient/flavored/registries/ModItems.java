package ancient.flavored.registries;

import ancient.flavored.Flavored;
import ancient.flavored.item.CakeSlice;
import ancient.flavored.item.IceCream;
import ancient.flavored.item.Shake;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    /* CAKE SLICES */
    public static final Item BERRIES_TART_SLICE = registerItem("berries_tart_slice", new CakeSlice(new FabricItemSettings()));
    public static final Item CHOCOLATE_CAKE_SLICE = registerItem("chocolate_cake_slice", new CakeSlice(new FabricItemSettings()));
    public static final Item CINNAMON_CAKE_SLICE = registerItem("cinnamon_cake_slice", new CakeSlice(new FabricItemSettings()));
    public static final Item HONEY_CAKE_SLICE = registerItem("honey_cake_slice", new CakeSlice(new FabricItemSettings()));
    public static final Item MINT_CAKE_SLICE = registerItem("mint_cake_slice", new CakeSlice(new FabricItemSettings()));
    public static final Item VANILLA_CAKE_SLICE = registerItem("vanilla_cake_slice", new CakeSlice(new FabricItemSettings()));

    /* ICE CREAMS */
    public static Item BERRIES_ICE_CREAM = registerItem("berries_ice_cream", new IceCream(new FabricItemSettings()));
    public static Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream", new IceCream(new FabricItemSettings()));
    public static Item CINNAMON_ICE_CREAM = registerItem("cinnamon_ice_cream", new IceCream(new FabricItemSettings()));
    public static Item HONEY_ICE_CREAM = registerItem("honey_ice_cream", new IceCream(new FabricItemSettings()));
    public static Item MINT_ICE_CREAM = registerItem("mint_ice_cream", new IceCream(new FabricItemSettings()));
    public static Item VANILLA_ICE_CREAM = registerItem("vanilla_ice_cream", new IceCream(new FabricItemSettings()));
    public static Item WATERMELON_ICE_CREAM = registerItem("watermelon_ice_cream", new IceCream(new FabricItemSettings()));

    /* SHAKES */
    public static Item BERRIES_SHAKE = registerItem("berries_shake", new Shake(new FabricItemSettings()));
    public static Item CHOCOLATE_SHAKE = registerItem("chocolate_shake", new Shake(new FabricItemSettings()));
    public static Item CINNAMON_SHAKE = registerItem("cinnamon_shake", new Shake(new FabricItemSettings()));
    public static Item HONEY_SHAKE = registerItem("honey_shake", new Shake(new FabricItemSettings()));
    public static Item MINT_SHAKE = registerItem("mint_shake", new Shake(new FabricItemSettings()));
    public static Item VANILLA_SHAKE = registerItem("vanilla_shake", new Shake(new FabricItemSettings()));
    public static Item WATERMELON_SHAKE = registerItem("watermelon_shake", new Shake(new FabricItemSettings()));

    public static final Item HOT_CHOCOLATE = registerItem("hot_chocolate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Flavored.MOD_ID, name), item);
    }

    public static void registerAll() {
        Flavored.LOGGER.info("Registering Items for " + Flavored.MOD_ID);
    }
}
