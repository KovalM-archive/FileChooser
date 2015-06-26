package chooser;

import chooser.choose.ChooserConst;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class FileChooser {
    private String homeDirectory;
    private File selectedFile;
    private boolean selectedFlag;
    private int mode;
    JDialog inputDialog;

    public FileChooser(){
        homeDirectory = ChooserConst.NAME_TREE_ROOT;
    }
    public FileChooser(String homeDirectory){
        this.homeDirectory = homeDirectory;
    }

    public void showOpenDialog(JFrame mainWindow){
        setMode(ChooserConst.OPEN_MODE);
        createFileChooserDialog(mainWindow);
    }

    public void showSaveDialog(JFrame mainWindow){
        setMode(ChooserConst.SAVE_MODE);
        createFileChooserDialog(mainWindow);
    }

    private void createFileChooserDialog(JFrame mainWindow){
        setSelectedFile(null);
        setSelectedFlag(false);
        inputDialog = new JDialog(mainWindow,"Addition of student",true);
        //inputDialog.setContentPane(new JOptionPane());
        inputDialog.setSize(750, 500);
        inputDialog.setLocationRelativeTo(null);
        inputDialog.add(new FileChooserPanel(homeDirectory, this));
        inputDialog.setVisible(true);
    }

    public void closeDialog(){
        inputDialog.dispose();
        inputDialog = null;
    }
    public File getSelectedFile() {
        return selectedFile;
    }

    public boolean isSelectedFlag() {
        return selectedFlag;
    }

    public void setSelectedFlag(boolean selectedFlag) {
        this.selectedFlag = selectedFlag;
    }

    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }
}
