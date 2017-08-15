package com.example.wjd_mvp_rxjava.getstring.presenter;

import com.example.wjd_mvp_rxjava.getstring.model.TaskDataSourceImpl;
import com.example.wjd_mvp_rxjava.getstring.model.TaskDataSourceTestImpl;
import com.example.wjd_mvp_rxjava.getstring.model.TaskManager;
import com.example.wjd_mvp_rxjava.getstring.view.MainView;

import javax.inject.Inject;

/**
 * Created by 王九东 on 2017/8/9.
 */

public class MainPresenter {

    MainView mainView;
    TaskManager taskData;

    @Inject
    public MainPresenter() {
        this.taskData = new TaskManager(new TaskDataSourceImpl());
    }

    public MainPresenter test() {
        this.taskData = new TaskManager(new TaskDataSourceTestImpl());
        return this;
    }

    public MainPresenter addTaskListener(MainView viewListener) {
        this.mainView = viewListener;
        return this;
    }

    public void getString() {
        String str = taskData.getShowContent();
        mainView.onShowString(str);
    }

}
