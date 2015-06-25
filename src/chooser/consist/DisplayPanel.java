package chooser.consist;

import chooser.ChooserConst;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public abstract class DisplayPanel extends JPanel {
    protected File[] listOfFiles;
    protected ConsistDirectoryPanel consistDirectoryPanel;

    public DisplayPanel(ConsistDirectoryPanel consistDirectoryPanel,String directoryName){
        this.consistDirectoryPanel = consistDirectoryPanel;
        setLayout(new BorderLayout());
        setProperty();
        setConsist(directoryName);
    }

    public void changedConsist(){

    }

    public void setProperty(){

    }

    public void setConsist(String directoryName){
        if (directoryName.equals(ChooserConst.NAME_TREE_ROOT)){
            listOfFiles = File.listRoots();
        } else{
            File folder = new File(directoryName);
            listOfFiles = folder.listFiles();
        }
        changedConsist();
    }
}
