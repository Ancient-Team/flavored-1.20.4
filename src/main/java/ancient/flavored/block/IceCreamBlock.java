package ancient.flavored.block;

import net.minecraft.block.Block;

public class IceCreamBlock extends Block {
    public IceCreamBlock(Settings settings) {
        super(settings);
    }

    public static final IceCreamBlock VANILLA_ICE_CREAM_BLOCK = new IceCreamBlock(Block.Settings.copy(net.minecraft.block.Blocks.ICE));

    public static final IceCreamBlock CHOCOLATE_ICE_CREAM_BLOCK = new IceCreamBlock(Block.Settings.copy(net.minecraft.block.Blocks.ICE));

    public static final IceCreamBlock WATERMELON_ICE_CREAM_BLOCK = new IceCreamBlock(Block.Settings.copy(net.minecraft.block.Blocks.ICE));

    public static final IceCreamBlock BERRY_ICE_CREAM_BLOCK = new IceCreamBlock(Block.Settings.copy(net.minecraft.block.Blocks.ICE));

    public static final IceCreamBlock MINT_ICE_CREAM_BLOCK = new IceCreamBlock(Block.Settings.copy(net.minecraft.block.Blocks.ICE));

    public static final IceCreamBlock HONEY_ICE_CREAM_BLOCK = new IceCreamBlock(Block.Settings.copy(net.minecraft.block.Blocks.ICE));

}

