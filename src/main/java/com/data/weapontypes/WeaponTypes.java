package com.data.weapontypes;

import lombok.Getter;

@Getter
public enum WeaponTypes
{
    UNARMED(CombatOptions.UNARMED_PUNCH, CombatOptions.UNARMED_KICK, CombatOptions.UNARMED_BLOCK),
    AXE(CombatOptions.AXE_CHOP, CombatOptions.AXE_HACK, CombatOptions.AXE_SMASH, CombatOptions.AXE_BLOCK),
    BLUNT(CombatOptions.BLUNT_POUND, CombatOptions.BLUNT_PUMMEL, CombatOptions.BLUNT_BLOCK),
    BOW(CombatOptions.BOW_ACCURATE, CombatOptions.BOW_LONGRANGE, CombatOptions.BOW_RAPID),
    CLAW(CombatOptions.CLAW_CHOP, CombatOptions.CLAW_SLASH, CombatOptions.CLAW_LUNGE, CombatOptions.CLAW_BLOCK),
    CROSSBOW(CombatOptions.CROSSBOW_ACCURATE, CombatOptions.CROSSBOW_RAPID, CombatOptions.CROSSBOW_LONGRANGE),
    SALAMANDER(CombatOptions.SALAMANDER_SCORCH, CombatOptions.SALAMANDER_FLARE, CombatOptions.SALAMANDER_BLAZE),
    CHINCHOMPAS(CombatOptions.CHINCHOMPAS_SHORT_FUSE, CombatOptions.CHINCHOMPAS_MEDIUM_FUSE, CombatOptions.CHINCHOMPAS_LONG_FUSE),
    GUN(CombatOptions.GUN_AIM_AND_FIRE, CombatOptions.GUN_KICK),
    SLASH_SWORD(CombatOptions.SLASH_SWORD_CHOP, CombatOptions.SLASH_SWORD_SLASH, CombatOptions.SLASH_SWORD_LUNGE, CombatOptions.SLASH_SWORD_BLOCK),
    _2H_SWORD(CombatOptions._2H_SWORD_CHOP, CombatOptions._2H_SWORD_SLASH, CombatOptions._2H_SWORD_SMASH, CombatOptions._2H_SWORD_BLOCK),
    PICKAXE(CombatOptions.PICKAXE_SPIKE, CombatOptions.PICKAXE_IMPALE, CombatOptions.PICKAXE_SMASH, CombatOptions.PICKAXE_BLOCK),
    HALBERD(CombatOptions.HALBERD_JAB, CombatOptions.HALBERD_SWIPE, CombatOptions.HALBERD_FEND),
    POLESTAFF(CombatOptions.POLESTAFF_BASH, CombatOptions.POLESTAFF_POUND, CombatOptions.POLESTAFF_BLOCK),
    SCYTHE(CombatOptions.SCYTHE_REAP, CombatOptions.SCYTHE_CHOP, CombatOptions.SCYTHE_JAB, CombatOptions.SCYTHE_BLOCK),
    SPEAR(CombatOptions.SPEAR_LUNGE, CombatOptions.SPEAR_SWIPE, CombatOptions.SPEAR_POUND, CombatOptions.SPEAR_BLOCK),
    SPIKED(CombatOptions.SPIKED_POUND, CombatOptions.SPIKED_PUMMEL, CombatOptions.SPIKED_SPIKE, CombatOptions.SPIKED_BLOCK),
    STAB_SWORD(CombatOptions.STAB_SWORD_STAB, CombatOptions.STAB_SWORD_LUNGE, CombatOptions.STAB_SWORD_SLASH, CombatOptions.STAB_SWORD_BLOCK),
    STAFF(CombatOptions.STAFF_BASH, CombatOptions.STAFF_POUND, CombatOptions.STAFF_FOCUS, CombatOptions.STAFF_SPELL_DEFENSIVE, CombatOptions.STAFF_SPELL),
    THROWN(CombatOptions.THROWN_ACCURATE, CombatOptions.THROWN_RAPID, CombatOptions.THROWN_LONGRANGE),
    WHIP(CombatOptions.WHIP_FLICK, CombatOptions.WHIP_LASH, CombatOptions.WHIP_DEFLECT),
    BLADED_STAFF(CombatOptions.BLADED_STAFF_JAB, CombatOptions.BLADED_STAFF_SWIPE, CombatOptions.BLADED_STAFF_FEND, CombatOptions.BLADED_STAFF_SPELL_DEFENSIVE, CombatOptions.BLADED_STAFF_SPELL),
    GODSWORD(CombatOptions.GODSWORD_CHOP, CombatOptions.GODSWORD_SLASH, CombatOptions.GODSWORD_SMASH, CombatOptions.GODSWORD_BLOCK),
    POWERED_STAFF(CombatOptions.POWERED_STAFF_ACCURATE, CombatOptions.POWERED_STAFF_ACCURATE, CombatOptions.POWERED_STAFF_LONGRANGE),
    BANNER(CombatOptions.BANNER_LUNGE, CombatOptions.BANNER_SWIPE, CombatOptions.BANNER_POUND, CombatOptions.BANNER_BLOCK),
    POLEARM(CombatOptions.POLEARM_JAB, CombatOptions.POLEARM_SWIPE, CombatOptions.POLEARM_FEND),
    BLUDGEON(CombatOptions.BLUDGEON_POUND, CombatOptions.BLUDGEON_PUMMEL, CombatOptions.BLUDGEON_SMASH),
    BULWARK(CombatOptions.BULWARK_PUMMEL, CombatOptions.BULWARK_BLOCK);

    private final CombatOptions[] combatOptions;

    WeaponTypes(CombatOptions... combatOptions)
    {

        this.combatOptions = combatOptions;
    }
}
