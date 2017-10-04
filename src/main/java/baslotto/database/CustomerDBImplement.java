//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.database;

import baslotto.entity.CustomerInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerDBImplement implements CustomerDB {
	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:~/LottoDB1";
	private static final String DB_USERNAME = "test";
	private static final String DB_PASSWORD = "test";
	private Connection connection;
	private Statement stmt;
	private static final String CREATE_TABLE = "CREATE TABLE CustomerInfo (customerid bigint auto_increment NOT NULL PRIMARY KEY,  name VARCHAR(20),  threeTopPer VARCHAR(20),  threeTodPer VARCHAR(50), twoTopPer VARCHAR(2), twoTodPer VARCHAR(2), twoBotPer VARCHAR(20), runTopPer VARCHAR(20), runBotPer VARCHAR(20), threeTop VARCHAR(20), threeTod VARCHAR(20), twoTop VARCHAR(20), twoTod VARCHAR(20), twoBot VARCHAR(20), runTop VARCHAR(20), runBot VARCHAR(20))";

	public CustomerDBImplement() {
		this.openConnection();
	}

	public void openConnection() {
		try {
			Class.forName("org.h2.Driver");
			this.connection = DriverManager.getConnection("jdbc:h2:~/LottoDB1", "test", "test");
			this.stmt = this.connection.createStatement();
		} catch (Exception var2) {
			Logger.getLogger(CustomerDBImplement.class.getName()).log(Level.SEVERE, (String) null,
					"cannot get connect");
			var2.printStackTrace();
		}

	}

	public void isCreateDatabase() throws Exception {
		String sql = "SELECT * FROM CustomerInfo";
		stmt.executeQuery(sql);
	}

	public void createTable() {
		try {
			this.stmt.execute(
					"CREATE TABLE CustomerInfo (customerid bigint auto_increment NOT NULL PRIMARY KEY,  name VARCHAR(20),  threeTopPer VARCHAR(20),  threeTodPer VARCHAR(50), twoTopPer VARCHAR(2), twoTodPer VARCHAR(2), twoBotPer VARCHAR(20), runTopPer VARCHAR(20), runBotPer VARCHAR(20), threeTop VARCHAR(20), threeTod VARCHAR(20), twoTop VARCHAR(20), twoTod VARCHAR(20), twoBot VARCHAR(20), runTop VARCHAR(20), runBot VARCHAR(20))");
			System.out.println("table create success");
		} catch (SQLException var2) {
			var2.printStackTrace();
		}

	}

	public void addCustomer(CustomerInfo customerInfo) {
		try {
			String sql = "INSERT INTO CustomerInfo (name, threeTopPer , threeTodPer ,twoTopPer,twoBotPer,runTopPer,runBotPer,threeTop , threeTod ,twoTop,twoBot,runTop,runBot) VALUES ('"
					+ customerInfo.getName() + "', '" + customerInfo.getThreeTopPer() + "', '"
					+ customerInfo.getThreeTodPer() + "', '" + customerInfo.getTwoTopPer() + "', '"
					+ customerInfo.getTwoBotPer() + "', '" + customerInfo.getRunTopPer() + "', '"
					+ customerInfo.getRunBotPer() + "', '" + customerInfo.getThreeTop() + "', '"
					+ customerInfo.getThreeTod() + "', '" + customerInfo.getTwoTop() + "', '" + customerInfo.getTwoBot()
					+ "', '" + customerInfo.getRunTop() + "', '" + customerInfo.getRunBot() + "')";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(CustomerDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}

	}
	
	public void updateCustomer(CustomerInfo customerInfo,String oldName) {
		try {
			String sql = "Update CustomerInfo SET "
					+ "name='"+ customerInfo.getName() +"',"  
					+ "threeTopPer='"+ customerInfo.getThreeTopPer() +"',"
					+ "threeTodPer='"+ customerInfo.getThreeTodPer() +"',"
					+ "twoTopPer='"+ customerInfo.getTwoTopPer() +"',"
					+ "twoBotPer='"+ customerInfo.getTwoBotPer() +"',"
					+ "runTopPer='"+ customerInfo.getRunTopPer() +"',"
					+ "runBotPer='"+ customerInfo.getRunBotPer() +"',"
					+ "threeTop='"+ customerInfo.getThreeTop() +"',"
					+ "threeTod='"+ customerInfo.getThreeTod() +"',"
					+ "twoTop='"+ customerInfo.getTwoTop() +"',"
					+ "twoBot='"+ customerInfo.getTwoBot() +"',"
					+ "runTop='"+ customerInfo.getRunTop() +"',"
					+ "runBot='"+ customerInfo.getRunBot() +"'"
					+ "WHERE name='"+oldName+"'";
			stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(CustomerDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}

	}

	public void removeCustomer(String keyword) {
		try {
			String sql = "DELETE FROM CustomerInfo  where name =  '" + keyword + "'";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(CustomerDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}

	}

	public List<CustomerInfo> getCustomer() {
		ArrayList customerInfoList = new ArrayList();

		try {
			String sql = "SELECT * FROM CustomerInfo";
			ResultSet rs = this.stmt.executeQuery(sql);

			while (rs.next()) {
				CustomerInfo customerInfo = new CustomerInfo();
				customerInfo.setID(rs.getString("customerid"));
				customerInfo.setName(rs.getString("name"));
				customerInfo.setThreeTopPer(rs.getString("threeTopPer"));
				customerInfo.setThreeTodPer(rs.getString("threeTodPer"));
				customerInfo.setTwoTopPer(rs.getString("twoTopPer"));
				customerInfo.setTwoBotPer(rs.getString("twoBotPer"));
				customerInfo.setRunTopPer(rs.getString("runTopPer"));
				customerInfo.setRunBotPer(rs.getString("runBotPer"));
				customerInfo.setThreeTop(rs.getString("threeTop"));
				customerInfo.setThreeTod(rs.getString("threeTod"));
				customerInfo.setTwoTop(rs.getString("twoTop"));
				customerInfo.setTwoBot(rs.getString("twoBot"));
				customerInfo.setRunTop(rs.getString("runTop"));
				customerInfo.setRunBot(rs.getString("runBot"));
				customerInfoList.add(customerInfo);
			}

			return customerInfoList;
		} catch (SQLException var5) {
			Logger.getLogger(CustomerDBImplement.class.getName()).log(Level.SEVERE, (String) null, var5);
			return customerInfoList;
		}
	}

	public Map<String, String> getCustomerName() {
		HashMap customerNameMap = new HashMap();

		try {
			String sql = "SELECT * FROM CustomerInfo";
			ResultSet rs = this.stmt.executeQuery(sql);

			while (rs.next()) {
				customerNameMap.put(rs.getString("customerid"), rs.getString("name"));
			}

			return customerNameMap;
		} catch (SQLException var4) {
			Logger.getLogger(CustomerDBImplement.class.getName()).log(Level.SEVERE, (String) null, var4);
			return customerNameMap;
		}
	}

	public String getIdCustomer(String keyword) {
		try {
			String sql = "SELECT * FROM CustomerInfo where name = '" + keyword + "'";
			ResultSet rs = this.stmt.executeQuery(sql);
			rs.next();
			return rs.getString("customerid");
		} catch (SQLException var4) {
			Logger.getLogger(CustomerDBImplement.class.getName()).log(Level.SEVERE, (String) null, var4);
			return null;
		}
	}
}
