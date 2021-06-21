package io.github.intellijnews.plugin.ui;

import com.intellij.openapi.project.Project;
import io.github.intellijnews.logic.RSSChannel;
import io.github.intellijnews.logic.RSSContainer;
import io.github.intellijnews.parser.Parser;
import io.github.intellijnews.plugin.ui.feed.FeedPanel;
import io.github.intellijnews.plugin.ui.feed.channel_list.ChannelList;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import java.util.stream.Collectors;

public class Application extends JPanel {
    private FeedPanel feed;
    private ChannelList channelList;
    private RSSContainer container;
    private final Project project;
    private final Parser parser = new Parser();

    public Application(@NotNull Project project) throws ParserConfigurationException {
        this.project = project;
        container = getContainer();
        buildGui();
    }

    private void buildGui() {

    }

    public RSSContainer getContainer() {
        return null;
    }

    public void updateData(String title) {

    }

    public static void main(String[] args) {

    }

    public Project getProject() {
        return project;
    }
}
