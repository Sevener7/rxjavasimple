package com.cabinet.rxjavatest;

/**
 * FileName: Observable
 * Date: 2020/10/23 15:41
 * Author: SCL
 * e-mail: sucl@dqist.com
 **/
public abstract class Observable<T> implements ObservableSource<T>{
    public static <T>Observable<T> create(ObservableOnSubscribe<T> observableOnSubscribe){
        return new ObservableCreate<T>(observableOnSubscribe);
    }
}
