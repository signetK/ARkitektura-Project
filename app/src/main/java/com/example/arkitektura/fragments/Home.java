package com.example.arkitektura.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arkitektura.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arkitektura.adapter.CollegeAdapter;
import com.example.arkitektura.model.CollegeModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private RecyclerView recyclerView;
    private FloatingActionButton fabQR;
    private List<CollegeModel> collegeList;


    public Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.Colleges);
        fabQR = view.findViewById(R.id.QRScan);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        collegeList = new ArrayList<>();
        collegeList.add(new CollegeModel(R.drawable.ui_coe,R.drawable.ic_ccis, "College of Computing and Information Sciences"));
        collegeList.add(new CollegeModel(R.drawable.ui_coe,R.drawable.ic_coe, "College of Engineering"));
        collegeList.add(new CollegeModel(R.drawable.ui_cas,R.drawable.ic_cas, "College of Arts and Sciences"));
        collegeList.add(new CollegeModel(R.drawable.ui_cafsd,R.drawable.ic_cafsd, "College of Agriculture, Food, and Sustainable Development"));
        collegeList.add(new CollegeModel(R.drawable.ui_cbea,R.drawable.ic_cbea, "College of Business, Entrepreneurship, and Accountancy"));
        collegeList.add(new CollegeModel(R.drawable.ui_chs,R.drawable.ic_chs, "College of Health Sciences"));
        collegeList.add(new CollegeModel(R.drawable.ui_col,R.drawable.ic_col, "College of Law"));
        collegeList.add(new CollegeModel(R.drawable.ui_com,R.drawable.ic_com, "College of Medicine"));


        CollegeAdapter adapter = new CollegeAdapter(collegeList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}