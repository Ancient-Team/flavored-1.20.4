package ancient.flavored.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // translationBuilder.add("item.flavored.flavored_item", "Flavored Item");

        // Tłumaczenie nazwy i opisu moda w Mod Menu
        // translationBuilder.add("modmenu.nameTranslation.flavored", "Flavored");
        // translationBuilder.add("modmenu.descriptionTranslation.flavored", "Flavored Desc...");
    }
}