package com.goldfish.sevenseconds.tools;


import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goldfish.sevenseconds.R;
import com.goldfish.sevenseconds.item.ChattingItem;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by guxiuzhong on 2015/7/6.
 */
public class MessageContent extends Fragment {

    private List<ChattingItem> mChattingList = new ArrayList<ChattingItem>();
    private SQLiteDatabase db;
    private ArrayList<String> tableName = new ArrayList<String>();

    public static Fragment getInstance(Bundle bundle) {
        MessageContent fragment = new MessageContent();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmnet_message, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showView(view);
    }

    private void showView(View view) {

    }
}
