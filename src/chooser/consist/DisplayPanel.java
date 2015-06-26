package chooser.consist;

import chooser.choose.ChooseFilePanel;
import chooser.choose.ChooserConst;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public abstract class DisplayPanel extends JPanel {
    protected File[] listOfFiles;
    protected ConsistDirectoryPanel consistDirectoryPanel;
    protected ChooseFilePanel chooseFilePanel;

    public DisplayPanel(ConsistDirectoryPanel consistDirectoryPanel,String directoryName,ChooseFilePanel chooseFilePanel){
        this.consistDirectoryPanel = consistDirectoryPanel;
        this.chooseFilePanel = chooseFilePanel;
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
        listOfFiles = sortFile(listOfFiles);
        changedConsist();
    }

    protected File[] sortFile(File[] oldList){
        File[] newList = new File[oldList.length];
        int qe=0;
        for (int i = 0; i < oldList.length; i++) {
            if (oldList[i].isDirectory()){
                newList[qe] = oldList[i];
                qe++;
            }
        }

        for (int i = 0; i < oldList.length; i++) {
            if (oldList[i].isFile()){
                newList[qe] = oldList[i];
                qe++;
            }
        }
        return newList;
    }
}
