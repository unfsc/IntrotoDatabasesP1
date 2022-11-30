package src;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.Scanner;

public class Main {
    private static String USERNAME = new String("G16");
    private static String PASSWORD = new String("Fall2022G16");
    private static String DB_URL = new String("jdbc:oracle:thin:@cisvm-oracle.unfcsd.unf.edu:1521:orcl");

    public static String getString() {
        try {
            StringBuffer buffer = new StringBuffer();

            int c = System.in.read();
            while (c != '\n' && c != -1) {
                buffer.append((char) c);
                c = System.in.read();
            }

            return buffer.toString().trim();

        } catch (IOException e) {
            return "";
        }
    }

    public static int getInt() {
        return Integer.parseInt(getString());
    }

    public static float getFloat() {
        return Float.parseFloat(getString());
    }

    private static boolean printSQLExceptions(SQLException ex) {
        boolean rc = false;
        if (ex != null) {
            System.out.println("\nSQL EXCEPTION\n");
            rc = true;
            while (ex != null) {
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("Message:  " + ex.getMessage());
                System.out.println("Vendor:   " + ex.getErrorCode());
                System.out.println("");
                ex = ex.getNextException();
            }
        }
        return rc;
    }

    static public void printDriverInfo(Connection conn) throws SQLException {
        DatabaseMetaData dma = conn.getMetaData();
        System.out.println("Database\t" + dma.getDatabaseProductVersion());
        System.out.println("Driver\t\t" + dma.getDriverVersion());
        System.out.println("URL\t\t" + dma.getURL() + ", user '" +
                dma.getUserName() + "'");
        System.out.println("-------------------------------------");
    }

    static public void displayResultSet(ResultSet rs) throws SQLException {
        int i;
        ResultSetMetaData rsmd = rs.getMetaData();
        int numCols = rsmd.getColumnCount();
        for (i = 1; i <= numCols; i++) {
            if (i > 1)
                System.out.print(",");
            System.out.print(rsmd.getColumnLabel(i));
        }
        System.out.println("\n-------------------------------------");
        while (rs.next()) {
            for (i = 1; i <= numCols; i++) {
                if (i > 1)
                    System.out.print(",");
                System.out.print(rs.getString(i));
            }
            System.out.println("");
        }
    }

    static public boolean printSQLWarnings(SQLWarning warn) throws SQLException {
        boolean rc = false;
        if (warn != null) {
            System.out.println("\n *** Warning ***\n");
            rc = true;
            while (warn != null) {
                System.out.println("SQLState: " + warn.getSQLState());
                System.out.println("Message:  " + warn.getMessage());
                System.out.println("Vendor:   " + warn.getErrorCode());
                System.out.println("");
                warn = warn.getNextWarning();
            }
        }
        return rc;
    }

    public static PreparedStatement addSomeEntity(String entityType, Connection conn)
            throws SQLException {

        Scanner scanner = new Scanner(System.in);

        PreparedStatement pstmt = null;

        switch (entityType.toLowerCase()) {
            case "student":
                pstmt = addStudent(conn);
                break;
            case "department":
                pstmt = addDepartment(conn);
                break;
            case "course":
                // addCourse(conn);
                break;
            case "instructor":
                // addInstructor(conn);
                break;
            case "section":
                // addSection(conn);
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
        return pstmt;

    }

    public static PreparedStatement addSection(Connection conn) throws SQLException {
        return pstmt;
    }

    public static PreparedStatement addInstructor(Connection conn) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO INSTRUCTOR (SSN,N_NUMBER, DEPARTMENT, OFFICE_NO)" +
                        "VALUES ('21-212-2121', 'N09812098', 'Computer Science', 3)");

        System.out.println("Enter the instructor's SSN: ");
        String ssn = getString();
        System.out.println("Enter the instructor's N-Number: ");
        String nNumber = getString();
        System.out.println("Enter the instructor's department: ");
        String department = getString();
        System.out.println("Enter the instructor's office number: ");
        int officeNumber = getInt();
        pstmt.setString(1, ssn);
        pstmt.setString(2, nNumber);
        pstmt.setString(3, department);
        pstmt.setInt(4, officeNumber);

        return pstmt;
    }

    public static PreparedStatement addCourse(Connection conn) throws SQLException {
        return pstmt;
    }

    public static PreparedStatement addDepartment(Connection conn) throws SQLException {

        return pstmt;
    }

    public static PreparedStatement addStudent(Connection conn) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO STUDENT (N_NUMBER, CLASS, DEGREE_TYPE)" +
                        "VALUES (?, ?, ?)");

        System.out.println("Enter student n-number: ");
        String nNumber = getString();
        System.out.println("Enter student class: ");
        String className = getString();
        System.out.println("Enter student degree type: ");
        String degreeType = getString();

        pstmt.setString(1, nNumber);
        pstmt.setString(2, className);
        pstmt.setString(3, degreeType);

        return pstmt;

    }

    private static PreparedStatement addStudentToClass(Connection conn) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO ENROLLED_IN  (N_NUMBER, COURSE_NUMBER)" +
                        "VALUES (?, ?)");

        System.out.println("Enter course number: ");
        String courseName = getString();
        System.out.println("Enter section number: ");
        String sectionNumber = getString();
        System.out.println("Enter semester: ");
        String semester = getString();
        System.out.println("Enter year: ");
        String year = getString();
        System.out.println("Enter n-number: ");
        String nNumber = getString();

        return pstmt;
    }

    public static void getStudentGPA(Connection conn) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement(
                "SELECT GPA FROM STUDENT WHERE N_NUMBER = ?");

        System.out.println("Enter student n-number: ");
        String nNumber = getString();

        pstmt.setString(1, nNumber);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            System.out.println("Student GPA: " + rs.getString(1));
        } else {
            System.out.println("Student not found!");
        }
    }

    private static PreparedStatement addGrade(Connection conn) {
        return null;
    }

    public static void main(String[] args) {

        try {
            // load JDBC driver
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            // establish connection
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            printDriverInfo(conn);

            Scanner in = new Scanner(System.in);

            System.out.print("What would you like to do?\n" +
                    "1. Add a new entity to the database\n" +
                    "2. Add a student to a course\n" +
                    "3. Given a student's Nnumber generate their grade report. \n" +
                    "4. Given an instructor's Nnumber list all the course sections they have taught.\n" +
                    "5. Given a department name or code find the courses offered.\n" +
                    "6. Add a grade to a given student for a given course/section.\n" +
                    "7. Exit\n");

            String option = in.nextLine();

            switch (option) {
                case "1":
                    System.out.println("What kind of entity would you like to add?");
                    String entityType = in.nextLine();
                    PreparedStatement pstmt = addSomeEntity(entityType, conn);
                    pstmt.executeUpdate();
                    break;
                case "2":
                    pstmt = addStudentToClass(conn);
                    break;
                case "3":
                    // TODO
                    getStudentGPA(conn);
                    break;
                case "4":
                    // TODO
                    // pstmt = listTaughtSections(conn);
                    // pstmt.executeQuery();
                    break;
                case "5":
                    // TODO
                    // pstmt = listDeptCourses(conn);
                    // pstmt.executeQuery();
                    break;
                case "6":
                    // TODO
                    // pstmt = addGrade(conn);
                    // pstmt.executeUpdate();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            in.close();
            conn.close();
        } catch (SQLException e) {
            printSQLExceptions(e);
        }
    }

}
