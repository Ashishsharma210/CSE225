package com.example.whatsapplayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.ViewHolder> {

    private List<CallModel> callModelList;
    public CallAdapter(List<CallModel> callModelList){
        this.callModelList = callModelList;
    }
    @NonNull
    @Override
    public CallAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallAdapter.ViewHolder holder, int position) {
        String name = callModelList.get(position).getName();
        String date = callModelList.get(position).getDate();
        holder.setData(name, date);
    }

    @Override
    public int getItemCount() {
        return callModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            date = itemView.findViewById(R.id.date);

        }

        public void setData(String name1, String date1) {
            name.setText(name1);
            date.setText(date1);
        }
    }
}
