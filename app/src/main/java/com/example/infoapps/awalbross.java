package com.example.infoapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class awalbross extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle icicle) {
        super.onCreate(icicle);
        String[] listhospoital = new String[]{"Call Center","SMS Center","Driving Direction","Website","Info","Exit"};
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
            if (pilihan.equals("Call Center")){
                String nocall = "tel:0761-73646347";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nocall));


            }else if (pilihan.equals("SMS Center")) {
                String smsText="Deden Deswari";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:085274960215"));
                a.putExtra("sms_body",smsText);

            }else if (pilihan.equals("Driving Direction")) {
                String lokasi="google.navigation:q=0.463823,101.390353";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasi));

            }else if (pilihan.equals("Website")) {
                String website="http://www.awalbros.com";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            }else if (pilihan.equals("Info")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Awal Bross Pekanbaru");
            }
            startActivity(a);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
