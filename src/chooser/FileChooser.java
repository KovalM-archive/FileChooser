package chooser;

import chooser.choose.ChooserConst;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class FileChooser {
    private String homeDirectory;

    public FileChooser(){
        homeDirectory = ChooserConst.NAME_TREE_ROOT;
    }
    public FileChooser(String homeDirectory){
        this.homeDirectory = homeDirectory;
    }

    public void showInputDialog(JFrame mainWindow){
        JDialog inputDialog = new JDialog(mainWindow,"Addition of student",false);
        inputDialog.setSize(750, 500);
        inputDialog.setLocationRelativeTo(null);
        inputDialog.setVisible(true);
        inputDialog.add(new FileChooserPanel(homeDirectory));
    }
}
