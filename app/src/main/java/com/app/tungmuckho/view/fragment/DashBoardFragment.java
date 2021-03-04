package com.app.tungmuckho.view.fragment;

import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.app.tungmuckho.R;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class DashBoardFragment extends Fragment {
    public DashBoardFragment() {
        // Required empty public constructor
    }

    public static DashBoardFragment newInstance() {
        DashBoardFragment dashBoardFragment = new DashBoardFragment();
        return dashBoardFragment;
    }

    private void initData() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_dashboard_layout, container, false);
        ButterKnife.bind(this, view);

        //init
        initData();
        initView();
        return view;
    }

    private void initView() {
    }
}
