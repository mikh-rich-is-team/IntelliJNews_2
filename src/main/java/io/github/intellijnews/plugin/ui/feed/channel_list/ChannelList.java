package io.github.intellijnews.plugin.ui.feed.channel_list;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import io.github.intellijnews.logic.RSSChannel;
import io.github.intellijnews.logic.RSSContainer;
import io.github.intellijnews.plugin.ui.Application;
import io.github.intellijnews.plugin.ui.Settings;
import io.github.intellijnews.plugin.ui.feed.tab.ChannelTab;
import io.github.intellijnews.plugin.ui.feed.tab.table_render.ChannelTabCellEditor;
import io.github.intellijnews.plugin.ui.feed.tab.table_render.ChannelTabCellRenderer;
import io.github.intellijnews.plugin.ui.feed.tab.table_render.ChannelTabTableModel;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ChannelList extends JPanel {

    private RSSContainer container;
    private ChannelTabTableModel model;
    private final Application application;

    public ChannelList(Application application, RSSContainer container) {
        this.container = container;
        this.application = application;
        buildGui();
    }

    private void buildGui() {

    }

    public void setItems(String title, RSSContainer container) {

    }

    private void createContent() {

    }
    public static class ChannelListMenu extends JPopupMenu {
        public ChannelListMenu(Application application, RSSChannel channel) {
            JMenuItem unsubscribe = new JMenuItem("Unsubscribe");
            JMenuItem openInWeb = new JMenuItem("Open in Browser");
            add(unsubscribe);
            add(openInWeb);

            unsubscribe.addActionListener(e -> {
                Settings.STORED_DATA.channels.remove(channel.getRssUrl());
                application.updateData("Unsubscribing channel");
                Settings.saveChannels();
            });

            openInWeb.addActionListener(e -> BrowserUtil.browse(channel.getLink()));
        }
    }

}
