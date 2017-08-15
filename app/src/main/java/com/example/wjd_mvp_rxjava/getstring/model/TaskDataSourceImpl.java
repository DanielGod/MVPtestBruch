package com.example.wjd_mvp_rxjava.getstring.model;

/**
 * Created by 王九东 on 2017/8/9.
 */

public class TaskDataSourceImpl implements TaskDataSource {
    @Override
    public String getStringFromRemote() {
        return "fromRemote ";
    }

    @Override
    public String getStringFromCache() {
        return "fromCache";
    }
}
