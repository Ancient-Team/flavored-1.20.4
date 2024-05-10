package ancient.flavored.item;

import net.minecraft.item.Item;

public class CakeSlice extends Item {
    public CakeSlice(Settings settings) {
        super(settings);
    }

    public static final CakeSlice VANILLA_CAKE_SLICE = new CakeSlice(new Item.Settings());

    public static final CakeSlice CHOCOLATE_CAKE_SLICE = new CakeSlice(new Item.Settings());

    public static final CakeSlice BERRY_TART_SLICE = new CakeSlice(new Item.Settings());

    public static final CakeSlice MINT_CAKE_SLICE = new CakeSlice(new Item.Settings());

    public static final CakeSlice HONEY_CAKE_SLICE = new CakeSlice(new Item.Settings());

    public static final CakeSlice CINNAMON_CAKE_SLICE = new CakeSlice(new Item.Settings());
}
