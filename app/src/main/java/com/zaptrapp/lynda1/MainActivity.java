package com.zaptrapp.lynda1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;

    List<DataItem> mDataItemList = SampleDataProvider.sDataItemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.put);

        //clear the textView
        tvOut.setText("");

        //for ascending order sorting

        Collections.sort(mDataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem item, DataItem t1) {
                return item.getItemName().compareTo(t1.getItemName());
            }
        });

        //Display the data in the textView
        for(DataItem item:mDataItemList){
            tvOut.append(item.getItemName()+"\n");
        }

    }
}
