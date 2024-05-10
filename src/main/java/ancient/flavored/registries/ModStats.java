package ancient.flavored.registries;

import ancient.flavored.Flavored;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;

public class ModStats {

    public static Identifier INTERACT_WITH_FREEZING_KEETLE;

    private static Identifier register(String id, StatFormatter formatter) {
        Identifier identifier = new Identifier(Flavored.MOD_ID, id);
        Registry.register(Registries.CUSTOM_STAT, id, identifier);
        Stats.CUSTOM.getOrCreateStat(identifier, formatter);
        return identifier;
    }

    static {
        INTERACT_WITH_FREEZING_KEETLE = register("interact_with_freezing_keetle", StatFormatter.DEFAULT);
    }
}
