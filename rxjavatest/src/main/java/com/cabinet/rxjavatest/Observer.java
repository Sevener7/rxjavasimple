package com.cabinet.rxjavatest;

import androidx.annotation.NonNull;

/**
 * FileName: Observer
 * Date: 2020/10/23 15:35
 * Author: SCL
 * e-mail: sucl@dqist.com
 **/
public interface Observer<T> {
    void onSubscribe(@NonNull Emitter emitter);
    void onNext(T t);
    void onComplete();
}
