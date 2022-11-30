package src;

public class Department {
    // Create private variables
    private String departmentName;
    private String departmentNumber;
    private String departmentDescription;
    private String departmentInstructor;
    private String departmentOffering_Department;
    private String departmentHours;

    public Department(String departmentName, String departmentNumber, String departmentDescription,
            String departmentInstructor, String departmentOffering_Department, String departmentHours) {
        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;
        this.departmentDescription = departmentDescription;
        this.departmentInstructor = departmentInstructor;
        this.departmentOffering_Department = departmentOffering_Department;
        this.departmentHours = departmentHours;
    }

    // Create getters and setters
    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public String getDepartmentInstructor() {
        return departmentInstructor;
    }

    public String getDepartmentOffering_Department() {
        return departmentOffering_Department;
    }

    public String getDepartmentHours() {
        return departmentHours;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentNumber(String departmentCode) {
        this.departmentNumber = departmentNumber;
    }

    public void setDepartmentDescription(String departmentAddress) {
        this.departmentDescription = departmentDescription;
    }

    public void setDepartmentInstructor(String officePhone) {
        this.departmentInstructor = departmentInstructor;
    }

    public void setDepartmentOffering_Department(String College) {
        this.departmentOffering_Department = departmentOffering_Department;
    }

    public void setDepartmentHours(String departmentHours) {
        this.departmentHours = departmentHours;
    }

}
