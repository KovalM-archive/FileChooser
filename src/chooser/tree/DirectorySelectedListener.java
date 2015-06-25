package chooser.tree;

import chooser.consist.ConsistDirectoryPanel;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class DirectorySelectedListener implements TreeSelectionListener{
    private ConsistDirectoryPanel consistDirectoryPanel;

    public DirectorySelectedListener(ConsistDirectoryPanel consistDirectoryPanel){
        this.consistDirectoryPanel = consistDirectoryPanel;
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        NodeDirectoryTree node = (NodeDirectoryTree)e.getPath().getLastPathComponent();
        consistDirectoryPanel.setCurrentDirectory(node.getFullPath());
    }
}
