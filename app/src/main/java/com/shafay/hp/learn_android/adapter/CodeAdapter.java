package com.shafay.hp.learn_android.adapter;

import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.shafay.hp.learn_android.R;
import com.shafay.hp.learn_android.model.Code;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CodeAdapter extends RecyclerView.Adapter<CodeAdapter.CodeViewHolder> {

    private Context context;
    private List<Code> codeList;
    Intent intent;

    public CodeAdapter(Context context, List<Code> codeList) {
        this.codeList = codeList;
    }

    @NonNull
    @Override
    public CodeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.code_layout_item, viewGroup, false);
        return new CodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CodeViewHolder codeViewHolder, int i) {
        Code subItem = codeList.get(i);

        codeViewHolder.textTitle.setText(subItem.getTitle());
        codeViewHolder.imageThum.setImageResource(subItem.getImg());

        codeViewHolder.relativeLayout.setOnClickListener(v -> {
            intent = new Intent(context, subItem.getExcecuteClass());
            context.startActivity(intent);
        });

    }


    @Override
    public int getItemCount() {
        return codeList.size();
    }

    class CodeViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle;
        ImageView imageThum;
        RelativeLayout relativeLayout;

        CodeViewHolder(View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textViewa);
            imageThum = itemView.findViewById(R.id.imageViewa);
            relativeLayout = itemView.findViewById(R.id.rl_code_view);

        }
    }

}