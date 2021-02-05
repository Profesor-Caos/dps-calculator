package com.data;

import net.runelite.api.Prayer;
import net.runelite.api.Skill;

import java.util.List;
import java.util.Optional;

public class PlayerPrayers
{
    List<PrayerType> ActivePrayers;

    void TogglePrayer(PrayerType prayer)
    {
        // Disable it if it's active.
        if (ActivePrayers.contains(prayer))
        {
            ActivePrayers.remove(prayer);
            return;
        }

        // Remove any active conflicting prayers.
        if (prayer.isOverhead())
        {
            ActivePrayers.removeIf(p -> p.isOverhead());
        }
        else
        {
            if (prayer.isOffensive())
                ActivePrayers.removeIf(p -> p.isOffensive());
            if (prayer.isDefensive())
                ActivePrayers.removeIf(p -> p.isDefensive());
        }

        // Add prayer to active prayers.
        ActivePrayers.add(prayer);
    }

    double GetDrainRate()
    {
        return ActivePrayers.stream().mapToDouble(p -> p.getPrayer().getDrainRate()).sum();
    }

    public int ApplyPrayerBuffs(Skill skill, int level)
    {
        Optional<PrayerType> offensivePrayer = ActivePrayers.stream().filter(p -> p.isOffensive()).findFirst();
        Optional<PrayerType> defensivePrayer = ActivePrayers.stream().filter(p -> p.isDefensive()).findFirst();

        switch (skill)
        {
            case STRENGTH:
                if(!offensivePrayer.isPresent())
                    return level;
                return (int)(level * offensivePrayer.get().getStrengthMultiplier());
        }
        // TODO: More prayers
        return level;
    }
}
