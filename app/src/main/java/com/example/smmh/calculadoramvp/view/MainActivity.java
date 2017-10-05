package com.example.smmh.calculadoramvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smmh.calculadoramvp.R;
import com.example.smmh.calculadoramvp.interfaces.MainPresenter;
import com.example.smmh.calculadoramvp.interfaces.MainView;
import com.example.smmh.calculadoramvp.presenter.MainPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainView{
private EditText    valor1, valor2,resultMain;
private MainPresenter presenter;
    private String s="suma",r="resta",m="multi",d="div";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=(EditText) findViewById(R.id.valor1);
        valor2=(EditText) findViewById(R.id.valor2);
        resultMain=(EditText) findViewById(R.id.resultMain);
        presenter=new MainPresenterImpl(this);
    }

    @Override
    public void setResult(String result) {
        resultMain.setText(result);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(MainActivity.this,error,Toast.LENGTH_SHORT).show();
    }

    public void suma(View v){
        presenter.operacion(valor1.getText().toString(),valor2.getText().toString(),s);
    }
    public void resta(View v){
        presenter.operacion(valor1.getText().toString(),valor2.getText().toString(),r);
    }
    public void multiplicacion(View v){
        presenter.operacion(valor1.getText().toString(),valor2.getText().toString(),m);
    }
    public void division(View v){
        presenter.operacion(valor1.getText().toString(),valor2.getText().toString(),d);
    }

}
