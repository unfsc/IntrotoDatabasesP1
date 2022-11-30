package src;

public class Student {
    private String nNumber;

    private String class;

    private degreeType;
    
    //Create getters and setters
    public String getnNumber() {
        return nNumber;
    }
    public String getclass() {
        return class;
    }
    public String getdegreeType() {
        return degreeType;
    }
    public void setnNumber(String nNumber) {
        this.nNumber = nNumber;
    }
    public void setclass(String class) {
        this.class = class;
    }
    public void setdegreeType(String degreeType) {
        this.degreeType = degreeType;
    }
    
}
