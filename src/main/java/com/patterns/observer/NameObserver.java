package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yunge on 16/6/22.
 */
public class NameObserver implements Observer {
    public void update(Observable o, Object arg) {
        if(arg instanceof String) {
            System.out.println("name changes:");
            System.out.println(arg);
        }
    }
}
