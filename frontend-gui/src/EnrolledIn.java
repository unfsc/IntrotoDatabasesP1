package src;

public class EnrolledIn {
    //Create private variables
    private String studentID;
    private String courseID;
    private String grade;
    private String Semester;
    private String Year;

    //Create getters and setters
    public String getStudentID() {
        return studentID;
    }
    public String getCourseID() {
        return courseID;
    }
    public String getGrade() {
        return grade;
    }
    public String getSemester() {
        return Semester;
    }
    public String getYear() {
        return Year;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setSemester(String semester) {
        this.Semester = semester;
    }
    public void setYear(String year) {
        this.Year = year;
    }


}
