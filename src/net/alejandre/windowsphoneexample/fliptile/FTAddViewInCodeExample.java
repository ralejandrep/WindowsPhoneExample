package net.alejandre.windowsphoneexample.fliptile;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.FlipTile;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;


public class FTAddViewInCodeExample extends ActionBarActivity {

	private FlipTile ft;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flip_tile_example_in_code);
		// the root of the layout where we will insert the FlipTile:
		ViewGroup r = (ViewGroup) findViewById(R.id.FTRootInCode);
		// we create the FlipTile and set the data to make it work:
		ft = new FlipTile(this);
		ft.setTitle("Flip Tile Title In Code");
		ft.setFrontBackgroundResourceId(R.drawable.potatoes_bg);
		ft.setScaleType(ScaleType.FIT_XY); // by default center
		ft.setBackContent("Flip Tile Description In Code");
		ft.setBackBackgroundColor(Color.LTGRAY); // by default, the fathers background.
		ft.setDelay(4000); // if blank, by default 5000 (5 seconds).
		ft.setCounter(1); // if blank, the counter will not be showed.
		ft.start();
		// finally, we add the FlipTile to the root:
		r.addView(ft);
		
	}

	@Override
	public void onBackPressed() {
		// finish te rotation: 
		// TODO (Always put it after go to other activity)
		ft.finish();
		super.onBackPressed();
	}
	
}
