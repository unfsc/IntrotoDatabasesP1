package src;

public class Course {
    // Create private variables
    private String courseName;
    private String courseNumber;
    private String Description;
    private String Instructor;
    private String Offering_Department;
    private String Hours;

    public Course(String courseName, String courseNumber, String Description, String Instructor,
            String Offering_Department, String Hours) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.Description = Description;
        this.Instructor = Instructor;
        this.Offering_Department = Offering_Department;
        this.Hours = Hours;
    }

    // Create getters and setters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getDescription() {
        return Description;
    }

    public String getInstructor() {
        return Instructor;
    }

    public String getOffering_Department() {
        return Offering_Department;
    }

    public String getHours() {
        return Hours;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public void setInstructor(String instructor) {
        this.Instructor = instructor;
    }

    public void setOffering_Department(String offering_Department) {
        this.Offering_Department = offering_Department;
    }

    public void setHours(String hours) {
        this.Hours = hours;
    }

}
