package com.data;

import com.google.common.collect.ImmutableList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Skill;

import java.util.List;

@Getter
@AllArgsConstructor
public enum SkillBoost
{
    ATTACK_CAPE(Skill.ATTACK, 0, 1),
    ATTACK_POTION(Skill.ATTACK, 10, 3),
    BLOOD_PINT_ATTACK(Skill.ATTACK, 0, 5),
    CUP_OF_TEA(Skill.ATTACK, 0, 2),
    JANGERBERRIES_ATTACK(Skill.ATTACK, 0, 2),
    RUBY_HARVEST(Skill.ATTACK, 15, 4),
    SUPER_ATTACK(Skill.ATTACK, 15, 5),
    ZAMORAK_BREW_ATTACK(Skill.ATTACK, 20, 2),
    ELDER_MINUS_ATTACK(Skill.ATTACK, 10, 4),
    ELDER_ATTACK(Skill.ATTACK, 13, 5),
    ELDER_PLUS_ATTACK(Skill.ATTACK, 16, 6),

    STRENGTH_CAPE(Skill.STRENGTH, 0, 1),
    BLOOD_PINT_STRENGTH(Skill.STRENGTH, 0, 5),
    BRAINDEATH_RUM_STRENGTH(Skill.STRENGTH, 0, 3),
    DRAGON_BATTLEAXE(Skill.STRENGTH, 25, 10), // TODO: Special case will need to be handled differently
    BEER_STRENGTH(Skill.STRENGTH, 4, 0),
    JANGERBERRIES_STRENGTH(Skill.STRENGTH, 0, 1),
    BLACK_WARLOCK(Skill.STRENGTH, 15, 4),
    STRENGTH_POTION(Skill.STRENGTH, 10, 3),
    SUPER_STRENGTH(Skill.STRENGTH, 15, 5),
    ZAMORAK_BREW_STRENGTH(Skill.STRENGTH, 12, 2),
    ELDER_MINUS_STRENGTH(Skill.STRENGTH, 10, 4),
    ELDER_STRENGTH(Skill.STRENGTH, 13, 5),
    ELDER_PLUS_STRENGTH(Skill.STRENGTH, 16, 6),
    KEG_OF_BEER_STRENGTH(Skill.STRENGTH, 10, 2),

    DEFENCE_CAPE(Skill.DEFENCE, 0, 1),
    DEFENCE_POTION(Skill.DEFENCE, 10, 3),
    SAPPHIRE_GLACIALIS(Skill.DEFENCE, 15, 4),
    SUPER_DEFENCE(Skill.DEFENCE, 15, 5),
    SARADOMIN_BREW_DEFENCE(Skill.DEFENCE, 20, 2),
    ELDER_MINUS_DEFENCE(Skill.DEFENCE, 10, 4),
    ELDER_DEFENCE(Skill.DEFENCE, 13, 5),
    ELDER_PLUS_DEFENCE(Skill.DEFENCE, 16, 6),

    RANGING_CAPE(Skill.RANGED, 0, 1),
    RANGING_POTION(Skill.RANGED, 10, 4),
    SUPER_RANGING_POTION(Skill.RANGED, 15, 5),
    WILD_PIE(Skill.RANGED, 0, 4),
    TWISTED_MINUS(Skill.RANGED, 10, 4),
    TWISTED(Skill.RANGED, 13, 5),
    TWISTED_PLUS(Skill.RANGED, 16, 6),

    MAGIC_CAPE(Skill.MAGIC, 0, 1),
    WIZARDS_MIND_BOMB(Skill.MAGIC, 2, 2),
    MAGIC_ESSENCE(Skill.MAGIC, 0, 3),
    MATURE_WIZARDS_MIND_BOMB(Skill.MAGIC, 2, 3),
    MAGIC_POTION(Skill.MAGIC, 0, 4),
    IMBUED_HEART(Skill.MAGIC, 10, 1),
    SUPER_MAGIC_POTION(Skill.MAGIC, 15, 5),
    KODAI_MINUS(Skill.MAGIC, 10, 4),
    KODAI(Skill.MAGIC, 13, 5),
    KODAI_PLUS(Skill.MAGIC, 16, 6),

    MINING_CAPE(Skill.MINING, 0, 1),
    BRAINDEATH_RUM_MINING(Skill.MINING, 0, 1),
    DWARVEN_STOUT(Skill.MINING, 0, 1),
    MATURE_DWARVEN_STOUT(Skill.MINING, 0, 2),
    DRAGON_PICKAXE(Skill.MINING, 0, 3)
    ;

    private final Skill skill;
    private int percentBoost;
    private int flatBoost;

//    public List<SkillBoost> AttackBoosts = ImmutableList.of(
//            new SkillBoost("Attack potion", Skill.ATTACK, 10, 3),
//            new SkillBoost("Super attack", Skill.ATTACK, 15, 5),
//            new SkillBoost("Zamorak brew", Skill.ATTACK, 20,2),
//            new SkillBoost("Overload (Nightmare Zone)", Skill.ATTACK, 15, 5),
//            new SkillBoost("Overload (-)", Skill.ATTACK, 10, 4),
//            new SkillBoost("Overload (Chambers of Xeric)", Skill.ATTACK, 13,5),
//            new SkillBoost("Overload (+)", Skill.ATTACK, 16,6)
//    );
}
