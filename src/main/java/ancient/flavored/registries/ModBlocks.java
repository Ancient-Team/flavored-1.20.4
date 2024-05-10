package ancient.flavored.registries;

import ancient.flavored.Flavored;
import ancient.flavored.block.Cake;
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
    // BerriesTart, ChocolateCake, CinnamonCake, MintCake, VanillaCake

    public static Block BERRIES_TART = registerBlock("berries_tart", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block CHOCOLATE_CAKE = registerBlock("chocolate_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block CINNAMON_CAKE = registerBlock("cinnamon_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block HONEY_CAKE = registerBlock("honey_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block MINT_CAKE = registerBlock("mint_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static Block VANILLA_CAKE = registerBlock("vanilla_cake", new Cake(FabricBlockSettings.copyOf(Blocks.CAKE)));


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