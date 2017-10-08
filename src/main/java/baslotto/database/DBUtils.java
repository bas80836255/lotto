//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.database;

import baslotto.entity.SaleInfo;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtils {
	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:~/LottoDB1";
	private static final String DB_USERNAME = "test";
	private static final String DB_PASSWORD = "test";
	private static Connection connection;
	private static Statement stmt;

	public DBUtils() {
		openConnection();
	}

	public static void openConnection() {
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/LottoDB1", "test", "test");
			stmt = connection.createStatement();
		} catch (Exception var2) {
			var2.printStackTrace();
		}

	}

	public static boolean isCreateTable(String tableName) throws SQLException {
			openConnection();
			DatabaseMetaData dbm = connection.getMetaData();
			ResultSet tables = dbm.getTables(null, null, tableName.toUpperCase(), null);
		if (tables.next()) {
			return true;
		} else {
			return false;
		}

	}

}
