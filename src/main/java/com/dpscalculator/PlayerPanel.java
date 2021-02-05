package com.dpscalculator;

//import net.runelite.client.plugins.hiscore.NameAutocompleter;
import com.data.DpsCalculator;
import com.data.weapontypes.WeaponType;
import net.runelite.api.Client;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.IconTextField;

import javax.swing.*;
import java.awt.*;

class PlayerPanel extends JPanel
{
    private DpsCalculator calculator;
    private Client client;

    public PlayerPanel(DpsCalculator calculator, Client client)
    {
        JPanel uiOption = new JPanel(new BorderLayout());
        JLabel uiLabel = new JLabel("Use Current Stats");
        JCheckBox uiCheckbox = new JCheckBox();

        uiLabel.setForeground(Color.WHITE);
        uiLabel.setFont(FontManager.getRunescapeSmallFont());

        uiOption.setBorder(BorderFactory.createEmptyBorder(3, 7, 3, 0));
        uiOption.setBackground(ColorScheme.DARKER_GRAY_COLOR);

        uiCheckbox.setBackground(ColorScheme.MEDIUM_GRAY_COLOR);

        uiOption.add(uiLabel, BorderLayout.WEST);
        uiOption.add(uiCheckbox, BorderLayout.EAST);

        add(uiOption);
        add(new PlayerLevelLookup(calculator, client));
        add(new PlayerLevelsPanel(calculator));
    }
}
