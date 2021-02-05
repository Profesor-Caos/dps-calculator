package com.dpscalculator;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(DpsCalculatorConfig.CONFIG_GROUP)
public interface DpsCalculatorConfig extends Config
{
	String CONFIG_GROUP = "dpscalculator";

	@ConfigItem(
			keyName = "hideUncommonBoosts",
			name = "Hide Uncommon Boosts",
			description =  "Hides items that provide boosts that are not commonly used - e.g. ales and butterflies.",
			position = 1
	)
	default boolean hideUncommonBoosts() { return true; }
}
