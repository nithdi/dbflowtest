package avm.de.dbflowtet;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * (c) AVM Berlin
 * Date: 23.03.2015
 * Time: 11:44
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FlowManager.init(getApplicationContext());
    }
}
