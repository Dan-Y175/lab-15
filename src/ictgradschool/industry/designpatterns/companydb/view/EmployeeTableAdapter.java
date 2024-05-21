package ictgradschool.industry.designpatterns.companydb.view;

import ictgradschool.industry.designpatterns.companydb.model.Employee;
import ictgradschool.industry.designpatterns.companydb.model.Manager;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.Optional;

public class EmployeeTableAdapter extends AbstractTableModel {

    public EmployeeTableAdapter(Manager boss) {
        // TODO complete this
    }

    @Override
    public int getRowCount() {
        // TODO complete this
        return 0;
    }

    @Override
    public int getColumnCount() {
        // TODO complete this
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO complete this
        return null;
    }

    @Override
    public String getColumnName(int column) {
        // TODO complete this
        return "";
    }

    // *** Exercise Four below this point ***
    // TODO (optional) override and implement isCellEditable(), setValueAt()

}
