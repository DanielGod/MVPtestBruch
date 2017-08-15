package com.example.wjd_mvp_rxjava.di.components;

import com.example.wjd_mvp_rxjava.getstring.view.MainActivity;

import dagger.Component;

/**
 * Created by 王九东 on 2017/8/10.
 */

@Component
public interface MainComponents {

    void inject(MainActivity mainActivity);

    final class Initializer {
        private Initializer() {
        }

        public static MainComponents init() {
            return DaggerMainComponents.create();
        }
    }

}
