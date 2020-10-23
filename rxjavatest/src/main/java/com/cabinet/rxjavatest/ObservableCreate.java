package com.cabinet.rxjavatest;

import androidx.annotation.NonNull;

/**
 * FileName: ObservableCreate
 * Date: 2020/10/23 16:05
 * Author: SCL
 * e-mail: sucl@dqist.com
 **/
public class ObservableCreate<T> extends Observable<T> {
    public final ObservableOnSubscribe<T> source;
    public ObservableCreate(ObservableOnSubscribe<T> source) {
        this.source = source;
    }
    @Override
    public void subscribe(Observer<? super T> observer) {
        CreateEmitter<T> emitter = new CreateEmitter<>(observer);
        observer.onSubscribe(emitter);
        source.subscribe(emitter);
    }

    class CreateEmitter<T> implements Emitter<T> {
        Observer<? super T> observer;
        CreateEmitter(Observer<? super T> observer) {
            this.observer = observer;
        }

        @Override
        public void onNext(@NonNull T value) {
            observer.onNext(value);
        }

        @Override
        public void onComplete() {
            observer.onComplete();
        }
    }
}
