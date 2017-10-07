package com.example.smmh.calculadoramvp.interactor;

import com.example.smmh.calculadoramvp.dagger.App;
import com.example.smmh.calculadoramvp.interfaces.MainInteractor;
import com.example.smmh.calculadoramvp.interfaces.MainPresenter;

import javax.inject.Inject;

/**
 * Created by SMMH on 04/10/2017.
 */

public class MainInteractorImpl implements MainInteractor {

    private double result;
    @Inject
    MainPresenter presenter;

    @Override
    public void suma(String valor1, String valor2) {
        if (valor1.equals("") && valor2.equals("")){
            presenter.errorPresenter("campos vacios");
        }else {
            try{
                result=Double.valueOf(valor1)+Double.valueOf(valor2);
                presenter.setResult(String.valueOf(result));
            }catch (Exception e){
                presenter.errorPresenter(e.getMessage());
            }

        }

    }

    @Override
    public void resta(String valor1, String valor2) {
        if (valor1.equals("") && valor2.equals("")){
            presenter.errorPresenter("campos vacios");
        }else {
            try{
                result=Double.valueOf(valor1)-Double.valueOf(valor2);
                presenter.setResult(String.valueOf(result));
            }catch (Exception e){
                presenter.errorPresenter(e.getMessage());
            }

        }

    }

    @Override
    public void multiplicacion(String valor1, String valor2) {
        if (valor1.equals("") && valor2.equals("")){
            presenter.errorPresenter("campos vacios");
        }else {
            try{
                result=Double.valueOf(valor1)*Double.valueOf(valor2);
                presenter.setResult(String.valueOf(result));
            }catch (Exception e){
                presenter.errorPresenter(e.getMessage());
            }

        }

    }

    @Override
    public void division(String valor1, String valor2) {
        if (valor1.equals("") && valor2.equals("")){
            presenter.errorPresenter("campos vacios");
        }else {
            try{
                result=Double.valueOf(valor1)/Double.valueOf(valor2);
                presenter.setResult(String.valueOf(result));
            }catch (Exception e){
                presenter.errorPresenter(e.getMessage());
            }

        }

    }
}
