package chooser.consist;

import chooser.choose.ChooseFilePanel;

import javax.swing.*;

public class DirectoryDisplayListener extends ModeListener{
    public DirectoryDisplayListener(ConsistDirectoryPanel consistDirectoryPanel, JToolBar changeConsist,ChooseFilePanel chooseFilePanel) {
        super(consistDirectoryPanel, changeConsist, chooseFilePanel);
    }

    protected void changeMode(){
        consistDirectoryPanel.setDisplayPanel(new DirectoryDisplayPanel(consistDirectoryPanel,
                consistDirectoryPanel.getCurrentDirectory(),chooseFilePanel));
    }
}
