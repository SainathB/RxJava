package com.sainath.rxjava.examples;

import rx.Observable;
import rx.Subscriber;

public class BasicSourceSubscriber {
    public static void main(String[] args) {
        Observable<Integer> source = Observable.range(1,1000);
        Subscriber<Integer> subscriber = new Subscriber<Integer>() {
            public void onCompleted() {
                System.out.print("done");
            }

            public void onError(Throwable throwable) {
                System.out.println("error");
            }

            public void onNext(Integer integer) {
                System.out.println(integer);
            }
        };
        source.subscribe(subscriber);
    }
}
