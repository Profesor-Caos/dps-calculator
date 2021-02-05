package com.data;

import com.data.weapontypes.AttackStyle;
import com.data.weapontypes.CombatOption;
import net.runelite.api.Skill;

public class Player
{
    public PlayerLevels levels;
    public PlayerPrayers prayers;
    public PlayerBoosts boosts;
    public PlayerEquipment equipment;
    public CombatOption combatOption;

    Player()
    {
        levels = new PlayerLevels();
        prayers = new PlayerPrayers();
        boosts = new PlayerBoosts();
        equipment = new PlayerEquipment();
        combatOption = CombatOption.UNARMED_PUNCH;
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
