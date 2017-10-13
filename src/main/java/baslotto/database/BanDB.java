//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.database;

import baslotto.entity.BanInfo;
import java.util.List;

public interface BanDB {
    void addBan(BanInfo var1);

    void removeBan(String lottonumber , String type);

    List<BanInfo> getBan();
}
