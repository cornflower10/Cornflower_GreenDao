package cornflower.com;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

import cornflower.com.dao.DaoMaster;
import cornflower.com.dao.DaoSession;

/**
 * Created by xiejingbao on 2017/5/14.
 */

public class App extends Application {
    private static DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        initDataBase();
    }

    private void initDataBase() {
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(this, "cornflower.db");
        Database db = openHelper.getWritableDb();

        DaoMaster daoMaster  = new DaoMaster(db);
        daoMaster.newSession();
    }
    public static DaoSession getDaoSession() {
        return daoSession;
    }
}