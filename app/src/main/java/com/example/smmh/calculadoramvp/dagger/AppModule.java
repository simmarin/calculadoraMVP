package com.example.smmh.calculadoramvp.dagger;

/**
 * Created by SMMH on 07/10/2017.
 */
import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
 @Module
public class AppModule {
private Application application;
     public AppModule(Application application){
         this.application=application;
              }
     @Provides
     @Singleton
     public Context provideContext(){
         return application;
     }
}
