package com.example.georgevio.sqlinew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ThreeColumn_ListAdapter extends ArrayAdapter<user> {

    private LayoutInflater mInflater;
    private ArrayList<user> users;
    private int mViewResourceId;

    public ThreeColumn_ListAdapter(Context context, int textViewResourceId, ArrayList<user> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        user user = users.get(position);

        if (user != null) {
            TextView name = (TextView) convertView.findViewById(R.id.textname);
            TextView phone = (TextView) convertView.findViewById(R.id.textphone);
            TextView email = (TextView) convertView.findViewById(R.id.textemail);
            TextView street = (TextView) convertView.findViewById(R.id.textstreet);
            if (name != null) {
                name.setText(user.getname());
            }
            if (phone != null) {
                phone.setText((user.getPhone()));
            }
            if (email != null) {
                email.setText((user.getEmail()));
            }
            if (street != null) {
                street.setText((user.getStreet()));
            }
        }

        return convertView;
    }
}