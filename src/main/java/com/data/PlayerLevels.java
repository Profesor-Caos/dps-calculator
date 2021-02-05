package com.data;

import com.google.common.collect.ImmutableList;
import net.runelite.api.Skill;

import java.util.Hashtable;
import java.util.List;

public class PlayerLevels
{
    public final List<Skill> Skills = ImmutableList.of(
            Skill.ATTACK,
            Skill.STRENGTH,
            Skill.DEFENCE,
            Skill.RANGED,
            Skill.PRAYER,
            Skill.MAGIC,
            Skill.HITPOINTS,
            Skill.MINING);

    private Hashtable<Skill, Integer> levels;

    public PlayerLevels()
    {
        levels = new Hashtable<>();
        for (Skill skill : Skills)
        {
            levels.put(skill, 1);
        }
    }

    public int GetLevel(Skill skill)
    {
        return levels.get(skill);
    }

    public void SetLevel(Skill skill, int level)
    {
        if (!Skills.contains(skill))
            return;

        if (level > 99 || level < 1)
            return;

        levels.put(skill, level);
    }
}
