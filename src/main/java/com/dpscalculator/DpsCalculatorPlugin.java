package com.dpscalculator;

import com.data.DpsCalculator;
import com.data.Player;
import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
//import net.runelite.api.ChatMessageType;
//import net.runelite.api.Client;
//import net.runelite.api.GameState;
//import net.runelite.api.events.GameStateChanged;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
//import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import java.awt.image.BufferedImage;

@Slf4j
@PluginDescriptor(
		name = "DPS Calculator",
		description = "Calculates damage per second with customizable gear against different targets.",
		tags = {"combat", "pve", "pvm", "equipment", "damage", "overlay", "dps", }
)
// TODO: Add tags to runelite-plugin.properties once they're more finalized.
// TODO: Write up the README.md once the features are fleshed out better.
public class DpsCalculatorPlugin extends Plugin
{
	@Getter(AccessLevel.PACKAGE)
	private NavigationButton button;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private DpsCalculatorPanel panel;

	private DpsCalculator calculator;

	@Inject
	private Client client;

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private SkillIconManager skillIconManager;

	@Inject
	private DpsCalculatorConfig config;

	@Override
	protected void startUp()
	{
		calculator = new DpsCalculator();
		panel = new DpsCalculatorPanel(calculator, client);

		final BufferedImage icon = ImageUtil.loadImageResource(DpsCalculatorPlugin.class, "icon.png");

		button = NavigationButton.builder()
				.tooltip("DPS Calculator")
				.icon(icon)
				.priority(6)
				.panel(panel)
				.build();

		clientToolbar.addNavigation(button);
	}

	@Override
	protected void shutDown()
	{
		clientToolbar.removeNavigation(button);
	}

//	@Subscribe
//	public void onGameStateChanged(GameStateChanged gameStateChanged)
//	{
//		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
//		{
//			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
//		}
//	}

	@Provides
	DpsCalculatorConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(DpsCalculatorConfig.class);
	}
}
