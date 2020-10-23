package com.cabinet.rxjavatest;

import androidx.annotation.NonNull;

/**
 * FileName: Emitter
 * Date: 2020/10/23 15:45
 * Author: SCL
 * e-mail: sucl@dqist.com
 **/
public interface Emitter<T> {

    void onNext(@NonNull T value);
    void onComplete();
}
