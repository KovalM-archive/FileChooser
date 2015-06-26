import chooser.FileChooser;

import javax.swing.*;


public class Starter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                FileChooser test = new FileChooser();
                test.showSaveDialog(null);
                if (test.isSelectedFlag()){
                    System.out.println(test.getSelectedFile().getAbsolutePath());
                }
            }
        });
    }
}
