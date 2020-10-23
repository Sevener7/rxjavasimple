package com.cabinet.rxjavatest;

/**
 * FileName: ObservableOnSubscribe
 * Date: 2020/10/23 16:17
 * Author: SCL
 * e-mail: sucl@dqist.com
 **/
public interface ObservableOnSubscribe<T> {
    void subscribe(Emitter<T> emitter);
}
