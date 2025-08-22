package com.example.arkitektura.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arkitektura.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Content#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Content extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Content() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Content.
     */
    // TODO: Rename and change types and number of parameters
    public static Content newInstance(String param1, String param2) {
        Content fragment = new Content();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);

        ImageView collegeLogo = view.findViewById(R.id.collegeLogo);
        TextView collegeName = view.findViewById(R.id.collegeTitle);
        TextView collegeHistory = view.findViewById(R.id.collegeHistory);
        TextView collegeInfo = view.findViewById(R.id.collegeInfo);

        if (getArguments() != null) {
            collegeLogo.setImageResource(getArguments().getInt("logo"));
            collegeName.setText(getArguments().getString("name"));
            collegeHistory.setText(getArguments().getString("history"));
            collegeInfo.setText(getArguments().getString("info"));
        }



        return view;
    }
}