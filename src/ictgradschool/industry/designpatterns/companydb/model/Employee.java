package ictgradschool.industry.designpatterns.companydb.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Intended to represent an employee at a company. Each employee has a number of info fields,
 * and can be managed by a Manager.
 */
public class Employee {

    /**
     * Creates a new employee
     *
     * @param id       the employee id
     * @param name     the employee's name
     * @param email    the employee's email address
     * @param jobTitle the employee's job title
     * @param salary   the employee's salary
     */

    private int id;
    private String name;
    private String email;
    private String jobTitle;
    private int salary;
    private Manager manager;


    public Employee(int id, String name, String email, String jobTitle, int salary) {
        // TODO complete this
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }




    /**
     * Gets this employee's Manager, if any.
     *
     * @return the employee's manager, or null if the employee has no manager
     */
    public Manager getManager() {
        // TODO complete this
        return this.manager;
    }


    public void setManager(Manager manager) {
        this.manager = manager;
    }

    /**
     * Gets the total "reporting chain" for this employee. This is essentially a list of employees starting at the root
     * of the employment hierarchy. Examples:
     * <p>
     * If this employee has no manager, the list will just contain this employee.
     * <p>
     * If this employee has a manager, then the list will contain its manager's reporting chain, with this employee
     * added at the end.
     *
     * @return this employee's reporting chain, as a List.
     */
    public List<Employee> getReportingChain() {
        // TODO complete this
        List<Employee> reportingChain = new ArrayList<>();

        if (getManager() == null) {
            return reportingChain;
        }
        reportingChain.add(this);
        return getManager().getReportingChain();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * Gets a string representation of this employee, which should be of the form: name (email: email)
     */
    // TODO override and implement toString()

    /**
     * Gets a value indicating whether this employee is equal to the given object. The object is considered equal if
     * it is non-null, is an Employee, and has a matching id, salary, name, email, and job title.
     * <p>
     * HINT: If you like, you should investigate IntelliJ's ability to automatically generate the equals() and
     * hashCode() methods, then customize the generated result to your needs if necessary.
     * <p>
     * HINT 2: Don't include the employee's manager in the equality calculations (or if you do, just check it
     * with == rather than .equals(), or just check the manager's name rather than the whole object). Otherwise, you
     * might run into a StackOverflowError (I'll leave it as an exercise to the reader to figure out why this might be).
     *
     * @param o the object to check
     * @return true if the given object meets the conditions described above; false otherwise
     */
    // TODO override and implement equals()

    /**
     * Gets this employee's hash code. The hash is based on its id, name, email, job title, and salary, to ensure
     * consistency with its equals() method.
     * <p>
     * HINT: If you like, you should investigate IntelliJ's ability to automatically generate the equals() and
     * hashCode() methods, then customize the generated result to your needs if necessary.
     */
    // TODO override and implement hashCode()
}
