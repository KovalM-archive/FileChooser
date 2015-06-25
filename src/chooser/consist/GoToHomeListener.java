package chooser.consist;

import chooser.tree.DirectoryTreeView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToHomeListener implements ActionListener {
    private DirectoryTreeView directoryTreeView;
    public GoToHomeListener(DirectoryTreeView directoryTreeView){
        this.directoryTreeView = directoryTreeView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(System.getProperty("user.dir"));

    }
}
