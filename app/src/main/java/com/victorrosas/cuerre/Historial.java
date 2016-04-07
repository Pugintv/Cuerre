package com.victorrosas.cuerre;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class Historial extends AppCompatActivity {
    private GridView gridView;
    private GridViewAdapter gridAdapter;
    ArrayList<ImageItem> imageItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        gridView = (GridView) findViewById(R.id.gridView);
        gridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, getData());

        imageItems = new ArrayList<>();
        imageItems.add(new ImageItem(BitmapFactory.decodeResource(getResources(), R.drawable.cit),"CIT"));
        imageItems.add(new ImageItem(BitmapFactory.decodeResource(getResources(), R.drawable.galileo),"Galileo"));
        imageItems.add(new ImageItem(BitmapFactory.decodeResource(getResources(), R.drawable.pit3),"PIT3"));


        ArrayAdapter<ImageItem> adapter = new ArrayAdapter<ImageItem>(this,
                android.R.layout.simple_list_item_1, imageItems);

        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

          public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            ImageItem item = (ImageItem) parent.getItemAtPosition(position);
              //Create intent
              Intent edificiosIntent = new Intent("com.victorrosas.cuerre.Edificios");
              edificiosIntent.putExtra("Imagename",item.getTitle());
              startActivity(edificiosIntent);
          }
        });
    }
    // Prepare some dummy data for gridview
    private ArrayList<ImageItem> getData(){
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        /*imageItems.add(new ImageItem(BitmapFactory.decodeResource(getResources(), R.drawable.cit),"CIT"));
        imageItems.add(new ImageItem(BitmapFactory.decodeResource(getResources(), R.drawable.galileo),"Galileo"));
        imageItems.add(new ImageItem(BitmapFactory.decodeResource(getResources(), R.drawable.pit3),"PIT3"));*/
        /*TypedArray imgs = getResources().obtainTypedArray();
        for (int i = 0; i < imgs.length(); i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            imageItems.add(new ImageItem(bitmap, "Image#" + i));
        }*/
        return imageItems;
    }

}
