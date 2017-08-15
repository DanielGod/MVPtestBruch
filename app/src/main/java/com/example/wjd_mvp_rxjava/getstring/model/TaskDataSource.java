package com.example.wjd_mvp_rxjava.getstring.model;

/**
 * Created by 王九东 on 2017/8/9.
 */

/**
 * data 层接口定义
 */
public interface TaskDataSource {
    String getStringFromRemote();
    String getStringFromCache();
}
