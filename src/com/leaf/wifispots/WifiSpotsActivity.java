package com.leaf.wifispots;

import java.util.ArrayList;
import com.leaf.wifispots.adapters.WSNetworksAdapter;
import com.leaf.wifispots.models.WSNetwork;
import android.app.ListActivity;
import android.os.Bundle;

public class WifiSpotsActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<WSNetwork> names = new ArrayList<WSNetwork>();
        names.add(new WSNetwork("Home", "geeknet"));
        names.add(new WSNetwork("Work", "SpringField"));
        
        WSNetworksAdapter adapter = new WSNetworksAdapter(this, names); 
        setListAdapter(adapter);
        
        setContentView(R.layout.main);
    }
}