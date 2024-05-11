package ancient.flavored.datagen;

import ancient.flavored.block.ModBlocks;
import ancient.flavored.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        /*Ice Cream Blocks*/
        addDrop(ModBlocks.BERRIES_ICE_CREAM_BLOCK);
        addDrop(ModBlocks.CHOCOLATE_ICE_CREAM_BLOCK);
        addDrop(ModBlocks.HONEY_ICE_CREAM_BLOCK);
        addDrop(ModBlocks.MINT_ICE_CREAM_BLOCK);
        addDrop(ModBlocks.VANILLA_ICE_CREAM_BLOCK);
        addDrop(ModBlocks.WATERMELON_ICE_CREAM_BLOCK);
    }
}