package co.za.javers.diff;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class SqlTestIKM {

    public static void getNumberColumns(Connection connection, String tableName) throws SQLException {

      /*  var query= "select * from "+tableName;

        var statement = connection.createStatement();

        var resultSet = statement.executeQuery(query);

        return resultSet.getMetaData().getColumnCount();*/
    }


}
