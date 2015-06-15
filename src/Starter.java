import chooser.FileChooser;

import javax.swing.SwingUtilities;

public class Starter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new FileChooser().showInputDialog(null);
            }
        });
    }
}
