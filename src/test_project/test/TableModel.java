package test_project.test;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * Created by IT on 05.05.2016.
 */
public class TableModel extends AbstractTableModel {

    private int columnCount = 2;
    private ArrayList<String[]> dataArrayList;

    public TableModel() {
        dataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "name";
            case 1:
                return "phone";
        }
        return "";
    }

    @Override
    //количество строк
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    //количество колонок
    public int getColumnCount() {

        return columnCount;
    }

    @Override
    //получает значение с конкретной ячейки таблицы
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = dataArrayList.get(rowIndex);

        return rows[columnIndex];
    }

    public void addDate(String[] row) {
        String[] rowTable = new String[getColumnCount()];
        rowTable = row;
        dataArrayList.add(rowTable);
    }


}
