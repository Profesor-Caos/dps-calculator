package com.dpscalculator;

import com.data.PlayerLevels;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.Skill;
import net.runelite.client.RuneLite;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.plugins.hiscore.HiscorePanel;
import net.runelite.client.plugins.hiscore.HiscorePlugin;
import net.runelite.client.ui.FontManager;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class PlayerLevelsPanel extends JPanel
{
    SkillIconManager skillIconManager = new SkillIconManager();

    @Getter
    private PlayerLevels stats;

    private HashMap<Skill, JSpinner> editorMap = new HashMap<>();

    public PlayerLevelsPanel()
    {
        stats = new PlayerLevels();
        for (Skill skill : stats.Skills)
            stats.SetLevel(skill, (int)(Math.random() * 99) + 1);
        BuildUI();
        UpdateSpinners();
    }

    void BuildUI()
    {
        GridBagLayout grid = new GridBagLayout();
        setLayout(grid);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        // Player Skills editors
        int i = 0;
        int rows = 3;
        int cols = 3;
        for (Skill skill : stats.Skills) {
            JPanel skillPanel = new JPanel();
            skillPanel.setLayout(new BoxLayout(skillPanel, BoxLayout.LINE_AXIS));
            skillPanel.setToolTipText(skill.getName());
            skillPanel.setFont(FontManager.getRunescapeSmallFont());

            SpinnerNumberModel skillModel = new SpinnerNumberModel(1,1,99,1);

            JLabel skillIcon = new JLabel();
            skillIcon.setIcon(new ImageIcon(skillIconManager.getSkillImage(skill)));

            JSpinner skillLevel = new JSpinner();
            JSpinner.NumberEditor editor = new JSpinner.NumberEditor(skillLevel);
            editor.getTextField().setColumns(2);
            skillLevel.setEditor(editor);
            skillLevel.setModel(skillModel);
            editorMap.put(skill, skillLevel);

            int spacer = 30 - skillIcon.getIcon().getIconWidth(); // TODO: Load icons to figure max width for purpose of spacing without hardcoded values.
            skillPanel.add(skillIcon);
            skillPanel.add(Box.createRigidArea(new Dimension(spacer, 0)));
            skillPanel.add(skillLevel);

            constraints.gridx = i/rows;
            constraints.gridy = i%cols;
            i++;
            add(skillPanel, constraints);
        }
    }

    void UpdateSpinners()
    {
        for (Skill skill : stats.Skills)
        {
            String skillName = skill.getName();
            int value = stats.GetLevel(skill);
            // Get the Panel/JSpinner for the skill and update it.
            JSpinner spinner = editorMap.get(skill);
            spinner.getModel().setValue(value);
        }
    }
}
