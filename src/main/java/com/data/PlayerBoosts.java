package com.data;

import com.google.common.collect.ImmutableList;
import net.runelite.api.Skill;

import java.util.Hashtable;
import java.util.List;

public class PlayerBoosts
{
    public final List<Skill> BoostableSkills = ImmutableList.of(
            Skill.ATTACK,
            Skill.STRENGTH,
            Skill.DEFENCE,
            Skill.RANGED,
            Skill.MAGIC,
            Skill.MINING);

    private Hashtable<Skill, SkillBoost> boosts;

    PlayerBoosts()
    {
        boosts = new Hashtable<>();
    }

    public int GetBoostedLevel(Skill skill, PlayerLevels playerLevels)
    {
        int level = playerLevels.GetLevel(skill);
        SkillBoost boost = boosts.get(skill);
        if (boost == null)
            return level;
        if (boost == SkillBoost.DRAGON_BATTLEAXE)
        {
            int drainedLevels = (int)(0.1 * playerLevels.GetLevel(Skill.ATTACK))
                    + (int)(0.1 * playerLevels.GetLevel(Skill.DEFENCE))
                    + (int)(0.1 * playerLevels.GetLevel(Skill.RANGED))
                    + (int)(0.1 * playerLevels.GetLevel(Skill.MAGIC));
            // TODO: Assume boosts on the skills being drained?
            // Maybe have 2 different D BAXE boosts, one without other boosts and one assuming optimal other boosts.
            return (int)(0.25 * drainedLevels) + 10;
        }
        return (int)(level + boost.getPercentBoost()/100.0 * level) + boost.getFlatBoost();
    }

    public void ApplyBoost(Skill skill, BoostOption boost)
    {
    }
}
