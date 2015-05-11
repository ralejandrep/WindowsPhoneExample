package net.alejandre.windowsphoneexample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;


public class MainActivityIconicTile extends ListActivity implements OnItemClickListener {
	
	private String[] subMenus = new String[] {
			"Big XML Properties",
			"Medium XML Properties",
			"Small XML Properties"
	};
	private String[] subClass = new String[] {
			"BITXmlPropertiesExample",
			"MITXmlPropertiesExample",
			"SITXmlPropertiesExample"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        android.R.layout.simple_list_item_1, subMenus); 
		
		setListAdapter(adapter);
		
		this.getListView().setOnItemClickListener(this);

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		try {
			Class<?> myGeneric = Class.forName(getPackageName()+".iconictile."+subClass[position]);
			Intent intent = new Intent(MainActivityIconicTile.this.getBaseContext(), myGeneric);
			startActivity(intent);	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
