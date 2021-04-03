package com.example.infoapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class hospital extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        String[] listhospoital = new String[]{"Rumah Sakit Awal Bross","Rumah Sakit Eka Hospital","Rumah Sakit Jiwa Tampan"};
        this.setListAdapter(new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,listhospoital));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilpilihan(pilihan);
    }

    private void tampilpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bross")){
                a = new Intent(this,awalbross.class);
                startActivity(a);

        }else if (pilihan.equals("Rumah Sakit Eka Hospital"))
        {
        }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
