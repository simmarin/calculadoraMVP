package com.example.smmh.calculadoramvp.interfaces;

import com.example.smmh.calculadoramvp.interactor.MainInteractorImpl;

/**
 * Created by SMMH on 03/10/2017.
 */

public interface MainPresenter {
    void setView(MainView view);
    void operacion(String valor1, String valor2,String op);
    void errorPresenter(String error);
    void setResult(String result);
}
