package io.github.intellijnews.plugin.ui.feed;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.ui.components.JBScrollPane;
import io.github.intellijnews.logic.RSSItem;
import io.github.intellijnews.plugin.ui.Application;
import io.github.intellijnews.plugin.ui.feed.item.ItemPanel;
import io.github.intellijnews.plugin.ui.util.RSSItemsCellEditor;
import io.github.intellijnews.plugin.ui.util.RSSItemsCellRenderer;
import io.github.intellijnews.plugin.ui.util.RSSItemsTableModel;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AbstractFeed extends JPanel {
    private List<RSSItem> items;
    private RSSItemsTableModel model;
    private final Application application;

    public AbstractFeed(Application application, List<RSSItem> items) {
        this.items = items;
        this.application = application;
        buildGui();
    }

    @SneakyThrows
    private void buildGui() {

    }

    public void setItems(List<RSSItem> items) {

    }

    private void createContent() {

    }

}
