package com.agrim.agrim;

import android.app.Application;
import com.zoho.salesiq.android.ZohoSalesIQ;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZohoSalesIQ.init(this, "YOUR_APP_KEY", "YOUR_ACCESS_KEY");
    }
}
