package GamePackage.Card;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public enum Cards {
    DEATHOFPOWER("DeathOfPower"),
    IMPSOFTHEMIST("ImpsOfTheMist"),
    CANASTA("Canasta"),
    MENACINGCHAOS("MenacingChaos"),
    HUNTERSOFETERNITY("HuntersOfEternity"),
    KOBOLDSWORD("KoboldSorrow"),
    WIZARDWARS("WizardWars"),
    CONTRACTBRIDGE("ContractBridge"),
    GNOLLSANDFLAMES("GnollsAndFlames"),
    DIAMONDBONSE("DiamondBones"),
    FEASTSOFHOPE("FeastsOfHope"),
    PONTOON("Pontoon"),
    HORROROFFROST("HorrorOfFrost"),
    WITCHACTION("WitchAction"),
    OGRESOFGOLD("OgresOfGold"),
    TOWERSOFFIRE("TowersOfFire"),
    DEFENDERSOFCREATION("DefendersOfCreation"),
    SHALLOWCREATURES("ShallowCreatures"),
    CHAOSBLADE("ChaosBlades"),
    CHAINOMENS("ChainOmens"),
    CREATURESOFFICE("CreaturesOfIce"),
    POKER("Poker"),
    QUINZE("Quinze"),
    MONTE("Monte"),
    SPOILFIVE("Spoilfive"),
    LETHALDUNGEONS("LethalDungeons"),
    EUCHRE("Euchre"),
    BAZIQUE("Bazique"),
    VOLTILEDEATH("VoltileDeath"),
    ORNAMENTS("Ornaments");

    private final String name;
    Cards(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Collection<String> getNames() {
        return Arrays
                .stream(Cards.values())
                .map(c -> c.getName())
                .collect(Collectors.toList());
    }
}
