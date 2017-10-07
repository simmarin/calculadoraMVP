package com.example.smmh.calculadoramvp.dagger;

import android.app.Application;

/**
 * Created by SMMH on 07/10/2017.
 */

public class App extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .presenterModule(new PresenterModule())
                .build();
    }

    public AppComponent getComponent() {

        return appComponent;
    }
}
