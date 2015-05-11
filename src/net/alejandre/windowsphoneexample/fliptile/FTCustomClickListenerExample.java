package net.alejandre.windowsphoneexample.fliptile;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.interfaces.OnFlipTileClickListener;
import net.alejandre.windowsphonelib.tiles.FlipTile;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class FTCustomClickListenerExample extends ActionBarActivity {

	private FlipTile ft;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flip_tile_example);
		
		// getting the view:
		ft = (FlipTile) findViewById(R.id.customfliptile);
		// setting the counter value:
		ft.setCounter(10);
		// we have to make the FlipTile to know that we want the custom click listener:
		ft.setCustomListener(true);
		// init the rotation:
		ft.start();
		// custom click listeners:
		ft.setOnFlipTileClickListener(new OnFlipTileClickListener() {
			
			@Override
			public void onFrontFaceClick() {
				Toast.makeText(FTCustomClickListenerExample.this,
						"You have clicked Front Face!", Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public void onBackFaceClick() {
				Toast.makeText(FTCustomClickListenerExample.this,
						"You have clicked Back Face!", Toast.LENGTH_SHORT).show();
			}

		});

	}

	@Override
	public void onBackPressed() {
		// finish te rotation: 
		// TODO (Always put it after go to other activity)
		ft.finish();
		super.onBackPressed();
	}
	
}
