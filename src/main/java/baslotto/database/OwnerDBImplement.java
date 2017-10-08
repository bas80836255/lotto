//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import baslotto.entity.OwnerInfo;

public class OwnerDBImplement implements OwnerDB {
	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:~/LottoDB1";
	private static final String DB_USERNAME = "test";
	private static final String DB_PASSWORD = "test";
	private Connection connection;
	private Statement stmt;
	private static final String CREATE_TABLE = "CREATE TABLE OwnerInfo  (threeTopPer VARCHAR(20),  threeTodPer VARCHAR(50), twoTopPer VARCHAR(2), twoTodPer VARCHAR(2), twoBotPer VARCHAR(20), runTopPer VARCHAR(20), runBotPer VARCHAR(20), threeTop VARCHAR(20), threeTod VARCHAR(20), twoTop VARCHAR(20), twoTod VARCHAR(20), twoBot VARCHAR(20), runTop VARCHAR(20), runBot VARCHAR(20))";

	public OwnerDBImplement() {
		this.openConnection();
	}

	public void openConnection() {
		try {
			Class.forName("org.h2.Driver");
			this.connection = DriverManager.getConnection("jdbc:h2:~/LottoDB1", "test", "test");
			this.stmt = this.connection.createStatement();
		} catch (Exception var2) {
			var2.printStackTrace();
		}

	}

	public void createTable() {
		try {
			this.stmt.execute(
					"CREATE TABLE OwnerInfo  (threeTopPer VARCHAR(20),  threeTodPer VARCHAR(50), twoTopPer VARCHAR(2), twoTodPer VARCHAR(2), twoBotPer VARCHAR(20), runTopPer VARCHAR(20), runBotPer VARCHAR(20), threeTop VARCHAR(20), threeTod VARCHAR(20), twoTop VARCHAR(20), twoTod VARCHAR(20), twoBot VARCHAR(20), runTop VARCHAR(20), runBot VARCHAR(20))");
			System.out.println("table create success");
		} catch (SQLException var2) {
			var2.printStackTrace();
		}

	}

	public void addOwner(OwnerInfo ownerInfo) {
		try {
			String sql = "INSERT INTO OwnerInfo (threeTopPer , threeTodPer ,twoTopPer,twoBotPer,runTopPer,runBotPer,threeTop , threeTod ,twoTop,twoBot,runTop,runBot) VALUES ('"
					+ ownerInfo.getThreeTopPer() + "', '" + ownerInfo.getThreeTodPer() + "', '"
					+ ownerInfo.getTwoTopPer() + "', '" + ownerInfo.getTwoBotPer() + "', '" + ownerInfo.getRunTopPer()
					+ "', '" + ownerInfo.getRunBotPer() + "', '" + ownerInfo.getThreeTop() + "', '"
					+ ownerInfo.getThreeTod() + "', '" + ownerInfo.getTwoTop() + "', '" + ownerInfo.getTwoBot() + "', '"
					+ ownerInfo.getRunTop() + "', '" + ownerInfo.getRunBot() + "')";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(OwnerDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}

	}

	public OwnerInfo getOwner() {
		OwnerInfo ownerInfo = new OwnerInfo();

		try {
			String sql = "SELECT * FROM OwnerInfo";
			ResultSet rs = this.stmt.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				ownerInfo.setThreeTopPer(rs.getString("threeTopPer"));
				ownerInfo.setThreeTodPer(rs.getString("threeTodPer"));
				ownerInfo.setTwoTopPer(rs.getString("twoTopPer"));
				ownerInfo.setTwoBotPer(rs.getString("twoBotPer"));
				ownerInfo.setRunTopPer(rs.getString("runTopPer"));
				ownerInfo.setRunBotPer(rs.getString("runBotPer"));
				ownerInfo.setThreeTop(rs.getString("threeTop"));
				ownerInfo.setThreeTod(rs.getString("threeTod"));
				ownerInfo.setTwoTop(rs.getString("twoTop"));
				ownerInfo.setTwoBot(rs.getString("twoBot"));
				ownerInfo.setRunTop(rs.getString("runTop"));
				ownerInfo.setRunBot(rs.getString("runBot"));
				i++;
			}

			if(i==0) {
				return null;
			}
			return ownerInfo;
		} catch (SQLException var4) {
			Logger.getLogger(OwnerDBImplement.class.getName()).log(Level.SEVERE, (String) null, var4);
			return ownerInfo;
		}
	}
	
	public static boolean isEmpty() throws SQLException, ClassNotFoundException {
		Class.forName("org.h2.Driver");
		Connection connectionStatic = DriverManager.getConnection("jdbc:h2:~/LottoDB1", "test", "test");
		Statement stmtStatic = connectionStatic.createStatement();
		ResultSet rs = stmtStatic.executeQuery("SELECT * FROM OwnerInfo Limit 1");
		if (rs.next()) {
			return false;
		}
		return true;
	}
}
