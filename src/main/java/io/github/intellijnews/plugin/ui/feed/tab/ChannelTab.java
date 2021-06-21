package io.github.intellijnews.plugin.ui.feed.tab;

import io.github.intellijnews.logic.RSSChannel;
import io.github.intellijnews.plugin.ui.Application;
import io.github.intellijnews.plugin.ui.Settings;
import io.github.intellijnews.plugin.ui.feed.channel_list.ChannelList;
import io.github.intellijnews.plugin.ui.feed.item.util.RSSTextPane;
import io.github.intellijnews.plugin.ui.util.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChannelTab extends JPanel {
    private final RSSChannel channel;
    private final Application application;

    public ChannelTab(Application application, RSSChannel channel) {
        this.application = application;
        this.channel = channel;
        buildGui();
    }

    private void buildGui() {

    }

}
