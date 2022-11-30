//
package src;

public class Instructor {
    // Create private variables
    private String instructorName;
    private String nNumber;
    private String officeNumber;
    private String Department;
    private String Age;

    public Instructor(String instructorName, String nNumber, String officeNumber, String Department, String Age) {
        this.instructorName = instructorName;
        this.nNumber = nNumber;
        this.officeNumber = officeNumber;
        this.Department = Department;
        this.Age = Age;
    }

    // Create getters and setters
    public String getInstructorName() {
        return instructorName;
    }

    public String getnNumber() {
        return nNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getDepartment() {
        return Department;
    }

    public String getAge() {
        return Age;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setnNumber(String nNumber) {
        this.nNumber = nNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public void setAge(String age) {
        this.Age = age;

    }
}
