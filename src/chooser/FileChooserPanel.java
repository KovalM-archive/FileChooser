package chooser;

import chooser.tree.TreeDirectoryPanel;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class FileChooserPanel extends JPanel {
    private ChooseFilePanel chooseFilePanel;
    private TreeDirectoryPanel treeDirectoryPanel;
    private ConsistDirectoryPanel consistDirectoryPanel;

    public FileChooserPanel(){
        setLayout(null);
        chooseFilePanel = new ChooseFilePanel();
        treeDirectoryPanel = new TreeDirectoryPanel();
        consistDirectoryPanel = new ConsistDirectoryPanel();
        treeDirectoryPanel.setBounds(0,0,200,400);
        consistDirectoryPanel.setBounds(200,0,500,400);
        chooseFilePanel.setBounds(0,400,700,100);
        add(chooseFilePanel,BorderLayout.SOUTH);
        add(treeDirectoryPanel,BorderLayout.WEST);
        add(consistDirectoryPanel,BorderLayout.CENTER);
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
