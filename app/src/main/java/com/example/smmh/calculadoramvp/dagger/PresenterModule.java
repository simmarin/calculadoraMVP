package com.example.smmh.calculadoramvp.dagger;

/**
 * Created by SMMH on 07/10/2017.
 */


import com.example.smmh.calculadoramvp.interactor.MainInteractorImpl;
import com.example.smmh.calculadoramvp.interfaces.MainInteractor;
import com.example.smmh.calculadoramvp.interfaces.MainPresenter;
import com.example.smmh.calculadoramvp.presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;


@Module
public class PresenterModule {

    @Provides
    public MainPresenter provideMainPresenter(){
        return new MainPresenterImpl();
    }

}
