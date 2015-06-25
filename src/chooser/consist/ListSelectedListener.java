package chooser.consist;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.File;

public class ListSelectedListener implements ListSelectionListener {
    private JList listVisibly;
    private ConsistDirectoryPanel consistDirectoryPanel;

    public ListSelectedListener(JList listVisibly, ConsistDirectoryPanel consistDirectoryPanel){
        this.consistDirectoryPanel = consistDirectoryPanel;
        this.listVisibly = listVisibly;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String name = (String)listVisibly.getSelectedValue();
        if (name!=null){
            File file = new File(name);
            if (file.isDirectory()){
                consistDirectoryPanel.setCurrentDirectory(name);
            } else {
                consistDirectoryPanel.getChooseFilePanel().changeSelectedFile(file.getName());
            }
        }
    }
}
