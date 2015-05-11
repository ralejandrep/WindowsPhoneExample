package net.alejandre.windowsphoneexample.iconictile;

import java.util.Timer;
import java.util.TimerTask;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.BigIconicTile;
import net.alejandre.windowsphonelib.tiles.MediumIconicTile;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MITXmlPropertiesExample extends ActionBarActivity {

	private MediumIconicTile mit;
	private Timer timer;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.medium_iconic_tile_example);
		
		// getting the view:
		mit = (MediumIconicTile) findViewById(R.id.custommediumiconictile);
		// setting the counter value:
		mit.setCounter(1);
		// init the rotation:
		mit.show();

		
		timer = new Timer("Hola");
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
		
						//synchronized (bit) {
							mit.incrementCounter();
						//}
					}
				}, 0, 1000);
	}
	
	@Override
	public void onBackPressed() {
		timer.cancel();
		super.onBackPressed();
	}
	
}
