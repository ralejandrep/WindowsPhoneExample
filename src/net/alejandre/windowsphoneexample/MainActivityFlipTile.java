package net.alejandre.windowsphoneexample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;


public class MainActivityFlipTile extends ListActivity implements OnItemClickListener {
	
	private String[] subMenus = new String[] {
			"Small Flip Tile",
			"Bitmap Image",
			"XML Properties",
			"Custom Counter Circle",
			"Counter Invisible", 
			"Custom Backgrounds",
			"Custom Text Style",
			"Add Flip Tile In Code",
			"General Click Listener",
			"Custom Click Listeners"
	};
	private String[] subClass = new String[] {
			"FTSmallExample",
			"FTBitmapImageSrcExample",
			"FTXmlPropertiesExample",
			"FTCustomCounterExample",
			"FTNotCounterExample",
			"FTCustomBackgroundExample",
			"FTCustomTextExample",
			"FTAddViewInCodeExample",
			"FTGeneralClickListenerExample",
			"FTCustomClickListenerExample"
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
			Class<?> myGeneric = Class.forName(getPackageName()+".fliptile."+subClass[position]);
			Intent intent = new Intent(MainActivityFlipTile.this.getBaseContext(), myGeneric);
			startActivity(intent);	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
