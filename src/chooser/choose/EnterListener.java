package chooser.choose;

import chooser.FileChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class EnterListener implements ActionListener {
    private FileChooser fileChooser;
    private ChooseFilePanel chooseFilePanel;

    public EnterListener(FileChooser fileChooser,ChooseFilePanel chooseFilePanel){
        this.fileChooser = fileChooser;
        this.chooseFilePanel = chooseFilePanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = chooseFilePanel.getConsistDirectoryPanel().getCurrentDirectory() +
                "\\"+
                chooseFilePanel.getSelectedFile();
        fileChooser.setSelectedFlag(true);
        fileChooser.setSelectedFile(new File(name));
        fileChooser.closeDialog();
    }
}
