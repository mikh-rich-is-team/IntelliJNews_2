package io.github.intellijnews.plugin.ui;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;

public class Settings {
    public static Color ITEM_BACKGROUND = new Color(185, 207, 230);
    public static Font CHANNEL_NAME = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
    public static Font TAG = new Font("Arial", Font.BOLD, 13);
    public static Font ARTICLE = new Font("Arial", Font.PLAIN, 12);
    public static Font INFO = new Font("Arial", Font.PLAIN, 13);

    public static State STORED_DATA;

    static {

    }

    public static void saveChannels() {

    }



    public static class State {
        public Set<String> channels = new LinkedHashSet<>();

        public void load(InputStream stream) throws IOException {

        }

        public void save(OutputStream outputStream) throws IOException {

        }
    }
}
