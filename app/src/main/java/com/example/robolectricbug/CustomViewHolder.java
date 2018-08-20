package com.example.robolectricbug;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CustomViewHolder {

    private CustomTextView customTextView;

    public View inflate(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder, parent, false);
        customTextView = view.findViewById(R.id.custom_text_view);
        return view;
    }

    public void bind() {
        // Do stuff
    }
}
