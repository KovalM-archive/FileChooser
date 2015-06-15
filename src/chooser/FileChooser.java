package chooser;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class FileChooser {

    public void showInputDialog(JFrame mainWindow){
        JDialog inputDialog = new JDialog(mainWindow,"Addition of student",false);
        inputDialog.setSize(700, 500);
        inputDialog.setLocationRelativeTo(null);
        inputDialog.setVisible(true);
        inputDialog.add(new FileChooserPanel());
    }
}
