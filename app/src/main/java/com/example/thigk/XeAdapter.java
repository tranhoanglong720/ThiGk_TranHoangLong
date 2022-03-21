package com.example.thigk;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class XeAdapter extends BaseAdapter {
    private int Layout;
    private Context context;
    private List<XE> listxe;
    public XeAdapter(int layout, Context context, List<XE> listxe) {
        Layout = layout;
        this.context = context;
        this.listxe = listxe;
    }

    @Override
    public int getCount() {
        if(listxe.size() !=0 && !listxe.isEmpty())
        {
            return listxe.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(listxe.size() !=0 && !listxe.isEmpty())
        {
            convertView= LayoutInflater.from(parent.getContext()).inflate(Layout,parent,false);
        }
        final XE x=listxe.get(position);
        TextView txtten=(TextView)convertView.findViewById(R.id.txtten);
        TextView txtgia=(TextView)convertView.findViewById(R.id.txtgia);
        TextView txtgiam=(TextView)convertView.findViewById(R.id.txtgiam);
        ImageView imglogo=(ImageView)convertView.findViewById(R.id.imglogo);

        txtten.setText(x.getTen());
        txtgia.setText(x.getGia());
        txtgiam.setText(x.getGiam());
        imglogo.setImageResource(x.getId());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DetailXe.class);
                intent.putExtra("Xe",x);
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
