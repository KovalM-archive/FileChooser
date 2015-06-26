package chooser.consist;

import chooser.choose.ChooseFilePanel;


import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TableDisplayListener extends ModeListener {
    public TableDisplayListener(ConsistDirectoryPanel consistDirectoryPanel,JToolBar changeConsist,ChooseFilePanel chooseFilePanel){
        super(consistDirectoryPanel,changeConsist,chooseFilePanel);
    }

    protected void changeMode(){
        TableDisplayPanel newTable = new TableDisplayPanel(consistDirectoryPanel,
                consistDirectoryPanel.getCurrentDirectory(),chooseFilePanel);
        consistDirectoryPanel.setDisplayPanel(newTable);
    }
}
