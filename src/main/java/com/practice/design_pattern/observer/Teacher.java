package com.practice.design_pattern.observer;

import java.util.Observable;

public class Teacher extends Observable {
    private String action;
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
        // 被观察者状态发生变化，通知观察者
        this.setChanged();
        this.notifyObservers(this.action);
    }
}