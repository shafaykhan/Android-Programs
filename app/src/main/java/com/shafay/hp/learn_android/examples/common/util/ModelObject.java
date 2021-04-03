package com.shafay.hp.learn_android.examples.common.util;

import com.shafay.hp.learn_android.R;

public enum ModelObject {

    RED(R.string.first, R.layout.view_first),
    BLUE(R.string.second, R.layout.view_second),
    GREEN(R.string.third, R.layout.view_third);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}