package io.github.intellijnews.parser;

import io.github.intellijnews.logic.RSSChannel;
import io.github.intellijnews.logic.RSSImage;
import io.github.intellijnews.logic.RSSItem;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Parser {

    private final DocumentBuilder builder;

    public Parser() throws ParserConfigurationException {
        this.builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    }

    /**
     * @param url
     * @return
     */
    public RSSChannel parse(String url) throws IOException, SAXException {
        //TODO: кидаем свои исключения
        //TODO: Подключаемся к url по HttpURLConnection
        //TODO: передаем в билдер InputStream
        //TODO: Делаем документ
        //TODO: Парсим все.

        RSSChannel rssChannel = null;

        return rssChannel;
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Parser parser = new Parser();
        RSSChannel channel = parser.parse("https://rss.nytimes.com/services/xml/rss/nyt/World.xml");
        channel.getItems();
    }

    private RSSChannel parseChannel(NodeList channelList) {
        //TODO: парсим тег <channel>

        RSSChannel channel = null;

        return channel;
    }

    private RSSImage parseImage(NodeList imageHeaders) {
        return null;
    }

    private RSSItem parseItem(NodeList itemHeaders) {
        //TODO: парсим тег <item>

        return null;
    }
}
