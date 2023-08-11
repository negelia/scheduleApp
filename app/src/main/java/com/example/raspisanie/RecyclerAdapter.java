package com.example.raspisanie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>  {
    private final LayoutInflater inflater;
    private final List<Model> names;

    RecyclerAdapter(Context context, List<Model> names) {
        this.names = names;
        this.inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        Model state = names.get(position);
        holder.day.setText(state.getDay());

        holder.lesson1.setText(state.getLesson1());
        holder.lesson2.setText(state.getLesson2());
        holder.lesson3.setText(state.getLesson3());
        holder.lesson4.setText(state.getLesson4());
        holder.lesson5.setText(state.getLesson5());

        holder.subject1.setText(state.getSubject1());
        holder.subject2.setText(state.getSubject2());
        holder.subject3.setText(state.getSubject3());
        holder.subject4.setText(state.getSubject4());
        holder.subject5.setText(state.getSubject5());

        holder.teacher1.setText(state.getTeacher1());
        holder.teacher2.setText(state.getTeacher2());
        holder.teacher3.setText(state.getTeacher3());
        holder.teacher4.setText(state.getTeacher4());
        holder.teacher5.setText(state.getTeacher5());
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView day,
                lesson1, lesson2, lesson3, lesson4, lesson5,
                subject1, subject2, subject3, subject4, subject5,
                teacher1, teacher2, teacher3, teacher4, teacher5;
        ViewHolder(View view){
            super(view);
            day = itemView.findViewById(R.id.day);

            lesson1 = itemView.findViewById(R.id.lesson1);
            lesson2 = itemView.findViewById(R.id.lesson2);
            lesson3 = itemView.findViewById(R.id.lesson3);
            lesson4 = itemView.findViewById(R.id.lesson4);
            lesson5 = itemView.findViewById(R.id.lesson5);

            subject1 = itemView.findViewById(R.id.subject1);
            subject2 = itemView.findViewById(R.id.subject2);
            subject3 = itemView.findViewById(R.id.subject3);
            subject4 = itemView.findViewById(R.id.subject4);
            subject5 = itemView.findViewById(R.id.subject5);

            teacher1 = itemView.findViewById(R.id.teacher1);
            teacher2 = itemView.findViewById(R.id.teacher2);
            teacher3 = itemView.findViewById(R.id.teacher3);
            teacher4 = itemView.findViewById(R.id.teacher4);
            teacher5 = itemView.findViewById(R.id.teacher5);
        }
    }
}
