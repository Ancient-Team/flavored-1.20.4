package ancient.flavored.block;

import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class IceCreamBlock extends Block {
    public IceCreamBlock(Settings settings) {
        super(settings.sounds(BlockSoundGroup.SNOW).strength(0.5F).nonOpaque());
    }

}

