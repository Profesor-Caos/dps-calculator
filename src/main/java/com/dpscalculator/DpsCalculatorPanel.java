package com.dpscalculator;

import com.data.DpsCalculator;
import net.runelite.api.Client;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.materialtabs.MaterialTab;
import net.runelite.client.ui.components.materialtabs.MaterialTabGroup;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


class DpsCalculatorPanel extends PluginPanel
{
    private PlayerPanel playerPanel;
    private EquipmentPanel equipmentPanel;
    private TargetPanel targetPanel;

    // this panel will hold either the player panel, equipment panel, target panel, or result panel
    private final JPanel display = new JPanel();

    private final MaterialTabGroup tabGroup = new MaterialTabGroup(display);

    public DpsCalculatorPanel(DpsCalculator calculator, Client client)
    {
        super(false);

        setLayout(new BorderLayout());
        setBackground(ColorScheme.DARK_GRAY_COLOR);

        // Search Panel
        playerPanel = new PlayerPanel(calculator, client);

        //Offers Panel
        equipmentPanel = new EquipmentPanel();

        targetPanel = new TargetPanel();

        MaterialTab playerTab = new MaterialTab("Player", tabGroup, playerPanel);
        MaterialTab equipmentTab = new MaterialTab("Equipment", tabGroup, equipmentPanel);
        MaterialTab targetTab = new MaterialTab("Target", tabGroup, targetPanel);

        tabGroup.setBorder(new EmptyBorder(5, 0, 0, 0));
        tabGroup.addTab(playerTab);
        tabGroup.addTab(equipmentTab);
        tabGroup.addTab(targetTab);
        tabGroup.select(playerTab); // selects the default selected tab

        add(tabGroup, BorderLayout.NORTH);
        add(display, BorderLayout.CENTER);
    }
}
