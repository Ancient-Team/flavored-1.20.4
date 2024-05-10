package ancient.flavored.item;

import net.minecraft.item.Item;
import net.minecraft.item.StewItem;

public class IceCream extends StewItem {
    public IceCream(Settings settings) {
        super(settings);
    }

    public static final IceCream VANILLA_ICE_CREAM = new IceCream(new Item.Settings());

    public static final IceCream CHOCOLATE_ICE_CREAM = new IceCream(new Item.Settings());

    public static final IceCream WATERMELON_ICE_CREAM = new IceCream(new Item.Settings());

    public static final IceCream BERRY_ICE_CREAM = new IceCream(new Item.Settings());

    public static final IceCream MINT_ICE_CREAM = new IceCream(new Item.Settings());

    public static final IceCream HONEY_ICE_CREAM = new IceCream(new Item.Settings());
}
