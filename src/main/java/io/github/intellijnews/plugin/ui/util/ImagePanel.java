package io.github.intellijnews.plugin.ui.util;

import io.github.intellijnews.logic.RSSImage;
import io.github.intellijnews.plugin.ui.Settings;
import io.github.intellijnews.plugin.ui.feed.FeedPanel;
import io.github.intellijnews.util.Pair;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ImagePanel extends JPanel {

    private RSSImage image;

    public ImagePanel(RSSImage image) {
        this.image = image;

        buildGui();
    }

    private void buildGui() {

    }

    private static Pair<Double, Double> getBounds(int imageWidth, int imageHeight) {

    }

    private BufferedImage cutImage(Image image) {

        return null;
    }

    @Override
    public void paint(Graphics g) {

    }
}
