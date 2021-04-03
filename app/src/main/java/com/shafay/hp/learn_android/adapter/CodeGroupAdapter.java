package com.shafay.hp.learn_android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shafay.hp.learn_android.R;
import com.shafay.hp.learn_android.model.CodeGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CodeGroupAdapter extends RecyclerView.Adapter<CodeGroupAdapter.CodeGroupViewHolder> {

    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
    private Context context;
    private List<CodeGroup> groupCodeList;

    public CodeGroupAdapter(Context context, List<CodeGroup> groupCodeList) {
        this.context = context;
        this.groupCodeList = groupCodeList;
    }

    @NonNull
    @Override
    public CodeGroupViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.code_group_layout_item, viewGroup, false);
        return new CodeGroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CodeGroupViewHolder codeGroupViewHolder, int i) {
        CodeGroup item = groupCodeList.get(i);
        codeGroupViewHolder.tvGroupTitle.setText(item.getCodeGroupTitle());
        // Create layout manager with initial prefetch item count
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                codeGroupViewHolder.rvChildCodes.getContext(),
                LinearLayoutManager.VERTICAL,
                false
        );

        layoutManager.setInitialPrefetchItemCount(item.getCode().size());

        // Create sub item view adapter
        CodeAdapter codeAdapter = new CodeAdapter(context, item.getCode());

        codeGroupViewHolder.rvChildCodes.setLayoutManager(layoutManager);
        codeGroupViewHolder.rvChildCodes.setAdapter(codeAdapter);
        codeGroupViewHolder.rvChildCodes.setRecycledViewPool(viewPool);
    }

    @Override
    public int getItemCount() {
        return groupCodeList.size();
    }

    class CodeGroupViewHolder extends RecyclerView.ViewHolder {
        private TextView tvGroupTitle;
        private RecyclerView rvChildCodes;

        CodeGroupViewHolder(View itemView) {
            super(itemView);
            tvGroupTitle = itemView.findViewById(R.id.tv_group_title);
            rvChildCodes = itemView.findViewById(R.id.rv_child_codes);
        }
    }
}