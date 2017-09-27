//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.database;

import baslotto.entity.CustomerInfo;
import java.util.List;

public interface CustomerDB {
	void addCustomer(CustomerInfo var1);

	void removeCustomer(String var1);

	List<CustomerInfo> getCustomer();
}
