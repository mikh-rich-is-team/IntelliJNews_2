package io.github.intellijnews.plugin.ui.feed.item;

import io.github.intellijnews.logic.RSSItem;
import io.github.intellijnews.plugin.ui.Settings;
import io.github.intellijnews.plugin.ui.util.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ItemPanel extends JPanel {
    private final RSSItem item;

    public ItemPanel(RSSItem item) {
        this.item = item;
        buildGui();
    }

    private void buildGui() {

    }
}
