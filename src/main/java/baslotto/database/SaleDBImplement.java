//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.database;

import baslotto.entity.SaleInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaleDBImplement {
	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:~/LottoDB1";
	private static final String DB_USERNAME = "test";
	private static final String DB_PASSWORD = "test";
	private Connection connection;
	private Statement stmt;
	private static final String CREATE_TABLE = "CREATE TABLE SaleInfo (id bigint auto_increment NOT NULL PRIMARY KEY,  page VARCHAR(5),  customerName VARCHAR(20),  lottoNumber VARCHAR(50), threeTopPrice VARCHAR(10), threeTodPrice VARCHAR(10), twoTopPrice VARCHAR(10), twoBotPrice VARCHAR(10), runTopPrice VARCHAR(10), runBotPrice VARCHAR(10), date VARCHAR(20))";

	public SaleDBImplement() {
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
					"CREATE TABLE SaleInfo (id bigint auto_increment NOT NULL PRIMARY KEY,  page VARCHAR(5),  customerName VARCHAR(20),  lottoNumber VARCHAR(50), threeTopPrice VARCHAR(10), threeTodPrice VARCHAR(10), twoTopPrice VARCHAR(10), twoBotPrice VARCHAR(10), runTopPrice VARCHAR(10), runBotPrice VARCHAR(10), date VARCHAR(20))");
			System.out.println("table create success");
		} catch (SQLException var2) {
			var2.printStackTrace();
		}

	}

	public void addSale(SaleInfo saleInfo) {
		try {
			String sql = "INSERT INTO SaleInfo (page , customerName ,lottoNumber,threeTopPrice,threeTodPrice,twoTopPrice,twoBotPrice , runTopPrice ,runBotPrice,date) VALUES ('"
					+ saleInfo.getPage() + "', '" + saleInfo.getCustomerName() + "', '" + saleInfo.getLottoNumber()
					+ "', '" + saleInfo.getThreeTopPrice() + "', '" + saleInfo.getThreeTodPrice() + "', '"
					+ saleInfo.getTwoTopPrice() + "', '" + saleInfo.getTwoBotPrice() + "', '"
					+ saleInfo.getRunTopPrice() + "', '" + saleInfo.getRunBotPrice() + "', '" + saleInfo.getDate()
					+ "')";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(SaleDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}

	}

	public void removeSale(String keyword) {
		try {
			String sql = "DELETE FROM SaleInfo  where customerid =  '" + keyword + "'";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(SaleDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}

	}

	public List<SaleInfo> getSaleList() {
		ArrayList saleInfoList = new ArrayList();

		try {
			String sql = "SELECT * FROM SaleInfo";
			ResultSet rs = this.stmt.executeQuery(sql);

			while (rs.next()) {
				SaleInfo saleInfo = new SaleInfo();
				saleInfo.setPage(rs.getString("page"));
				saleInfo.setCustomerName(rs.getString("customerName"));
				saleInfo.setLottoNumber(rs.getString("lottoNumber"));
				saleInfo.setThreeTopPrice(rs.getString("threeTopPrice"));
				saleInfo.setThreeTodPrice(rs.getString("threeTodPrice"));
				saleInfo.setTwoTopPrice(rs.getString("twoTopPrice"));
				saleInfo.setTwoBotPrice(rs.getString("twoBotPrice"));
				saleInfo.setRunTopPrice(rs.getString("runTopPrice"));
				saleInfo.setRunBotPrice(rs.getString("runBotPrice"));
				saleInfo.setDate(rs.getString("date"));
				saleInfoList.add(saleInfo);
			}

			return saleInfoList;
		} catch (SQLException var5) {
			Logger.getLogger(SaleDBImplement.class.getName()).log(Level.SEVERE, (String) null, var5);
			return saleInfoList;
		}
	}

	public List<String> getCustomerPage(String customerName) {
		ArrayList pageList = new ArrayList();

		try {
			String sql = "SELECT page FROM SaleInfo where customerName =  '" + customerName + "'";
			ResultSet rs = this.stmt.executeQuery(sql);

			while (rs.next()) {
				pageList.add(rs.getString("page"));
			}

			return pageList;
		} catch (SQLException var5) {
			Logger.getLogger(SaleDBImplement.class.getName()).log(Level.SEVERE, (String) null, var5);
			return pageList;
		}
	}
}
