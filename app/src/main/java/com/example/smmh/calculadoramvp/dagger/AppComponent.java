package com.example.smmh.calculadoramvp.dagger;

/**
 * Created by SMMH on 07/10/2017.
 */

import com.example.smmh.calculadoramvp.view.MainActivity;

import dagger.Component;
import javax.inject.Singleton;
@Singleton
@Component(modules ={AppModule.class, PresenterModule.class})

public interface AppComponent {
void inject(MainActivity target);

}
