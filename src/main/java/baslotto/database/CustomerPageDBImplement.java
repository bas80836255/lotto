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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import baslotto.entity.CustomerPage;

public class CustomerPageDBImplement {
	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:~/LottoDB1";
	private static final String DB_USERNAME = "test";
	private static final String DB_PASSWORD = "test";
	private Connection connection;
	private Statement stmt;
	private static final String CREATE_TABLE = "CREATE TABLE PageInfo (id bigint auto_increment NOT NULL PRIMARY KEY, customerName VARCHAR(20), page VARCHAR(2))";

	public CustomerPageDBImplement() {
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
					"CREATE TABLE PageInfo (id bigint auto_increment NOT NULL PRIMARY KEY,  customerName VARCHAR(20) , page VARCHAR(2))");
			System.out.println("table create success");
		} catch (SQLException var2) {
			var2.printStackTrace();
		}

	}

	public void addPage(CustomerPage customerPage) {
		try {
			String sql = "INSERT INTO PageInfo (customerName , page ) VALUES ('" + customerPage.getCustomerName()
					+ "', '" + customerPage.getPage() + "')";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(CustomerPageDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}
	}

	public void removePage(String customerName, String page, String lottoNumber, String type, String price) {
		try {
			String sql = "DELETE FROM PageInfo where page =  '" + page + "' and customerName='" + customerName + "'";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(CustomerPageDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}

	}

	public List<CustomerPage> getPageList() {
		ArrayList<CustomerPage> pageInfoList = new ArrayList<CustomerPage>();

		try {
			String sql = "SELECT * FROM PageInfo";
			ResultSet rs = this.stmt.executeQuery(sql);
			while (rs.next()) {
				CustomerPage pageInfo = new CustomerPage();
				pageInfo.setCustomerName(rs.getString("customerName"));
				pageInfo.setPage(rs.getString("page"));
				pageInfoList.add(pageInfo);
			}

			return pageInfoList;
		} catch (SQLException var5) {
			Logger.getLogger(CustomerPageDBImplement.class.getName()).log(Level.SEVERE, (String) null, var5);
			return pageInfoList;
		}
	}

	public Set<String> getPageListByCustomer(String customerName) {
		Set<String> pageList = new HashSet<String>();

		try {
			String sql = "SELECT * FROM PageInfo where customerName='" + customerName + "'";
			ResultSet rs = this.stmt.executeQuery(sql);
			while (rs.next()) {
				pageList.add(rs.getString("page"));
			}

			return pageList;
		} catch (SQLException var5) {
			Logger.getLogger(CustomerPageDBImplement.class.getName()).log(Level.SEVERE, (String) null, var5);
			return pageList;
		}
	}
}
