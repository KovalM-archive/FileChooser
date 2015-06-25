package chooser.consist;

import javax.swing.*;

public class ListDisplayListener extends ModeListener {
    public ListDisplayListener(ConsistDirectoryPanel consistDirectoryPanel, JToolBar changeConsist) {
        super(consistDirectoryPanel, changeConsist);
    }

    protected void changeMode(){
        consistDirectoryPanel.setDisplayPanel(new ListDisplayPanel(consistDirectoryPanel,consistDirectoryPanel.getCurrentDirectory()));
    }
}
