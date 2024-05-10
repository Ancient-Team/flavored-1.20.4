package ancient.flavored.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class CakeSlice extends Item {
    public CakeSlice(Settings settings) {
        super(settings.food(new FoodComponent.Builder().hunger(5).saturationModifier(0.1F).build()));
    }
}
