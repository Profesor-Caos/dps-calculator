package com.data;

import com.data.weapontypes.AttackType;
import com.data.weapontypes.CombatOption;
import net.runelite.api.Skill;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;

import java.util.Arrays;
import java.util.List;

public class PlayerEquipment
{
    private List<ItemStats> Equipment;

    void Equip(ItemStats item)
    {
        if (!item.isEquipable())
            return;

        Equipment.removeIf(e -> e.getEquipment().getSlot() == item.getEquipment().getSlot());
        Equipment.add(item);
    }

    public int GetDamageBonus(CombatOption combatOption)
    {
        if (combatOption.getAttackType() == AttackType.RANGED)
            return Equipment.stream().mapToInt(e -> e.getEquipment().getRstr()).sum();

        if (combatOption.getAttackType() == AttackType.MAGIC)
            return Equipment.stream().mapToInt(e -> e.getEquipment().getMdmg()).sum();

        return Equipment.stream().mapToInt(e -> e.getEquipment().getStr()).sum();
    }

    public int GetAttackBonus(CombatOption combatOption)
    {
        if (combatOption.getAttackType() == AttackType.RANGED)
            return Equipment.stream().mapToInt(e -> e.getEquipment().getArange()).sum();

        if (combatOption.getAttackType() == AttackType.MAGIC)
            return Equipment.stream().mapToInt(e -> e.getEquipment().getAmagic()).sum();

        if (combatOption.getAttackType() == AttackType.SLASH)
            return Equipment.stream().mapToInt(e -> e.getEquipment().getAslash()).sum();

        if (combatOption.getAttackType() == AttackType.CRUSH)
            return Equipment.stream().mapToInt(e -> e.getEquipment().getAcrush()).sum();

        return Equipment.stream().mapToInt(e -> e.getEquipment().getAstab()).sum();
    }
}
