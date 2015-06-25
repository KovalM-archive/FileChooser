package chooser.consist;

import chooser.choose.ChooseFilePanel;

import javax.swing.*;

public class ListDisplayListener extends ModeListener {
    public ListDisplayListener(ConsistDirectoryPanel consistDirectoryPanel, JToolBar changeConsist,ChooseFilePanel chooseFilePanel) {
        super(consistDirectoryPanel, changeConsist, chooseFilePanel);
    }

    protected void changeMode(){
        consistDirectoryPanel.setDisplayPanel(new ListDisplayPanel(consistDirectoryPanel,
                consistDirectoryPanel.getCurrentDirectory(),chooseFilePanel));
    }
}
