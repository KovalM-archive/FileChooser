package chooser.consist;

import chooser.tree.DirectoryTreeView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToHomeListener implements ActionListener {
    private ConsistDirectoryPanel consistDirectoryPanel;
    private String homeDirectory;

    public GoToHomeListener(ConsistDirectoryPanel consistDirectoryPanel,String homeDirectory){
        this.consistDirectoryPanel = consistDirectoryPanel;
        this.homeDirectory = homeDirectory;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        consistDirectoryPanel.setCurrentDirectory(homeDirectory);
    }
}
