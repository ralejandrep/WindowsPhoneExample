package net.alejandre.windowsphoneexample.iconictile;

import java.util.Timer;
import java.util.TimerTask;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.BigIconicTile;
import net.alejandre.windowsphonelib.tiles.SmallIconicTile;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class SITXmlPropertiesExample extends ActionBarActivity {

	private SmallIconicTile sit, sit2;
	private Timer timer;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.small_iconic_tile_example);
		
		// getting the view:
		sit = (SmallIconicTile) findViewById(R.id.customsmalliconictile);
		// show the small iconic tile.
		sit.show();
	}
	
}
