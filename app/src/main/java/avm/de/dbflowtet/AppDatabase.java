package avm.de.dbflowtet;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * (c) AVM Berlin
 * Date: 23.03.2015
 * Time: 10:18
 */
@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION, foreignKeysSupported = true)
public class AppDatabase {
    public static final String NAME = "database";
    public static final int VERSION = 1;
}
