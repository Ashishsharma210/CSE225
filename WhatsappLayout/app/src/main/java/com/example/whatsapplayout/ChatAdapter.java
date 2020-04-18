package com.example.whatsapplayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private List<ChatModel> chatModelList;
    public ChatAdapter(List<ChatModel> chatModelList){
        this.chatModelList = chatModelList;
    }
    @NonNull
    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ViewHolder holder, int position) {
        String name = chatModelList.get(position).getName();
        String message = chatModelList.get(position).getMessage();
        String date = chatModelList.get(position).getDate();
        holder.setData(name, message, date);
    }

    @Override
    public int getItemCount() {
        return chatModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView message;
        private TextView date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            message = itemView.findViewById(R.id.message);
            date = itemView.findViewById(R.id.date);

        }

        public void setData(String name1, String message1, String date1) {
            name.setText(name1);
            message.setText(message1);
            date.setText(date1);
        }
    }
}
