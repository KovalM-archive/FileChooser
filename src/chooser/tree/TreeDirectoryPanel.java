package chooser.tree;

import chooser.consist.ConsistDirectoryPanel;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;

public class TreeDirectoryPanel extends JPanel {
    private DirectoryTreeView directoryTreeView;

    public TreeDirectoryPanel(ConsistDirectoryPanel consistDirectoryPanel){
        setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        setLayout(new BorderLayout());
        directoryTreeView = new DirectoryTreeView(new DirectoryTreeModel());
        directoryTreeView.addTreeSelectionListener(new DirectorySelectedListener(consistDirectoryPanel));
        add(new JScrollPane(directoryTreeView), BorderLayout.CENTER);
    }

    public DirectoryTreeView getDirectoryTreeView(){
        return directoryTreeView;
    }
}
