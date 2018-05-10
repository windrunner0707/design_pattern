package com.practice.design_pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
    private String action;

    @Override
    public void update(Observable o, Object arg) {

        String teacherAction = ((Teacher) o).getAction();

        if (teacherAction.equals("老师来了")) {
            action = "假装学习";
        } else if (teacherAction.equals("老师走了")) {
            action = "继续打牌";
        }
    }
    public String getAction() {
        return action;
    }
}
