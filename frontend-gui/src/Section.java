package src;

public class Section {
    public Section() {
        private String CourseNumber;
        private String SectionNumber;
        private String Semester;
        private String Year;
        private String nNumber;

        //Create getters and setters
        public String getCourseNumber() {
            return CourseNumber;
        }
        public String getSectionNumber() {
            return SectionNumber;
        }
        public String getSemester() {
            return Semester;
        }
        public String getYear() {
            return Year;
        }
        public String getnNumber() {
            return nNumber;
        }
        public void setCourseNumber(String courseNumber) {
            this.CourseNumber = courseNumber;
        }
        public void setSectionNumber(String sectionNumber) {
            this.SectionNumber = sectionNumber;
        }
        public void setSemester(String semester) {
            this.Semester = semester;
        }
        public void setYear(String year) {
            this.Year = year;
        }
        public void setnNumber(String nNumber) {
            this.nNumber = nNumber;
        }


    }
}
