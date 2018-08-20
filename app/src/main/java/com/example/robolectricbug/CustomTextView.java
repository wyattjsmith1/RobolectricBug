package com.example.robolectricbug;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextView extends AppCompatTextView {

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.starStyle);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        TypedArray styles =
                context.obtainStyledAttributes(attrs, R.styleable.StarsView, defStyleAttr, defStyleAttr);
    }

}
