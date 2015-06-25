package chooser;

import chooser.choose.ChooseFilePanel;
import chooser.consist.ConsistDirectoryPanel;
import chooser.tree.TreeDirectoryPanel;

import javax.swing.*;
import java.awt.BorderLayout;

public class FileChooserPanel extends JPanel {
    private ChooseFilePanel chooseFilePanel;
    private TreeDirectoryPanel treeDirectoryPanel;
    private ConsistDirectoryPanel consistDirectoryPanel;
    private String homeDirectory;

    public FileChooserPanel(String homeDirectory){
        this.homeDirectory = homeDirectory;
        setLayout(null);
        chooseFilePanel = new ChooseFilePanel();
        consistDirectoryPanel = new ConsistDirectoryPanel(homeDirectory,chooseFilePanel);
        chooseFilePanel.setConsistDirectoryPanel(consistDirectoryPanel);
        treeDirectoryPanel = new TreeDirectoryPanel(consistDirectoryPanel);
        treeDirectoryPanel.setBounds(0,0,200,400);
        consistDirectoryPanel.setBounds(200,0,500,400);
        chooseFilePanel.setBounds(0,400,700,100);
        add(chooseFilePanel,BorderLayout.SOUTH);
        add(treeDirectoryPanel,BorderLayout.WEST);
        add(consistDirectoryPanel,BorderLayout.CENTER);

        /*JPanel test = new JPanel();
        test.setLayout(new BorderLayout());
        test.setBounds(200,0,500,400);
        String[] data = {"1","2","3"};
        test.add(new JList<String>(data),BorderLayout.CENTER);
        add(test,BorderLayout.CENTER);*/
    }

    public ChooseFilePanel getChooseFilePanel() {
        return chooseFilePanel;
    }

    public void setChooseFilePanel(ChooseFilePanel chooseFilePanel) {
        this.chooseFilePanel = chooseFilePanel;
    }

    public TreeDirectoryPanel getTreeDirectoryPanel() {
        return treeDirectoryPanel;
    }

    public void setTreeDirectoryPanel(TreeDirectoryPanel treeDirectoryPanel) {
        this.treeDirectoryPanel = treeDirectoryPanel;
    }

    public ConsistDirectoryPanel getConsistDirectoryPanel() {
        return consistDirectoryPanel;
    }

    public void setConsistDirectoryPanel(ConsistDirectoryPanel consistDirectoryPanel) {
        this.consistDirectoryPanel = consistDirectoryPanel;
    }
}
