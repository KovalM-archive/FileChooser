package chooser.consist;

import chooser.choose.ChooseFilePanel;

import javax.swing.*;
import java.awt.*;

public class TableDisplayPanel extends DisplayPanel {
    private JTable tableFile;

    public TableDisplayPanel(ConsistDirectoryPanel consistDirectoryPanel, String directoryName,ChooseFilePanel chooseFilePanel) {
        super(consistDirectoryPanel ,directoryName, chooseFilePanel);
    }

    public void changedConsist(){
        tableFile.setModel(new TableDisplayModel(listOfFiles));
    }

    public void setProperty(){
        tableFile = new JTable();
        tableFile.addMouseListener(new TableSelectedListener(tableFile,consistDirectoryPanel));
        JScrollPane scroll = new JScrollPane(tableFile);
        scroll.setPreferredSize(new Dimension(getWidth(),getHeight()));
        add(scroll, BorderLayout.CENTER);
    }
}
