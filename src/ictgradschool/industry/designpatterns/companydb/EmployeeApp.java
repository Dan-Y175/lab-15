package ictgradschool.industry.designpatterns.companydb;

import ictgradschool.industry.designpatterns.companydb.model.Employee;
import ictgradschool.industry.designpatterns.companydb.model.Manager;
import ictgradschool.industry.designpatterns.companydb.view.EmployeeTableAdapter;
import ictgradschool.industry.designpatterns.companydb.view.EmployeeTreeAdapter;

import javax.swing.*;
import java.awt.*;

/**
 * Main application displaying an employee database. A tree showing the employment hierarchy is displayed on the left,
 * while a table showing employee details is shown on the right.
 *
 * @author Andrew Meads
 */
public class EmployeeApp extends JFrame {

    public EmployeeApp() {

        Manager boss = createAllEmployees();

        initGui(boss);

        setTitle("Programming for Industry lab 15 - Company Database");
        setPreferredSize(new Dimension(1280, 720));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * This method creates some employees and returns the "root" of the employment hierarchy (i.e. the CEO of the company).
     */
    private Manager createAllEmployees() {
        Manager theBoss = new Manager(1, "The Boss", "boss@trex-sandwich.com", "CEO", 200000);

        Manager anne = new Manager(2, "Anne", "anne@trex-sandwich.com", "HR manager", 150000);
        Manager bob = new Manager(3, "Bob", "bob@trex-sandwich.com", "Tech lead", 150000);

        Employee caitlin = new Employee(4, "Caitlin", "caitlin@trex-sandwich.com", "Customer service", 60000);
        Employee dave = new Employee(5, "Dave", "dave@trex-sandwich.com", "Software engineer", 120000);
        Employee eve = new Employee(6, "Eve", "eve@trex-sandwich.com", "UX engineer", 120000);

        theBoss.addEmployee(anne);
        theBoss.addEmployee(bob);
        anne.addEmployee(caitlin);
        bob.addEmployee(dave);
        bob.addEmployee(eve);

        return theBoss;
    }

    /**
     * Build the GUI
     *
     * @param ceo the root of the employment hierarchy we're displaying
     */
    private void initGui(Manager ceo) {

        // Create a tree to display the hierarchy
        JTree tree = new JTree();
        // TODO set the tree model

        // Create a table to display employee details
        JTable table = new JTable();
        JScrollPane tablePane = new JScrollPane(table);
        // TODO set the table model

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(tree, BorderLayout.LINE_START);
        c.add(tablePane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeApp m = new EmployeeApp();
            m.setVisible(true);
        });
    }
}
