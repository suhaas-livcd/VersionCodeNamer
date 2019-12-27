package com.hosteloha.versioncodenamerlib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VersionCodeNamer {

    private String versionNameIs = null;

    public VersionCodeNamer(int versionCode, VersioningType versionType) {
        String fetchedNameIs = getNameFromList(versionCode, versionType);
        this.versionNameIs = fetchedNameIs == null ? "Error" : fetchedNameIs;
    }

    /**
     * @param versionCode
     * @param versionType
     * @return
     */
    public static String getName(int versionCode, VersioningType versionType) {
        VersionCodeNamer mVersionCodeNamer = new VersionCodeNamer(versionCode, versionType);
        return mVersionCodeNamer.versionNameIs;
    }

    private String getNameFromList(int versionCode, VersioningType versionType) {
        switch (versionType) {
            case CHEMICAL_ELEMENTS:
                return getChemicalElements(versionCode);
            case NUMBERS_IN_WORDS:
                break;
        }
        return null;
    }

    static final List<String> chemicalElements = new ArrayList(Arrays.asList("Actinium", "Aluminium", "Americium", "Antimony", "Argon",
            "Arsenic", "Astatine", "Barium", "Berkelium", "Beryllium", "Bismuth", "Bohrium", "Boron", "Bromine", "Cadmium",
            "Caesium", "Calcium", "Californium", "Carbon", "Cerium", "Chlorine", "Chromium", "Cobalt", "Copernicium",
            "Copper", "Curium", "Darmstadtium", "Dubnium", "Dysprosium", "Einsteinium", "Erbium", "Europium",
            "Fermium", "Flerovium", "Fluorine", "Francium", "Gadolinium", "Gallium", "Germanium", "Gold", "Hafnium",
            "Hassium", "Helium", "Holmium", "Hydrogen", "Indium", "Iodine", "Iridium", "Iron", "Krypton", "Lanthanum",
            "Lawrencium", "Lead", "Lithium", "Livermorium", "Lutetium", "Magnesium", "Manganese", "Meitnerium",
            "Mendelevium", "Mercury", "Molybdenum", "Moscovium", "Neodymium", "Neon", "Neptunium", "Nickel",
            "Nihonium", "Niobium", "Nitrogen", "Nobelium", "Oganesson", "Osmium", "Oxygen", "Palladium", "Phosphorus",
            "Platinum", "Plutonium", "Polonium", "Potassium", "Praseodymium", "Promethium", "Protactinium", "Radium",
            "Radon", "Rhenium", "Rhodium", "Roentgenium", "Rubidium", "Ruthenium", "Rutherfordium", "Samarium", "Scandium",
            "Seaborgium", "Selenium", "Silicon", "Silver", "Sodium", "Strontium", "Sulfur", "Tantalum", "Technetium",
            "Tellurium", "Tennessine", "Terbium", "Thallium", "Thorium", "Thulium", "Tin", "Titanium", "Tungsten", "Uranium",
            "Vanadium", "Xenon", "Ytterbium", "Yttrium", "Zinc", "Zirconium"));

    private String getChemicalElements(int versionCode) {
        if (chemicalElements.size() >= versionCode) {
            return chemicalElements.get(versionCode);
        }
        return null;
    }
}
