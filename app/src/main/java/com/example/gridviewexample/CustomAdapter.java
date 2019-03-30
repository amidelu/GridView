package com.example.gridviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int [] playerImage;
    String [] playerName;
    LayoutInflater inflater;

    public CustomAdapter(Context context, int[] playerImage, String[] playerIndex) {
        this.context = context;
        this.playerImage = playerImage;
        this.playerName = playerIndex;
    }

    @Override
    public int getCount() {
        return playerName.length;
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
    public View getView(final int position, View convertView, final ViewGroup parent) {
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.gridlayout, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageId);
        TextView textView = convertView.findViewById(R.id.headingID);
        Button button = convertView.findViewById(R.id.headingBtnId);

        imageView.setImageResource(playerImage [position]);
        textView.setText(playerName [position]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((GridView) parent).performItemClick(v, position, 0);
            }
        });

        return convertView;
    }

}
