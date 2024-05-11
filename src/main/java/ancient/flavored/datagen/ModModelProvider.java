package ancient.flavored.datagen;

import ancient.flavored.block.ModBlocks;
import ancient.flavored.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /* ICE CREAM BLOCKS */
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BERRIES_ICE_CREAM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHOCOLATE_ICE_CREAM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HONEY_ICE_CREAM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MINT_ICE_CREAM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VANILLA_ICE_CREAM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WATERMELON_ICE_CREAM_BLOCK);

        /* CAKE BLOCKS */


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        /* MAIN FLAVORS */
        itemModelGenerator.register(ModItems.CHOCOLATE_BAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT, Models.GENERATED);

        itemModelGenerator.register(ModItems.VANILLA_PODS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_VANILLA_PODS, Models.GENERATED);

        itemModelGenerator.register(ModItems.CINNAMON_CANE, Models.GENERATED);

        /* CAKE SLICES */
        itemModelGenerator.register(ModItems.BERRIES_TART_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_CAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CINNAMON_CAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONEY_CAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT_CAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VANILLA_CAKE_SLICE, Models.GENERATED);

        /* ICE CREAMS */
        itemModelGenerator.register(ModItems.BERRIES_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONEY_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.VANILLA_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATERMELON_ICE_CREAM, Models.GENERATED);

        /* SHAKES */
        itemModelGenerator.register(ModItems.BERRIES_SHAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_SHAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONEY_SHAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT_SHAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VANILLA_SHAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATERMELON_SHAKE, Models.GENERATED);

        /* SPECIAL ITEMS */
        itemModelGenerator.register(ModItems.MINT_FILLED_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VANILLA_FILLED_CHOCOLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.MINTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.MARSHMALLOW, Models.GENERATED);

        itemModelGenerator.register(ModItems.HOT_CHOCOLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.CINNAMON_ROLLS, Models.GENERATED);

        /* UTILITY ITEMS */

        itemModelGenerator.register(ModItems.MUG, Models.GENERATED);
    }

}