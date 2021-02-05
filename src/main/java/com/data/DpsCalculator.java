package com.data;

import com.data.weapontypes.AttackStyle;
import net.runelite.api.Skill;

public class DpsCalculator
{
    public Player player;

    public DpsCalculator()
    {
        player = new Player();
    }

    int GetMeleeMaxHit()
    {
        int max_hit = (int)(0.5 + GetEffectiveLevel(Skill.STRENGTH) * (player.equipment.GetDamageBonus(player.combatOption) + 64) / 640);
        // TODO: might need to apply other scenarios - arclight, slayer helm, etc.
        return max_hit;
    }

    int GetEffectiveLevel(Skill skill)
    {
        // Apply boosts (e.g. potions) to base level
        int level = player.boosts.GetBoostedLevel(skill, player.levels);

        // Apply prayer effects
        level = player.prayers.ApplyPrayerBuffs(Skill.ATTACK, level);

        // Add attack style bonus
        level += player.GetAttackStyleBonus(skill);

        // Add 8
        return level + 8;
    }

    int GetMeleeMaxAttackRoll()
    {
        int max_attack_roll = GetEffectiveLevel(Skill.ATTACK) * (player.equipment.GetAttackBonus(player.combatOption) + 64);
        // TODO: Slayer helm bonus, maybe other things like obsidian armour.
        return max_attack_roll;
    }
}
