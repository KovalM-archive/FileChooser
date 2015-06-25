package chooser.consist;

import javax.swing.*;

public class DirectoryDisplayListener extends ModeListener{
    public DirectoryDisplayListener(ConsistDirectoryPanel consistDirectoryPanel, JToolBar changeConsist) {
        super(consistDirectoryPanel, changeConsist);
    }

    protected void changeMode(){
        consistDirectoryPanel.setDisplayPanel(new DirectoryDisplayPanel(consistDirectoryPanel,consistDirectoryPanel.getCurrentDirectory()));
    }
}
