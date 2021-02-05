package com.data;

import com.data.weapontypes.AttackStyle;
import com.data.weapontypes.CombatOption;
import net.runelite.api.Skill;

public class Player
{
    PlayerLevels levels;
    PlayerPrayers prayers;
    PlayerBoosts boosts;
    PlayerEquipment equipment;
    CombatOption combatOption;

    Player(PlayerLevels levels, PlayerPrayers prayers, PlayerBoosts boosts, PlayerEquipment equipment)
    {
        this.levels = levels;
        this.prayers = prayers;
        this.boosts = boosts;
        this.equipment = equipment;
    }

    public int GetAttackStyleBonus(Skill skill)
    {
        if (combatOption.getStyle() == AttackStyle.CONTROLLED)
            return 1;
        if (skill == Skill.STRENGTH && combatOption.getStyle() == AttackStyle.AGGRESSIVE)
            return 3;
        if (skill == Skill.ATTACK && combatOption.getStyle() == AttackStyle.ACCURATE)
            return 3;

        return 0;
    }
}
