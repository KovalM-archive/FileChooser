package chooser.consist;

import javax.swing.*;
import javax.swing.plaf.ListUI;
import java.awt.*;

public class ListDisplayPanel extends DisplayPanel {
    DefaultListModel listModel;

    public ListDisplayPanel(ConsistDirectoryPanel consistDirectoryPanel, String directoryName) {
        super(consistDirectoryPanel,directoryName);
    }

    public void changedConsist(){
        listModel.clear();
        int count = listOfFiles.length;
        for (int i = 0; i < count; i++) {
            String name;
            if (listOfFiles[i].getName().equals("")){
                name = listOfFiles[i].getAbsolutePath();
            } else{
                name = listOfFiles[i].getName();
            }
            listModel.addElement(name);
        }
    }

    public void setProperty(){
        listModel = new DefaultListModel();
        JList listVisibly = new JList(listModel);
        listVisibly.setVisibleRowCount(20);
        listVisibly.setLayoutOrientation(JList.VERTICAL_WRAP);
        JScrollPane scroll = new JScrollPane(listVisibly);
        scroll.setPreferredSize(new Dimension(getWidth(),getHeight()));
        add(scroll, BorderLayout.CENTER);
    }
}
