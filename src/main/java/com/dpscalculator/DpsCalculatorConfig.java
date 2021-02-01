package com.dpscalculator;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;

@ConfigGroup(DpsCalculatorConfig.CONFIG_GROUP)
public interface DpsCalculatorConfig extends Config
{
	String CONFIG_GROUP = "dpscalculator";
	// TODO: Figure out what settings might be good to have, if any.
}
