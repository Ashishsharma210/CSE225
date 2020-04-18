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
public class ChatFragment extends Fragment {


    public ChatFragment() {
        // Required empty public constructor
    }

    private RecyclerView chatRecyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        chatRecyclerView = view.findViewById(R.id.chat_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        chatRecyclerView.setLayoutManager(layoutManager);

        List<ChatModel> chatModelList = new ArrayList<>();
        chatModelList.add(new ChatModel("Rohan", "Ok", "6.48pm"));
        chatModelList.add(new ChatModel("Nikhil", "hello", "5.48pm"));
        chatModelList.add(new ChatModel("John", "k", "4.48pm"));
        chatModelList.add(new ChatModel("Sonu", "Ok", "Yesterday"));

        ChatAdapter chatAdapter = new ChatAdapter(chatModelList);
        chatRecyclerView.setAdapter(chatAdapter);
        chatAdapter.notifyDataSetChanged();
        return view;
    }

}
