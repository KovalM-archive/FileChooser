package chooser.tree;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NodeDirectoryTree {
    private String fullPath;
    private List<NodeDirectoryTree> sonsList;
    private boolean sonsIsCreate;

    public NodeDirectoryTree(String fullPath){
        this.fullPath = fullPath;
    }

    public String toString(){
        String name = new String();

        int n = fullPath.length();
        for (int i = n-1; i >=0; i--) {
            if (fullPath.charAt(i) == '/' && i!=n-1){
                break;
            }
            name = fullPath.charAt(i) + name;
        }
        return name;
    }

    public Object getChild(int index) {
        if (!sonsIsCreate){
            createSonsList();
        }
        return sonsList.get(index);
    }

    public int getChildCount() {
        if (!sonsIsCreate){
            createSonsList();
        }
        return sonsList.size();
    }

    public boolean isLeaf(){
        File f = new File(fullPath);
        return f.isFile();
    }

    public int getIndexOfChild(Object node){
        if (!sonsIsCreate){
            createSonsList();
        }
        NodeDirectoryTree son = (NodeDirectoryTree)node;
        return sonsList.indexOf(son);
    }

    private void createSonsList(){
        sonsIsCreate = true;
        sonsList = new ArrayList<NodeDirectoryTree>();
        File[] listOfFiles;
        if (fullPath.equals("/home")){
            listOfFiles = File.listRoots();
        } else{
            File folder = new File(fullPath);
            listOfFiles = folder.listFiles();
        }

        int n = listOfFiles.length;
        for (int i = 0; i < n; i++) {
            if (listOfFiles[i].isDirectory()){
                if (fullPath.equals("/home")){
                    String name = new String();
                    String path = listOfFiles[i].getAbsolutePath();
                    int m = path.length();
                    for (int j=0; j<m-1; j++){
                        name = name + path.charAt(j);
                    }
                    sonsList.add(new NodeDirectoryTree("/" + name + "/"));
                }else {
                    sonsList.add(new NodeDirectoryTree(fullPath + "/" + listOfFiles[i].getName()));
                }
            }
        }
    }
}
