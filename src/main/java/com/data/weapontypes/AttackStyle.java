package com.data.weapontypes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Skill;

@Getter
public enum AttackStyle
{
    NONE("None"),
    ACCURATE("Accurate", Skill.ATTACK),
    AGGRESSIVE("Aggressive", Skill.STRENGTH),
    DEFENSIVE("Defensive", Skill.DEFENCE),
    CONTROLLED("Controlled", Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE),
    ACCURATE_RANGED("Accurate", Skill.RANGED),
    RAPID("Rapid", Skill.RANGED),
    LONGRANGE("Longrange", Skill.RANGED, Skill.DEFENCE),
    ACCURATE_CASTING("Accurate", Skill.MAGIC),
    LONGRANGE_CASTING("Longrange", Skill.MAGIC, Skill.DEFENCE),
    AUTOCAST("Autocast", Skill.MAGIC),
    DEFENSIVE_AUTOCAST("Defensive Autocast", Skill.MAGIC, Skill.DEFENCE);

    private final String name;
    private final Skill[] skills;

    AttackStyle(String name, Skill... skills)
    {
        this.name = name;
        this.skills = skills;
    }
}
