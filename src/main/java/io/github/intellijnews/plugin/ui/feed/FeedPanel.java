package io.github.intellijnews.plugin.ui.feed;

import io.github.intellijnews.logic.RSSChannel;
import io.github.intellijnews.logic.RSSContainer;
import io.github.intellijnews.logic.RSSItem;
import io.github.intellijnews.parser.Parser;
import io.github.intellijnews.plugin.ui.Application;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FeedPanel extends AbstractFeed {

    public FeedPanel(Application application, RSSContainer rssContainer) {
        super(application, getFeedItems(rssContainer));
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

    }

    public static List<RSSItem> getFeedItems(RSSContainer rssContainer) {
        return null;
    }
}
