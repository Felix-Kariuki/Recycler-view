package com.flexcode.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

//ADAPTER CLASS IS THE MOST IMPORTANT FOR RECYCLER VIEW FUNCTIONALITY
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    //modernClass recycler
    private List<ModelClassRecycler> userList;

    //Constructor for adapter


    public Adapter(List<ModelClassRecycler> userList) {
        this.userList = userList;
    }

    //inflating data
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tem_recycler,parent,false);
        return new ViewHolder(view);
    }

    //binding data
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int Image = userList.get(position).getIvImage();
        String Name = userList.get(position).getTvName();
        String Message = userList.get(position).getTvMessage();
        String Time = userList.get(position).getTvTime();
        String Divider = userList.get(position).getTvDivider();

        //send this data to holder
        holder.setData(Image,Name,Message,Time,Divider);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{

        private ImageView ivImage;
        private TextView tvName;
        private TextView tvTime;
        private TextView tvDivider;
        private TextView tvMessage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //ASSIGN OUR XML ID
            ivImage = itemView.findViewById(R.id.ivImage);
            tvName  = itemView.findViewById(R.id.tvName);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvDivider = itemView.findViewById(R.id.tvDivider);
            tvMessage = itemView.findViewById(R.id.tvMessage);


        }

        public void setData(int image, String name, String message, String time, String divider) {

            ivImage.setImageResource(image);
            tvName.setText(name);
            tvMessage.setText(message);
            tvDivider.setText(divider);
            tvTime.setText(time);

        }
    }
}
