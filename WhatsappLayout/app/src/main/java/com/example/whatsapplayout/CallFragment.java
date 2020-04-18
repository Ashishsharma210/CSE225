package com.example.whatsapplayout;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CallFragment extends Fragment {


    public CallFragment() {
        // Required empty public constructor
    }
    private RecyclerView callRecyclerView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_call, container, false);
        callRecyclerView = view.findViewById(R.id.call_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        callRecyclerView.setLayoutManager(layoutManager);

        List<CallModel> callModelList = new ArrayList<>();
        callModelList.add(new CallModel("Rohan", "15 April, 6:36"));
        callModelList.add(new CallModel("Nikhil", "12 April, 6:00"));
        callModelList.add(new CallModel("John", "10 April, 8:06"));
        callModelList.add(new CallModel("Sonu", "1 April, 6:36"));

        CallAdapter callAdapter = new CallAdapter(callModelList);
        callRecyclerView.setAdapter(callAdapter);
        callAdapter.notifyDataSetChanged();
        return view;
    }


}
