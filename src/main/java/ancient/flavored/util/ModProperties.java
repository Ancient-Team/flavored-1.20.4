package ancient.flavored.util;

import net.minecraft.state.property.IntProperty;

public class ModProperties {

    public static final IntProperty BITES;




    static {
        BITES = IntProperty.of("bites", 0,3);
    }

}
