package com.data;

import lombok.Getter;

@Getter
public enum BoostOption
{
    ATTACK_CAPE("Attack cape", false, SkillBoost.ATTACK_CAPE),
    ATTACK_POTION("Attack potion", true, SkillBoost.ATTACK_POTION),
    CUP_OF_TEA("Cup of tea", false, SkillBoost.CUP_OF_TEA),
    RUBY_HARVEST("Ruby harvest", false, SkillBoost.RUBY_HARVEST),
    SUPER_ATTACK("Super attack", true, SkillBoost.SUPER_ATTACK),

    STRENGTH_CAPE("Strength cape", false, SkillBoost.STRENGTH_CAPE),
    DRAGON_BATTLEAXE("Dragon battleaxe", true, SkillBoost.DRAGON_BATTLEAXE),
    BEER("Beer", false, SkillBoost.BEER_STRENGTH),
    BLACK_WARLOCK("Black warlock", false, SkillBoost.BLACK_WARLOCK),
    STRENGTH_POTION("Strength potion", true, SkillBoost.STRENGTH_POTION),
    SUPER_STRENGTH("Super Strength", true, SkillBoost.SUPER_STRENGTH),
    KEG_OF_BEER("Keg of beer", false, SkillBoost.KEG_OF_BEER_STRENGTH),

    DEFENCE_CAPE("Defence cape", false, SkillBoost.DEFENCE_CAPE),
    DEFENCE_POTION("Defence potion", true, SkillBoost.DEFENCE_POTION),
    SAPPHIRE_GLACIALIS("Sapphire Glacialis", false, SkillBoost.SAPPHIRE_GLACIALIS),
    SUPER_DEFENCE("Super defence", true, SkillBoost.SUPER_DEFENCE),
    SARADOMIN_BREW("Saradomin brew", true, SkillBoost.SARADOMIN_BREW_DEFENCE),

    RANGING_CAPE("Ranging cape", false, SkillBoost.RANGING_CAPE),
    RANGING_POTION("Ranging potion", true, SkillBoost.RANGING_POTION),
    SUPER_RANGING("Super ranging", true, SkillBoost.SUPER_RANGING_POTION),
    WILD_PIE("Wild pie", false, SkillBoost.WILD_PIE),
    TWISTED_MINUS("Twisted (-)", false, SkillBoost.TWISTED_MINUS),
    TWISTED("Twisted", false, SkillBoost.TWISTED),
    TWISTED_PLUS("Twisted (+)", false, SkillBoost.TWISTED_PLUS),

    MAGIC_CAPE("Magic cape", false, SkillBoost.MAGIC_CAPE),
    WIZARDS_MIND_BOMB("Wizard's mind bomb", false, SkillBoost.WIZARDS_MIND_BOMB),
    MAGIC_ESSENCE("Magic essence", false, SkillBoost.MAGIC_ESSENCE),
    MATURE_WIZARDS_MIND_BOMB("Mature Wizard's mind bomb", false, SkillBoost.MATURE_WIZARDS_MIND_BOMB),
    MAGIC_POTION("Magic Potion", true, SkillBoost.MAGIC_POTION),
    IMBUED_HEART("Imbued heart", true, SkillBoost.IMBUED_HEART),
    SUPER_MAGIC_POTION("Super Magic Potion", true, SkillBoost.SUPER_MAGIC_POTION),
    KODAI_MINUS("Kodai (-)", false, SkillBoost.KODAI_MINUS),
    KODAI("Kodai", false, SkillBoost.KODAI),
    KODAI_PLUS("Kodai (+)", false, SkillBoost.KODAI_PLUS),

    MINING_CAPE("Mining cape", false, SkillBoost.MINING_CAPE),
    DWARVEN_STOUT("Dwarven stout", false, SkillBoost.DWARVEN_STOUT),
    MATURE_DWARVEN_STOUT("Mature dwarven stout", false, SkillBoost.MATURE_DWARVEN_STOUT),
    DRAGON_PICKAXE("Dragon pickaxe", true, SkillBoost.DRAGON_PICKAXE),

    BLOOD_PINT("Blood pint", false, SkillBoost.BLOOD_PINT_ATTACK, SkillBoost.BLOOD_PINT_STRENGTH),
    JANGERBERRIES("Jangerberries", false, SkillBoost.JANGERBERRIES_ATTACK, SkillBoost.JANGERBERRIES_STRENGTH),
    BRAINDEATH_RUM("Braindeath 'rum'", false, SkillBoost.BRAINDEATH_RUM_STRENGTH, SkillBoost.BRAINDEATH_RUM_MINING),
    ZAMORAK_BREW("Zamorak brew", true, SkillBoost.ZAMORAK_BREW_ATTACK, SkillBoost.ZAMORAK_BREW_STRENGTH),
    BATTLEMAGE_POTION("Battlemage potion", false, SkillBoost.MAGIC_POTION, SkillBoost.SUPER_DEFENCE),
    BASTION_POTION("Bastion potion", false, SkillBoost.RANGING_POTION, SkillBoost.SUPER_DEFENCE),

    COMBAT_POTION("Combat potion", true, SkillBoost.ATTACK_POTION, SkillBoost.STRENGTH_POTION, SkillBoost.DEFENCE_POTION),
    SUPER_COMBAT_POTION("Super combat potion", true, SkillBoost.SUPER_ATTACK, SkillBoost.SUPER_STRENGTH, SkillBoost.SUPER_DEFENCE),
    ELDER_MINUS("Elder (-)", false, SkillBoost.ELDER_MINUS_ATTACK, SkillBoost.ELDER_MINUS_STRENGTH, SkillBoost.ELDER_MINUS_DEFENCE),
    ELDER("Elder", false, SkillBoost.ELDER_ATTACK, SkillBoost.ELDER_STRENGTH, SkillBoost.ELDER_DEFENCE),
    ELDER_PLUS("Elder (+)", false, SkillBoost.ELDER_PLUS_ATTACK, SkillBoost.ELDER_PLUS_STRENGTH, SkillBoost.ELDER_PLUS_DEFENCE),

    OVERLOAD_NMZ("Overload (Nightmare Zone)", false, SkillBoost.SUPER_ATTACK, SkillBoost.SUPER_STRENGTH, SkillBoost.SUPER_DEFENCE, SkillBoost.SUPER_RANGING_POTION, SkillBoost.SUPER_MAGIC_POTION),
    OVERLOAD_MINUS("Overload (-)", false, SkillBoost.ELDER_MINUS_ATTACK, SkillBoost.ELDER_MINUS_STRENGTH, SkillBoost.ELDER_MINUS_DEFENCE, SkillBoost.TWISTED_MINUS, SkillBoost.KODAI_MINUS),
    OVERLOAD_COX("Overload (Chambers of Xeric)", false, SkillBoost.ELDER_ATTACK, SkillBoost.ELDER_STRENGTH, SkillBoost.ELDER_DEFENCE, SkillBoost.TWISTED, SkillBoost.KODAI),
    OVERLOAD_PLUS("Overload (+)", true, SkillBoost.ELDER_PLUS_ATTACK, SkillBoost.ELDER_PLUS_STRENGTH, SkillBoost.ELDER_PLUS_DEFENCE, SkillBoost.TWISTED_PLUS, SkillBoost.KODAI_PLUS),;

    private final String name;
    private final Boolean common;
    private final SkillBoost[] boosts;

    BoostOption(String name, Boolean common, SkillBoost... boosts)
    {
        this.name = name;
        this.common = common;
        this.boosts = boosts;
    }
}
