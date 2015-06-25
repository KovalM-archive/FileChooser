package chooser.tree;

import javax.swing.JTree;

public class DirectoryTreeView extends JTree {
    private DirectoryTreeModel directoryTreeModel;
    public DirectoryTreeView(DirectoryTreeModel directoryTreeModel){
        super(directoryTreeModel);
        this.directoryTreeModel = directoryTreeModel;
    }
}
