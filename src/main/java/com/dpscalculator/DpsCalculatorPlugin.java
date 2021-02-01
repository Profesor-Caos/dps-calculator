package com.dpscalculator;

//import com.google.inject.Provides;
//import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
//import net.runelite.api.ChatMessageType;
//import net.runelite.api.Client;
//import net.runelite.api.GameState;
//import net.runelite.api.events.GameStateChanged;
//import net.runelite.client.config.ConfigManager;
//import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

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
//	@Inject
//	private Client client;
//
//	@Inject
//	private DpsCalculatorConfig config;

	@Override
	protected void startUp()
	{
//		log.info("Example started!");
	}

	@Override
	protected void shutDown()
	{
//		log.info("Example stopped!");
	}

//	@Subscribe
//	public void onGameStateChanged(GameStateChanged gameStateChanged)
//	{
//		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
//		{
//			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
//		}
//	}
//
//	@Provides
//	DpsCalculatorConfig provideConfig(ConfigManager configManager)
//	{
//		return configManager.getConfig(DpsCalculatorConfig.class);
//	}
}
