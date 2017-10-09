package com.example.smmh.calculadoramvp.presenter;

import com.example.smmh.calculadoramvp.interfaces.MainInteractor;
import com.example.smmh.calculadoramvp.interfaces.MainPresenter;
import com.example.smmh.calculadoramvp.interfaces.MainView;

/**
 * Created by SMMH on 04/10/2017.
 */

public class MainPresenterImpl implements MainPresenter {
    private MainView view;
    private MainInteractor interactor;
    double result;

    @Override
    public void operacion(String valor1, String valor2,String op) {
        if (view !=null){

           switch (op) {
                case "suma":
                    result=interactor.suma(valor1,valor2);
                    break;
                case "resta":
                    result=interactor.resta(valor1,valor2);
                    break;
                case "multi":
                    interactor.multiplicacion(valor1,valor2);
                    break;
               case "div":
                    interactor.division(valor1,valor2);
                   break;
                default:
                    this.interactor = null;
                    break;
            }


        }

    }


    @Override
    public void errorPresenter() {
        if (view !=null){

            view.showError("campos vacios");

        }
    }

    @Override
    public void setResult() {
        if (view !=null){
            view.setResult(String.valueOf(result));

        }
    }
}
