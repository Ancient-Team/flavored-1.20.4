package ancient.flavored.registries;

import ancient.flavored.Flavored;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HOT_CHOCOLATE = registerItem("hot_chocolate", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Flavored.MOD_ID, name), item);
    }

    public static void registerAll() {
        Flavored.LOGGER.info("Registering Items for " + Flavored.MOD_ID);
    }
}
