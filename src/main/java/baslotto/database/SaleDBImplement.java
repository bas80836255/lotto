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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaleDBImplement {
	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:~/LottoDB1";
	private static final String DB_USERNAME = "test";
	private static final String DB_PASSWORD = "test";
	private Connection connection;
	private Statement stmt;
	private static final String CREATE_TABLE = "CREATE TABLE SaleInfo (id bigint auto_increment NOT NULL PRIMARY KEY,  page VARCHAR(2),  customerName VARCHAR(20),  lottoNumber VARCHAR(3), type VARCHAR(1), price VARCHAR(7), date VARCHAR(20))";

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
					"CREATE TABLE SaleInfo (id bigint auto_increment NOT NULL PRIMARY KEY,  page VARCHAR(2),  customerName VARCHAR(20),  lottoNumber VARCHAR(3), type VARCHAR(1), price VARCHAR(7), date VARCHAR(20))");
			System.out.println("table create success");
		} catch (SQLException var2) {
			var2.printStackTrace();
		}

	}

	public void addSale(SaleInfo saleInfo) {
		try {
			String sql = "INSERT INTO SaleInfo (page , customerName , lottoNumber, type , price , date) VALUES ('"
					+ saleInfo.getPage() + "', '" + saleInfo.getCustomerName() + "', '" + saleInfo.getLottoNumber()
					+ "', '" + saleInfo.getType() + "', '" + saleInfo.getPrice() + "', '" + saleInfo.getDate() + "')";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(SaleDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}
	}

	public void removeSale(String customerName, String page, String lottoNumber, String type, String price) {
		try {
			String sql = "DELETE FROM SaleInfo  where customerName =  '" + customerName + "' and page='" + page
					+ "' and lottoNumber='" + lottoNumber + "' and type ='" + type + "' and price='" + price + "'";
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
				saleInfo.setType(rs.getString("type"));
				saleInfo.setPrice(rs.getString("price"));
				saleInfo.setDate(rs.getString("date"));
				saleInfoList.add(saleInfo);
			}

			return saleInfoList;
		} catch (SQLException var5) {
			Logger.getLogger(SaleDBImplement.class.getName()).log(Level.SEVERE, (String) null, var5);
			return saleInfoList;
		}
	}

	public List<SaleInfo> getSaleListbyPage(String customerName, String page) {
		ArrayList saleInfoList = new ArrayList();

		try {
			String sql = "SELECT * FROM SaleInfo where customerName='" + customerName + "' and page='" + page + "'";
			ResultSet rs = this.stmt.executeQuery(sql);
			while (rs.next()) {
				SaleInfo saleInfo = new SaleInfo();
				saleInfo.setPage(rs.getString("page"));
				saleInfo.setCustomerName(rs.getString("customerName"));
				saleInfo.setLottoNumber(rs.getString("lottoNumber"));
				saleInfo.setType(rs.getString("type"));
				saleInfo.setPrice(rs.getString("price"));
				saleInfo.setDate(rs.getString("date"));
				saleInfoList.add(saleInfo);
			}

			return saleInfoList;
		} catch (SQLException var5) {
			Logger.getLogger(SaleDBImplement.class.getName()).log(Level.SEVERE, (String) null, var5);
			return saleInfoList;
		}
	}

	public Set<String> getCustomerPage(String customerName) {
		Set pageList = new HashSet();

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
