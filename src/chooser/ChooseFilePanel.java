package chooser;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

public class ChooseFilePanel extends JPanel{
    private JTextField enterFileName;

    public ChooseFilePanel(){
        setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        JLabel fileName = new JLabel("Name:");
        enterFileName = new JTextField("",30);
        JComboBox<String> filtreFile = new JComboBox<String>(ChooserConst.FILTRE);
        JButton enterButton = new JButton("OK");
        JButton cancelButton = new JButton("CANCEL");
        add(fileName);
        add(enterFileName);
        add(filtreFile);
        add(enterButton);
        add(cancelButton);
    }
}
