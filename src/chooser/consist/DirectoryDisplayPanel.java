package chooser.consist;

import chooser.choose.ChooseFilePanel;

public class DirectoryDisplayPanel extends DisplayPanel{
    public DirectoryDisplayPanel(ConsistDirectoryPanel consistDirectoryPanel, String directoryName,ChooseFilePanel chooseFilePanel) {
        super(consistDirectoryPanel,directoryName,chooseFilePanel);
    }

    public void changedConsist(){
    }
}
