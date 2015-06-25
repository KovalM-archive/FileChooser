package chooser.consist;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;

public class TableDisplayListener extends ModeListener {
    public TableDisplayListener(ConsistDirectoryPanel consistDirectoryPanel,JToolBar changeConsist){
        super(consistDirectoryPanel,changeConsist);
    }

    protected void changeMode(){
        consistDirectoryPanel.setDisplayPanel(new TableDisplayPanel(consistDirectoryPanel, consistDirectoryPanel.getCurrentDirectory()));
    }
}
