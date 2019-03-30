package com.example.gridviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String [] playerIndex;
    String [] playerDetails;
    Button button;
    private int playerImage [] = {R.drawable.mashrafe, R.drawable.mushfiq, R.drawable.sakib, R.drawable.tamim};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= findViewById(R.id.listId);
        playerIndex = getResources().getStringArray(R.array.nameIndex);
        playerDetails = getResources().getStringArray(R.array.playerDetails);
        button = findViewById(R.id.headingBtnId);

        CustomAdapter customAdapter = new CustomAdapter(this, playerImage, playerIndex);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                long viewId = view.getId();

                if (viewId == R.id.headingBtnId) {
                    int pImage = playerImage [position];
                    String pName = playerIndex [position];
                    String pDetails = playerDetails [position];

                    Intent intent = new Intent(MainActivity.this, PlayerDetails.class);

                    intent.putExtra("pImage", pImage);
                    intent.putExtra("pName", pName);
                    intent.putExtra("pDetails", pDetails);

                    startActivity(intent);
                }
            }
        });
    }
}
