package io.github.intellijnews.plugin.ui.feed;

import io.github.intellijnews.logic.RSSChannel;
import io.github.intellijnews.parser.Parser;
import io.github.intellijnews.plugin.ui.Application;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;

public class ChannelPanel extends AbstractFeed {
    public ChannelPanel(Application application, RSSChannel channel) {
        super(application, channel.getItems());
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

    }
}
