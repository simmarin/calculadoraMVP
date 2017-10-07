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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView{
    @BindView(R.id.valor1) EditText valor1;
    @BindView(R.id.valor2) EditText valor2;
    @BindView(R.id.resultMain) EditText resultMain;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new MainPresenterImpl(this);
        ButterKnife.bind(this);
    }

    @Override
    public void setResult(String result) {
        resultMain.setText(result);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(MainActivity.this,error,Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.sumabtn)
    public void suma(){
        presenter.operacion(valor1.getText().toString(),valor2.getText().toString(),"suma");
    }
    @OnClick(R.id.restabtn)
    public void resta(){
        presenter.operacion(valor1.getText().toString(),valor2.getText().toString(),"resta");
    }
    @OnClick(R.id.multibtn)
    public void multiplicacion(){
        presenter.operacion(valor1.getText().toString(),valor2.getText().toString(),"multi");
    }
    @OnClick(R.id.divbtn)
    public void division(){
        presenter.operacion(valor1.getText().toString(),valor2.getText().toString(),"div");
    }

}
