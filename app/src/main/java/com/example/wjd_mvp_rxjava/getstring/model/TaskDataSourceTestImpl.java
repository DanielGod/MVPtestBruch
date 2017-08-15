package com.example.wjd_mvp_rxjava.getstring.model;

/**
 * Created by 王九东 on 2017/8/9.
 */

public class TaskDataSourceTestImpl implements TaskDataSource {
    @Override
    public String getStringFromRemote() {
        return "Hello ";
    }

    @Override
    public String getStringFromCache() {
        return " world Test ";
    }
}
