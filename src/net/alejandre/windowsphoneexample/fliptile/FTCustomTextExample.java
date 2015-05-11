package net.alejandre.windowsphoneexample.fliptile;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.FlipTile;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class FTCustomTextExample extends ActionBarActivity {

	private FlipTile ft;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flip_tile_example);
		
		// getting the view:
		ft = (FlipTile) findViewById(R.id.customfliptile);
		// setting the counter value:
		ft.setCounter(200);
		// setting the title text styles:
		ft.setTitleColor(Color.BLUE);
		ft.setTitleTextSize(24);
		ft.setTitleTypeFace(Typeface.BOLD_ITALIC);
		// setting the back content text styles (not the title):
		ft.setBackContentColor(Color.WHITE);
		ft.setBackContentTextSize(20);
		ft.setBackContentTypeFace(Typeface.ITALIC);
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
