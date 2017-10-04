//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.database;

import baslotto.entity.Lotto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LottoDBImplement implements LottoDB {
	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:~/LottoDB1";
	private static final String DB_USERNAME = "test";
	private static final String DB_PASSWORD = "test";
	private Connection connection;
	private Statement stmt;
	private static final String CREATE_TABLE = "CREATE TABLE LOTTOS (jackpot VARCHAR(6),  threeTop VARCHAR(20),  threeTod VARCHAR(50), threeBotFront VARCHAR(20), threeBotBack VARCHAR(20), twoTop VARCHAR(2), twoBot VARCHAR(2), runTop VARCHAR(20), runBot VARCHAR(20))";

	public LottoDBImplement() {
		this.openConnection();
	}

	public void openConnection() {
		try {
			Class.forName("org.h2.Driver");
			this.connection = DriverManager.getConnection("jdbc:h2:~/LottoDB1", "test", "test");
			this.stmt = this.connection.createStatement();
		} catch (Exception var2) {
			System.err.println("cannot get Connection");
			var2.printStackTrace();
		}

	}

	public void createTable() {
		try {
			this.stmt.execute(
					"CREATE TABLE LOTTOS (jackpot VARCHAR(6),  threeTop VARCHAR(20),  threeTod VARCHAR(50), threeBotFront VARCHAR(20), threeBotBack VARCHAR(20), twoTop VARCHAR(2), twoBot VARCHAR(2), runTop VARCHAR(20), runBot VARCHAR(20))");
			System.out.println("table create success");
		} catch (SQLException var2) {
			var2.printStackTrace();
		}

	}

	public void addLotto(Lotto lotto) {
		try {
			String sql = "INSERT INTO LOTTOS (jackpot, threeTop , threeTod ,threeBotFront ,threeBotBack ,twoTop,twoBot,runTop,runBot) VALUES ('"
					+ lotto.getJackpot() + "', '" + lotto.getThreeTop() + "', '" + lotto.getThreeTod() + "', '"
					+ lotto.getThreeBotFront() + "', '" + lotto.getThreeBotBack() + "', '" + lotto.getTwoTop() + "', '"
					+ lotto.getTwoBot() + "', '" + lotto.getRunTop() + "', '" + lotto.getRunBot() + "')";
			this.stmt.execute(sql);
		} catch (SQLException var3) {
			Logger.getLogger(LottoDBImplement.class.getName()).log(Level.SEVERE, (String) null, var3);
		}

	}

	public Lotto getLottos() {
		Lotto lotto = new Lotto();

		try {
			String sql = "SELECT * FROM LOTTOS";
			ResultSet rs = this.stmt.executeQuery(sql);

			while (rs.next()) {
				lotto.setJackpot(rs.getString("jackpot"));
				lotto.setThreeTop(rs.getString("threeTop"));
				lotto.setThreeTod(rs.getString("threeTod"));
				lotto.setThreeBotFront(rs.getString("threeBotFront"));
				lotto.setThreeBotBack(rs.getString("threeBotBack"));
				lotto.setTwoTop(rs.getString("twoTop"));
				lotto.setTwoBot(rs.getString("twoBot"));
				lotto.setRunTop(rs.getString("runTop"));
				lotto.setRunBot(rs.getString("runBot"));
			}

			return lotto;
		} catch (SQLException var4) {
			Logger.getLogger(LottoDBImplement.class.getName()).log(Level.SEVERE, (String) null, var4);
			return lotto;
		}
	}
}
