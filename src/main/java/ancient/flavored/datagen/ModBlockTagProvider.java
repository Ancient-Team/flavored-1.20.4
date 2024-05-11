package ancient.flavored.datagen;

import ancient.flavored.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.BERRIES_ICE_CREAM_BLOCK)
            .add(ModBlocks.CHOCOLATE_ICE_CREAM_BLOCK)
            .add(ModBlocks.HONEY_ICE_CREAM_BLOCK)
            .add(ModBlocks.MINT_ICE_CREAM_BLOCK)
            .add(ModBlocks.VANILLA_ICE_CREAM_BLOCK)
            .add(ModBlocks.WATERMELON_ICE_CREAM_BLOCK);

        getOrCreateTagBuilder(BlockTags.SNOW)
            .add(ModBlocks.BERRIES_ICE_CREAM_BLOCK)
            .add(ModBlocks.CHOCOLATE_ICE_CREAM_BLOCK)
            .add(ModBlocks.HONEY_ICE_CREAM_BLOCK)
            .add(ModBlocks.MINT_ICE_CREAM_BLOCK)
            .add(ModBlocks.VANILLA_ICE_CREAM_BLOCK)
            .add(ModBlocks.WATERMELON_ICE_CREAM_BLOCK);



    }
}