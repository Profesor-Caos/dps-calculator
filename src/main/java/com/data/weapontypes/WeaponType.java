package com.data.weapontypes;

import lombok.Getter;

@Getter
public enum WeaponType
{
    UNARMED(CombatOption.UNARMED_PUNCH, CombatOption.UNARMED_KICK, CombatOption.UNARMED_BLOCK),
    AXE(CombatOption.AXE_CHOP, CombatOption.AXE_HACK, CombatOption.AXE_SMASH, CombatOption.AXE_BLOCK),
    BLUNT(CombatOption.BLUNT_POUND, CombatOption.BLUNT_PUMMEL, CombatOption.BLUNT_BLOCK),
    BOW(CombatOption.BOW_ACCURATE, CombatOption.BOW_LONGRANGE, CombatOption.BOW_RAPID),
    CLAW(CombatOption.CLAW_CHOP, CombatOption.CLAW_SLASH, CombatOption.CLAW_LUNGE, CombatOption.CLAW_BLOCK),
    CROSSBOW(CombatOption.CROSSBOW_ACCURATE, CombatOption.CROSSBOW_RAPID, CombatOption.CROSSBOW_LONGRANGE),
    SALAMANDER(CombatOption.SALAMANDER_SCORCH, CombatOption.SALAMANDER_FLARE, CombatOption.SALAMANDER_BLAZE),
    CHINCHOMPAS(CombatOption.CHINCHOMPAS_SHORT_FUSE, CombatOption.CHINCHOMPAS_MEDIUM_FUSE, CombatOption.CHINCHOMPAS_LONG_FUSE),
    GUN(CombatOption.GUN_AIM_AND_FIRE, CombatOption.GUN_KICK),
    SLASH_SWORD(CombatOption.SLASH_SWORD_CHOP, CombatOption.SLASH_SWORD_SLASH, CombatOption.SLASH_SWORD_LUNGE, CombatOption.SLASH_SWORD_BLOCK),
    _2H_SWORD(CombatOption._2H_SWORD_CHOP, CombatOption._2H_SWORD_SLASH, CombatOption._2H_SWORD_SMASH, CombatOption._2H_SWORD_BLOCK),
    PICKAXE(CombatOption.PICKAXE_SPIKE, CombatOption.PICKAXE_IMPALE, CombatOption.PICKAXE_SMASH, CombatOption.PICKAXE_BLOCK),
    HALBERD(CombatOption.HALBERD_JAB, CombatOption.HALBERD_SWIPE, CombatOption.HALBERD_FEND),
    POLESTAFF(CombatOption.POLESTAFF_BASH, CombatOption.POLESTAFF_POUND, CombatOption.POLESTAFF_BLOCK),
    SCYTHE(CombatOption.SCYTHE_REAP, CombatOption.SCYTHE_CHOP, CombatOption.SCYTHE_JAB, CombatOption.SCYTHE_BLOCK),
    SPEAR(CombatOption.SPEAR_LUNGE, CombatOption.SPEAR_SWIPE, CombatOption.SPEAR_POUND, CombatOption.SPEAR_BLOCK),
    SPIKED(CombatOption.SPIKED_POUND, CombatOption.SPIKED_PUMMEL, CombatOption.SPIKED_SPIKE, CombatOption.SPIKED_BLOCK),
    STAB_SWORD(CombatOption.STAB_SWORD_STAB, CombatOption.STAB_SWORD_LUNGE, CombatOption.STAB_SWORD_SLASH, CombatOption.STAB_SWORD_BLOCK),
    STAFF(CombatOption.STAFF_BASH, CombatOption.STAFF_POUND, CombatOption.STAFF_FOCUS, CombatOption.STAFF_SPELL_DEFENSIVE, CombatOption.STAFF_SPELL),
    THROWN(CombatOption.THROWN_ACCURATE, CombatOption.THROWN_RAPID, CombatOption.THROWN_LONGRANGE),
    WHIP(CombatOption.WHIP_FLICK, CombatOption.WHIP_LASH, CombatOption.WHIP_DEFLECT),
    BLADED_STAFF(CombatOption.BLADED_STAFF_JAB, CombatOption.BLADED_STAFF_SWIPE, CombatOption.BLADED_STAFF_FEND, CombatOption.BLADED_STAFF_SPELL_DEFENSIVE, CombatOption.BLADED_STAFF_SPELL),
    GODSWORD(CombatOption.GODSWORD_CHOP, CombatOption.GODSWORD_SLASH, CombatOption.GODSWORD_SMASH, CombatOption.GODSWORD_BLOCK),
    POWERED_STAFF(CombatOption.POWERED_STAFF_ACCURATE, CombatOption.POWERED_STAFF_ACCURATE, CombatOption.POWERED_STAFF_LONGRANGE),
    BANNER(CombatOption.BANNER_LUNGE, CombatOption.BANNER_SWIPE, CombatOption.BANNER_POUND, CombatOption.BANNER_BLOCK),
    POLEARM(CombatOption.POLEARM_JAB, CombatOption.POLEARM_SWIPE, CombatOption.POLEARM_FEND),
    BLUDGEON(CombatOption.BLUDGEON_POUND, CombatOption.BLUDGEON_PUMMEL, CombatOption.BLUDGEON_SMASH),
    BULWARK(CombatOption.BULWARK_PUMMEL, CombatOption.BULWARK_BLOCK);

    private final CombatOption[] combatOptions;

    WeaponType(CombatOption... combatOptions)
    {

        this.combatOptions = combatOptions;
    }
}
