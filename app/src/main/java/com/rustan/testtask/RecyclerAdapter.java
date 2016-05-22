package com.rustan.testtask;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    private List<UserInfo> mUserInfos;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView language;
        public TextView count1;
        public TextView count2;

        public ViewHolder(View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.rw_title);
            language = (TextView) v.findViewById(R.id.rw_language);
            count1 = (TextView) v.findViewById(R.id.rw_count1);
            count2 = (TextView) v.findViewById(R.id.rw_count2);
        }
    }

    public RecyclerAdapter(List<UserInfo> userInfos) {
        mUserInfos = userInfos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_template, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(mUserInfos.get(position).getTitle());
        holder.language.setText(mUserInfos.get(position).getLangage());
        holder.count1.setText(String.valueOf(mUserInfos.get(position).getCount1()));
        holder.count2.setText(String.valueOf(mUserInfos.get(position).getCount2()));
    }

    @Override
    public int getItemCount() {
        return mUserInfos.size();
    }

}
