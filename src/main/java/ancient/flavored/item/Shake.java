package ancient.flavored.item;

import net.minecraft.item.Item;

public class Shake extends Item {
    public Shake(Settings settings) {
        super(settings);
    }

    public static final Shake VANILLA_SHAKE = new Shake(new Item.Settings());

    public static final Shake CHOCOLATE_SHAKE = new Shake(new Item.Settings());

    public static final Shake BERRY_SHAKE = new Shake(new Item.Settings());

    public static final Shake MINT_SHAKE = new Shake(new Item.Settings());

    public static final Shake WATERMELON_SHAKE = new Shake(new Item.Settings());

    public static final Shake HONEY_SHAKE = new Shake(new Item.Settings());
}
