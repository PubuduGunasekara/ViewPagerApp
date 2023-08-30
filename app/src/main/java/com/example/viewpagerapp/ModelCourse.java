package com.example.viewpagerapp;

public enum ModelCourse {

    RED(R.string.RED,R.layout.view_red),
    BLUE(R.string.BLUE,R.layout.view_blue),
    GREEN(R.string.GREEN,R.layout.view_green);

    private int mTitleID;
    private  int mLayoutID;

    ModelCourse(int mTitleID, int mLayoutID) {
        this.mTitleID = mTitleID;
        this.mLayoutID = mLayoutID;
    }

    public int getmTitleID() {
        return mTitleID;
    }

    public int getmLayoutID() {
        return mLayoutID;
    }
}
