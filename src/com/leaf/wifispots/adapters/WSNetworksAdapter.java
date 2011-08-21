package com.leaf.wifispots.adapters;

import java.util.ArrayList;
import com.leaf.wifispots.R;
import com.leaf.wifispots.models.WSNetwork;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class WSNetworksAdapter extends ArrayAdapter<WSNetwork> {

    private ArrayList<WSNetwork> items;
	private final Activity context;

    public WSNetworksAdapter(Activity context, ArrayList<WSNetwork> items) {
        super(context, R.layout.wifi_list_row, items);
        this.items = items;
        this.context = context;
    }

    private static class ViewHolder
    {
    	private TextView tvNetworkName;
    	private TextView tvNetworkSSID;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	ViewHolder viewHolder;
    	
    	View view = convertView;
    	if(null == view) {
    		
            LayoutInflater vi = (LayoutInflater)this.context.getLayoutInflater();
            view = vi.inflate(R.layout.wifi_list_row, null);
            
            viewHolder = new ViewHolder();
            viewHolder.tvNetworkName = (TextView) view.findViewById(R.id.network_name);
            viewHolder.tvNetworkSSID = (TextView) view.findViewById(R.id.network_ssid);
            view.setTag(viewHolder);
            
    	} else {
    		viewHolder = (ViewHolder) view.getTag();
    	}

        WSNetwork network = items.get(position);
        if (network != null) { 
            
        	viewHolder.tvNetworkName.setText(network.getName());                            
        	viewHolder.tvNetworkSSID.setText("SSID: "+ network.getSSID());                                    
        }
        
        return view;
    }
}
