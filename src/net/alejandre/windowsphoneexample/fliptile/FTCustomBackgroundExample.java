package net.alejandre.windowsphoneexample.fliptile;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.FlipTile;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView.ScaleType;


public class FTCustomBackgroundExample extends ActionBarActivity {

	private FlipTile ft;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flip_tile_example_no_bg);
		
		// getting the view:
		ft = (FlipTile) findViewById(R.id.customfliptile);
		// setting the counter value:
		ft.setCounter(18);
		// custom front image:
		ft.setFrontBackgroundResourceId(R.drawable.potatoes_bg);
		// custom scaleType:
		// you can also use the xml atribute: front_scale_type.
		ft.setScaleType(ScaleType.FIT_XY);
		// custom back background color:
		ft.setBackBackgroundColor(Color.LTGRAY);
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
