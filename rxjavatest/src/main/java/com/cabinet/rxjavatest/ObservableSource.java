package com.cabinet.rxjavatest;

/**
 * FileName: ObservableSource
 * Date: 2020/10/23 15:52
 * Author: SCL
 * e-mail: sucl@dqist.com
 **/
interface ObservableSource<T> {
    void subscribe(Observer<? super T> observer);
}
