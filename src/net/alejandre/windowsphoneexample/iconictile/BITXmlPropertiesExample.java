package net.alejandre.windowsphoneexample.iconictile;

import java.util.Timer;
import java.util.TimerTask;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.BigIconicTile;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class BITXmlPropertiesExample extends ActionBarActivity {

	private BigIconicTile bit;
	private Timer timer;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.big_iconic_tile_example);
		
		// getting the view:
		bit = (BigIconicTile) findViewById(R.id.custombigiconictile);
		// setting the counter value:
		bit.setCounter(1);
		// init the rotation:
		bit.show();

		
		timer = new Timer("Hola");
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
		
						//synchronized (bit) {
							bit.incrementCounter();
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
