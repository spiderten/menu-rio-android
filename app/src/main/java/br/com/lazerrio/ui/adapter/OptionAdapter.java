package br.com.lazerrio.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.lazerrio.R;
import br.com.lazerrio.model.Option;

public class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.OptionViewHolder> {

    private Context context;
    private List<Option> optionList;

    public OptionAdapter(Context context, List<Option> optionList) {
        this.context = context;
        this.optionList = optionList;
    }

    @NonNull
    @Override
    public OptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_option, parent, false);
        OptionViewHolder holder = new OptionViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull OptionViewHolder holder, int position) {
        holder.setValues(optionList.get(position));
    }

    @Override
    public int getItemCount() {
        return optionList.size();
    }

    public class OptionViewHolder extends RecyclerView.ViewHolder {

        private TextView name;

        public OptionViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
        }

        public void setValues(Option option) {
            name.setText(option.getName());
        }
    }

}