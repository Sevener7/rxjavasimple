package com.cabinet.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cabinet.rxjavatest.Emitter;
import com.cabinet.rxjavatest.Observable;
import com.cabinet.rxjavatest.ObservableOnSubscribe;
import com.cabinet.rxjavatest.Observer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(Emitter<String> emitter) {
                emitter.onNext("test1");
                emitter.onNext("test2");
                emitter.onNext("test3");
                emitter.onNext("test4");
                emitter.onComplete();
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Emitter emitter) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext="+s);
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        });
    }
}