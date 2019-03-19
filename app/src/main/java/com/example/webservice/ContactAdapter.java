package com.example.webservice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>  {
    private Context mCtx;

    //we are storing all the products in a list
    private List<Hero> heros;

    public ContactAdapter(Context mCtx, List<Hero> heros) {
        this.mCtx = mCtx;
        this.heros = heros;
    }

    @NonNull
    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_recycleview, null);
        return new ContactViewHolder(view);

    }

    @Override
    public void onBindViewHolder( ContactViewHolder holder, int position) {
        Hero hero = heros.get(position);
holder.name.setText(hero.getName());
holder.team.setText(hero.getTeam());
holder.realname.setText(hero.getRealname());

    }

    @Override
    public int getItemCount() {
        return heros.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView name,team,realname;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            team=itemView.findViewById(R.id.team);
            realname=itemView.findViewById(R.id.realname);

        }
    }
}
