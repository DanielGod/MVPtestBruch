package com.example.wjd_mvp_rxjava.getstring.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wjd_mvp_rxjava.R;
import com.example.wjd_mvp_rxjava.di.components.MainComponents;
import com.example.wjd_mvp_rxjava.getstring.presenter.MainPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity implements MainView  {

    @InjectView(R.id.text_tv)
    TextView textTv;
    @InjectView(R.id.activity_main)
    RelativeLayout activityMain;

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        getData();
        //这是在test分支上
    }

    private void getData() {
//        presenter = new MainPresenter().test();
        MainComponents.Initializer.init().inject(this);
        presenter.addTaskListener(this);
        presenter.getString();

    }

    @Override
    public void onShowString(String str) {
        textTv.setText(str);
    }
}
