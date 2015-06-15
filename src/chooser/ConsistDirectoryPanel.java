package chooser;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.Color;

public class ConsistDirectoryPanel extends JPanel {

    public ConsistDirectoryPanel(){
        setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        setLayout(new BorderLayout());
        JToolBar changeConsist = new JToolBar("", JToolBar.HORIZONTAL);
        changeConsist.setFloatable(false);
        JButton atHome = new JButton("home");
        JToggleButton toTable = new JToggleButton("table",true);
        JToggleButton toList = new JToggleButton("list",false);
        JToggleButton toDirectory = new JToggleButton("directory",false);
        changeConsist.add(atHome);
        changeConsist.add(toTable);
        changeConsist.add(toList);
        changeConsist.add(toDirectory);
        add(changeConsist,BorderLayout.NORTH);
    }
}
