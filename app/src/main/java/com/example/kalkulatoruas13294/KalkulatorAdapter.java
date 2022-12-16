package com.example.kalkulatoruas13294;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KalkulatorAdapter extends RecyclerView.Adapter<KalkulatorAdapter.viewHolder> {
    public ArrayList<Kalkulator> listHasil;

    public KalkulatorAdapter(ArrayList<Kalkulator> listHasil){
        this.listHasil = listHasil;
    }

    @NonNull
    @Override
    public KalkulatorAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        viewHolder holder = new viewHolder(inflater.inflate(R.layout.item_activity, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Kalkulator kalkulator = listHasil.get(position);
        holder.txtAngka1.setText(kalkulator.getAngka1());
        holder.txtAngka2.setText(kalkulator.getAngka2());
        holder.txtHasil.setText(kalkulator.getHasil());
        holder.txtOperasi.setText(kalkulator.getOperasi());

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                int newPosition = holder.getAdapterPosition();
                listHasil.remove(newPosition);
                notifyItemRemoved(newPosition );
                notifyItemRangeChanged(newPosition, listHasil.size());

                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHasil.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public TextView txtAngka1, txtAngka2, txtHasil, txtOperasi;
        public ConstraintLayout itemView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            txtAngka1 = itemView.findViewById(R.id.txtAngka1);
            txtAngka2 = itemView.findViewById(R.id.txtAngka2);
            txtHasil = itemView.findViewById(R.id.txtHasil);
            txtOperasi = itemView.findViewById(R.id.txtOperasi);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.main_layout);

        }
    }
}