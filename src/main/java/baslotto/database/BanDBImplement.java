//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.database;

import baslotto.entity.BanInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BanDBImplement implements BanDB {
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/LottoDB1";
    private static final String DB_USERNAME = "test";
    private static final String DB_PASSWORD = "test";
    private Connection connection;
    private Statement stmt;
    private static final String CREATE_TABLE = "CREATE TABLE BanInfo  (name VARCHAR(20),  type VARCHAR(15),  lottoNumber VARCHAR(6), price VARCHAR(5), buyable VARCHAR(10))";

    public BanDBImplement() {
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
            this.stmt.execute("CREATE TABLE BanInfo  (name VARCHAR(20),  type VARCHAR(15),  lottoNumber VARCHAR(6), price VARCHAR(5), buyable VARCHAR(10))");
            System.out.println("table create success");
        } catch (SQLException var2) {
            var2.printStackTrace();
        }

    }

    public void addBan(BanInfo banInfo) {
        try {
            String sql = "INSERT INTO BanInfo ( name , type , lottoNumber , price , buyable ) VALUES ('" + banInfo.getName() + "', '" + banInfo.getType() + "', '" + banInfo.getLottoNumber() + "', '" + banInfo.getPrice() + "', '" + banInfo.getBuyable() + "')";
            this.stmt.execute(sql);
        } catch (SQLException var3) {
            Logger.getLogger(BanDBImplement.class.getName()).log(Level.SEVERE, (String)null, var3);
        }

    }

    public void removeBan(String keyword) {
        try {
            String sql = "DELETE FROM BanInfo  where name =  '" + keyword + "'";
            this.stmt.execute(sql);
        } catch (SQLException var3) {
            Logger.getLogger(BanDBImplement.class.getName()).log(Level.SEVERE, (String)null, var3);
        }

    }

    public List<BanInfo> getBan() {
        ArrayList banInfoList = new ArrayList();

        try {
            String sql = "SELECT * FROM BanInfo";
            ResultSet rs = this.stmt.executeQuery(sql);

            while(rs.next()) {
                BanInfo banInfo = new BanInfo();
                banInfo.setName(rs.getString("name"));
                banInfo.setType(rs.getString("type"));
                banInfo.setLottoNumber(rs.getString("lottoNumber"));
                banInfo.setPrice(rs.getString("price"));
                banInfo.setBuyable(rs.getString("buyable"));
                banInfoList.add(banInfo);
            }

            return banInfoList;
        } catch (SQLException var5) {
            Logger.getLogger(BanDBImplement.class.getName()).log(Level.SEVERE, (String)null, var5);
            return banInfoList;
        }
    }
}
