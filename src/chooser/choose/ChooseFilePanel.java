package chooser.choose;

import chooser.consist.ConsistDirectoryPanel;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseFilePanel extends JPanel{
    private JTextField enterFileName;
    private ConsistDirectoryPanel consistDirectoryPanel;
    private JComboBox<String> filtreFile;

    public ChooseFilePanel(){
        setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        JLabel fileName = new JLabel("Name:");
        enterFileName = new JTextField("",30);
        filtreFile = new JComboBox<String>(ChooserConst.FILTRE);
        filtreFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consistDirectoryPanel.changeConsist();
                enterFileName.setText("");
            }
        });
        JButton enterButton = new JButton("OK");
        JButton cancelButton = new JButton("CANCEL");
        add(fileName);
        add(enterFileName);
        add(filtreFile);
        add(enterButton);
        add(cancelButton);
    }

    public void changeSelectedFile(String name){
        enterFileName.setText(name);
    }

    public ConsistDirectoryPanel getConsistDirectoryPanel() {
        return consistDirectoryPanel;
    }

    public void setConsistDirectoryPanel(ConsistDirectoryPanel consistDirectoryPanel) {
        this.consistDirectoryPanel = consistDirectoryPanel;
    }

    public boolean checkFile(String name){
        int count = ChooserConst.FILTRE.length;
        String selected = (String)filtreFile.getSelectedItem();
        if (selected.equals("ALL")){
            return true;
        }
        for (int i = 0; i < count; i++) {
            if (selected.equals(ChooserConst.FILTRE[i])){
                if (name.contains(ChooserConst.EXTENSION[i])){
                    return true;
                }
            }
        }

        return false;
    }
}
