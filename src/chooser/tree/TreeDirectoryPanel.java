package chooser.tree;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;

public class TreeDirectoryPanel extends JPanel {
    private DirectoryTreeView directoryTreeView;

    public TreeDirectoryPanel(){
        setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        setLayout(new BorderLayout());
        directoryTreeView = new DirectoryTreeView(new DirectoryTreeModel());
        add(new JScrollPane(directoryTreeView),BorderLayout.CENTER);
    }
}
