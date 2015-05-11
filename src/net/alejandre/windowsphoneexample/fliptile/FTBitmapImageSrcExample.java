package net.alejandre.windowsphoneexample.fliptile;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.FlipTile;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView.ScaleType;


public class FTBitmapImageSrcExample extends ActionBarActivity {

	private FlipTile ft;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flip_tile_example_no_bg);
		
		// getting the view:
		ft = (FlipTile) findViewById(R.id.customfliptile);
		// setting the counter value:
		ft.setCounter(5);
		// creating the bitmap:
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.potatoes_bg);
		// bringing to the Flip Tile the bitmap:
		ft.setFrontImageBitmap(bitmap);
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
