package net.alejandre.windowsphoneexample.fliptile;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.FlipTile;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class FTCustomCounterExample extends ActionBarActivity {

	private FlipTile ft;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flip_tile_example);

		// getting the view:
		ft = (FlipTile) findViewById(R.id.customfliptile);
		// customizing the circle: Use always a 40 x 40 xml shape.
		ft.setCircleBackgroundResId(R.drawable.custom_count_circle);
		// setting the counter value:
		ft.setCounter(18);
		// init the rotation:
		ft.start();
		
	}

	@Override
	public void onBackPressed() {
		// finish te rotation: 
		// TODO (Always put it after go to other activity)
		ft.finish();
		super.onBackPressed();
	}
	
}
