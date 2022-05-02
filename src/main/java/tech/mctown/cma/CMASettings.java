package tech.mctown.cma;

import carpet.settings.Rule;

import static carpet.settings.RuleCategory.CREATIVE;
import static carpet.settings.RuleCategory.SURVIVAL;

public class CMASettings {
    static final String CMA = CMAExtension.MODID;

    @Rule(
            desc = "Execute the command on the sign if it's right-clicked by player who is not sneaking nor holding " +
                    "anything in the main hand. Texts must start with '/'.",
            category = {CMA, SURVIVAL}
    )
    public static boolean runCommandOnSign = false;

    @Rule(
            desc = "Player can edit the sign when it's right-clicked if the player is sneaking and not holding anything " +
                    "in the main hand.",
            category = {CMA, SURVIVAL}
    )
    public static boolean editableSign = false;

    @Rule(
            desc = "Observer will be activied when player hold flint and steel and right-clicked it.",
            category = {CMA, CREATIVE}
    )
    public static boolean flintAndSteelActivatesObserver = false;
}
