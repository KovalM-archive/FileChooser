package chooser.consist;

import javax.swing.table.AbstractTableModel;
import java.io.File;

public class TableDisplayModel extends AbstractTableModel {
    private File[] listFile;

    public TableDisplayModel(File[] newFile){
        listFile = newFile;
    }
    @Override
    public int getRowCount() {
        return listFile.length;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            if (listFile[rowIndex].getName().equals("")) {
                return listFile[rowIndex].getAbsolutePath();
            } else {
                if(listFile[rowIndex].isDirectory()){
                    return listFile[rowIndex].getName();
                } else{
                    String name = listFile[rowIndex].getName();
                    int left = -1, count = name.length();
                    for (int i = 0; i < count; i++) {
                        if (name.charAt(i) == '.') {
                            left = i;
                            break;
                        }
                    }
                    if (left == -1) {
                        return name;
                    }

                    String newName = new String();
                    for (int i = 0; i < left; i++) {
                        newName = newName + name.charAt(i);
                    }
                    return newName;
                }

            }
        } else if (columnIndex == 1) {
            if (listFile[rowIndex].isDirectory()) {
                return "папка";
            } else {
                String name = listFile[rowIndex].getName();
                int left = -1, count = name.length();
                for (int i = 0; i < count; i++) {
                    if (name.charAt(i) == '.') {
                        left = i;
                        break;
                    }
                }
                if (left == -1) {
                    return "неизвестный файл";
                }

                String newName = new String();
                for (int i = left + 1; i < count; i++) {
                    newName = newName + name.charAt(i);
                }
                newName += "-файл";
                return newName;
            }
        } else if (columnIndex == 2) {
            return null;
        } else {
            return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        String columnName[] ={
                "имя",
                "тип",
                "размер",
                "дата изменения",
        };
        return columnName[column];
    }
}
