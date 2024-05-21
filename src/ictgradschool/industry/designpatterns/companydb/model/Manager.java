package ictgradschool.industry.designpatterns.companydb.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A special type of Employee that can also manage other employees.
 * <p>
 * Each Manager can manage many Employees, but each Employee can only have one direct Manager.
 */
public class Manager extends Employee {


    /**
     * Creates a new manager
     *
     * @param id       the manager id
     * @param name     the manager's name
     * @param email    the manager's email address
     * @param jobTitle the manager's job title
     * @param salary   the manager's salary
     */

    private int id;
    private String name;
    private String email;
    private String jobTitle;
    private int salary;
    private List<Employee> employeeList = new ArrayList<>();

    public Manager(int id, String name, String email, String jobTitle, int salary) {
        super(id, name, email, jobTitle, salary);
    }

    /**
     * Gets all employees managed by this manager. The returned List must not be able to be directly modified. Investigate
     * the {@link Collections} class for info on how this might be achieved.
     *
     * @return an unmodifiable list of employees
     */
    public List<Employee> getEmployees() {
        // TODO complete this
        return Collections.unmodifiableList(employeeList);
    }

    /**
     * Sets up the given employee to be managed by this manager. In addition to adding the employee to this manager's
     * employees list, the method should remove it from its old manager's list, if any, and set the employee's manager
     * field appropriately.
     *
     * @param employee the employee to be managed by this manager
     * @throws NullPointerException if the employee is null
     */
    public void addEmployee(Employee employee) {
        // TODO complete this

        try {
            if (employee.getManager() != null){
                employee.getManager().removeEmployee(employee);
            }
            employeeList.add(employee);
            employee.setManager(this);
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    /**
     * Removes the given employee from this manager. If the given employee isn't managed by this manager, this method
     * should do nothing.
     *
     * @param employee
     * @throws NullPointerException if the employee is null
     */
    public void removeEmployee(Employee employee) {
        // TODO complete this

        try {
            if (employee.getManager() == this){
                this.removeEmployee(employee);
            }
        } catch (NullPointerException e){
            e.printStackTrace();
        }

    }

    /**
     * Gets a list of all employees starting with this one, and including all descendents. This list should be
     * generated using pre-order traversal of the employment hierarchy.
     * <p>
     * For example, if this employee is "The Boss", and this is the boss's employment hierarchy:
     * <ul>
     *     <li>The Boss</li>
     *     <li><ul>
     *         <li>Anne</li>
     *         <li><ul>
     *             <li>Caitlin</li>
     *         </ul></li>
     *         <li>Bob</li>
     *         <li><ul>
     *             <li>Dave</li>
     *             <li>Eve</li>
     *         </ul></li>
     *     </ul></li>
     * </ul>
     * Then, this should be the list returned:
     * <ul>
     *     <li>The Boss</li>
     *     <li>Anne</li>
     *     <li>Caitlin</li>
     *     <li>Bob</li>
     *     <li>Dave</li>
     *     <li>Eve</li>
     * </ul>
     * <p>
     * See: https://www.tutorialspoint.com/data_structures_algorithms/tree_traversal.htm
     *
     * @return a list containing this employee and all employees directly or indirectly managed by this employee
     */
    public List<Employee> getAllEmployees() {
        // TODO complete this
        return null;
    }

    /**
     * Returns a value indicating whether the given object is equal to this one. The given object is considered equal if
     * it is non-null, is a Manager, its superclass equals returns true, and its employees list is equal to this object's
     * employees list.
     * <p>
     * HINT: If you like, you should investigate IntelliJ's ability to automatically generate the equals() and
     * hashCode() methods, then customize the generated result to your needs if necessary.
     * <p>
     * HINT 2: a List's equals() method returns true if the other object is a List with the same elements in the same
     * order (i.e. you don't manually need a loop etc. to check for List equality).
     *
     * @param o the object to check
     * @return true if the object meets the conditions outlined above, false otherwise
     */
    // TODO override and implement equals()

    /**
     * Returns this object's hash code. Based on the superclass hashcode plus this object's employees list, to ensure
     * consistency with equals().
     * <p>
     * HINT: If you like, you should investigate IntelliJ's ability to automatically generate the equals() and
     * hashCode() methods, then customize the generated result to your needs if necessary.
     */
    // TODO override and implement hashCode()
}
