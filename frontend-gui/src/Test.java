import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    private static String DB_URL = new String("jdbc:oracle:thin:@cisvm-oracle.unfcsd.unf.edu:1521:orcl");
    private static String JDBC_DRIVER = new String("cisvm-oracle.unfcsd.unf.edu");
    private static String PORT = new String("1521");
    private static String USERNAME = new String("G16");
    private static String PASSWORD = new String("Fall2022G16");

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            SQLUtil.printDriverInfo(con);

            Statement stmt = con.createStatement();

            // String insert = "INSERT INTO DEPARTMENT" + "VALUES ('CS', '1167',
            // '904-567-1234', 'Engineering')";
            String delete = "DELETE FROM DEPARTMENT WHERE DEPT_ID = 'CS'";
            String query = "SELECT * FROM DEPARTMENT";

            SQLUtil.displayResultSet(stmt.executeQuery(query));

            stmt.close();
            con.close();
        } catch (SQLException e) {
            SQLUtil.printSQLExceptions(e);
        }
    }
}
