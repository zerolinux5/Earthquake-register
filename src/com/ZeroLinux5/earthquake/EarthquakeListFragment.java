package com.ZeroLinux5.earthquake;

import java.util.ArrayList;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class EarthquakeListFragment extends ListFragment {
	ArrayAdapter<Quake> aa;
	ArrayList<Quake> earthquakes = new ArrayList<Quake>();
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		int layoutID = android.R.layout.simple_list_item_1;
		aa = new ArrayAdapter<Quake>(getActivity(), layoutID , earthquakes); setListAdapter(aa);
	}
}
