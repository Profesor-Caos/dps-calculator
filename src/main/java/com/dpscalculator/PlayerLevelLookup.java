package com.dpscalculator;

import com.data.DpsCalculator;
import com.data.PlayerLevels;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.IconTextField;

import javax.annotation.Nullable;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayerLevelLookup extends IconTextField
{
    private DpsCalculator calculator;
    private final Client client;

    PlayerLevelLookup(DpsCalculator calculator, Client client)
    {
        super();

        this.calculator = calculator;
        this.client = client;

        setIcon(IconTextField.Icon.SEARCH);
        //iconWrapperLabel.setIcon(imageIcon);
        setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH - 20, 30));
        setBackground(ColorScheme.DARKER_GRAY_COLOR);
        setHoverBackgroundColor(ColorScheme.DARK_GRAY_HOVER_COLOR);
        setMinimumSize(new Dimension(0, 30));
        addActionListener(e -> lookup());
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (e.getClickCount() != 2)
                {
                    return;
                }

                if (client == null)
                {
                    return;
                }

                for (Skill skill : calculator.player.levels.Skills)
                {
                    calculator.player.levels.SetLevel(skill, client.getRealSkillLevel(skill));
                }
            }
        });
    }

    private void lookup()
    {

    }
}
