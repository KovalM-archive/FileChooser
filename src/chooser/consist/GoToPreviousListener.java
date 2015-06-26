package chooser.consist;

import chooser.choose.ChooserConst;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToPreviousListener implements ActionListener{
    private ConsistDirectoryPanel consistDirectoryPanel;

    public GoToPreviousListener(ConsistDirectoryPanel consistDirectoryPanel){
        this.consistDirectoryPanel = consistDirectoryPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = consistDirectoryPanel.getCurrentDirectory();
        if (!name.equals(ChooserConst.NAME_TREE_ROOT)){
            String newName = new String();
            int count = name.length();
            int stop = -1;
            for (int i = count-1; i >= 0; i--) {
                if (name.charAt(i) == '\\'){
                    stop = i;
                    break;
                }
            }
            for (int j = 0; j < stop; j++){
                newName = newName + name.charAt(j);
            }
            if (!newName.contains("\\") && name.charAt(name.length()-1)=='\\'){
                newName = ChooserConst.NAME_TREE_ROOT;
            } else if (!newName.contains("\\")){
                newName+='\\';
            }
            consistDirectoryPanel.setCurrentDirectory(newName);
        }
    }
}
