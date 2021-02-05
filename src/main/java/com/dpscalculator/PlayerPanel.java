package com.dpscalculator;

//import net.runelite.client.plugins.hiscore.NameAutocompleter;
import com.data.weapontypes.WeaponType;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.IconTextField;

import javax.swing.*;
import java.awt.*;

class PlayerPanel extends JPanel
{
    private final IconTextField searchBar;

    PlayerPanel()
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
        searchBar = new IconTextField();
        searchBar.setIcon(IconTextField.Icon.SEARCH);
        searchBar.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH - 20, 30));
        searchBar.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        searchBar.setHoverBackgroundColor(ColorScheme.DARK_GRAY_HOVER_COLOR);
        searchBar.setMinimumSize(new Dimension(0, 30));
//        searchBar.addActionListener(e -> lookup());
//        searchBar.addMouseListener(new MouseAdapter()
//        {
//            @Override
//            public void mouseClicked(MouseEvent e)
//            {
//                if (e.getClickCount() != 2)
//                {
//                    return;
//                }
//                if (client == null)
//                {
//                    return;
//                }
//
//                Player localPlayer = client.getLocalPlayer();
//
//                if (localPlayer != null)
//                {
//                    lookup(localPlayer.getName());
//                }
//            }
//        });
//        searchBar.addClearListener(() ->
//        {
//            searchBar.setIcon(IconTextField.Icon.SEARCH);
//            searchBar.setEditable(true);
//            loading = false;
//        });

//        add(searchBar, c);
//        c.gridy++;
        add(new PlayerLevelsPanel());
    }
}
