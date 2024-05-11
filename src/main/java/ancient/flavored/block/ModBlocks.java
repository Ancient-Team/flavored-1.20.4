package ancient.flavored.block;

import ancient.flavored.Flavored;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    /* CAKES */
    public static Block BERRIES_TART = registerBlock("berries_tart", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block CHOCOLATE_CAKE = registerBlock("chocolate_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block CINNAMON_CAKE = registerBlock("cinnamon_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block HONEY_CAKE = registerBlock("honey_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block MINT_CAKE = registerBlock("mint_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block VANILLA_CAKE = registerBlock("vanilla_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));

    /* ICE CREAM BLOCKS */
    public static Block BERRIES_ICE_CREAM_BLOCK = registerBlock("berries_ice_cream_block", new IceCreamBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static Block CHOCOLATE_ICE_CREAM_BLOCK = registerBlock("chocolate_ice_cream_block", new IceCreamBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static Block HONEY_ICE_CREAM_BLOCK = registerBlock("honey_ice_cream_block", new IceCreamBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static Block MINT_ICE_CREAM_BLOCK = registerBlock("mint_ice_cream_block", new IceCreamBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static Block VANILLA_ICE_CREAM_BLOCK = registerBlock("vanilla_ice_cream_block", new IceCreamBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static Block WATERMELON_ICE_CREAM_BLOCK = registerBlock("watermelon_ice_cream_block", new IceCreamBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Flavored.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Flavored.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerAll() {
        Flavored.LOGGER.info("Registering Blocks for " + Flavored.MOD_ID);
    }
}