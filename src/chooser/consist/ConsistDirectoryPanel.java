package chooser.consist;

import chooser.choose.ChooseFilePanel;
import chooser.tree.DirectoryTreeView;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.Color;

public class ConsistDirectoryPanel extends JPanel {
    private String homeDirectory;
    private String currentDirectory;
    private DisplayPanel displayPanel = null;
    private ChooseFilePanel chooseFilePanel;

    public ConsistDirectoryPanel(String homeDirectory,ChooseFilePanel chooseFilePanel){
        setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        setLayout(new BorderLayout());
        JToolBar changeConsist = new JToolBar("", JToolBar.HORIZONTAL);
        changeConsist.setFloatable(false);

        JToggleButton atHome = new JToggleButton("home",false);

        JToggleButton toTable = new JToggleButton("table",false);
        toTable.addActionListener(new TableDisplayListener(this,changeConsist,chooseFilePanel));
        JToggleButton toList = new JToggleButton("list",true);
        toList.addActionListener(new ListDisplayListener(this,changeConsist,chooseFilePanel));
        JToggleButton toDirectory = new JToggleButton("directory",false);
        toDirectory.addActionListener(new DirectoryDisplayListener(this,changeConsist,chooseFilePanel));

        changeConsist.add(atHome);
        changeConsist.add(toTable);
        changeConsist.add(toList);
        changeConsist.add(toDirectory);
        add(changeConsist,BorderLayout.NORTH);

        this.homeDirectory = homeDirectory;
        currentDirectory = homeDirectory;
        this.chooseFilePanel = chooseFilePanel;
        displayPanel = new ListDisplayPanel(this,currentDirectory,chooseFilePanel);
        add(displayPanel, BorderLayout.CENTER);
    }

    public String getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(String currentDirectory) {
        this.currentDirectory = currentDirectory;
        changeConsist();
    }

    public void changeConsist(){
        displayPanel.setConsist(currentDirectory);
    }

    public DisplayPanel getDisplayPanel() {
        return displayPanel;
    }

    public void setDisplayPanel(DisplayPanel displayPanel) {
        this.displayPanel = displayPanel;
    }

    public ChooseFilePanel getChooseFilePanel() {
        return chooseFilePanel;
    }
}
