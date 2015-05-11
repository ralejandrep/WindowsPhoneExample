package net.alejandre.windowsphoneexample.fliptile;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.FlipTile;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class FTGeneralClickListenerExample extends ActionBarActivity {

	private FlipTile ft;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flip_tile_example);
		
		// getting the view:
		ft = (FlipTile) findViewById(R.id.customfliptile);
		// setting the counter value:
		ft.setCounter(10);
		// init the rotation:
		ft.start();
		// general click listener for both faces the same action:
		ft.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(FTGeneralClickListenerExample.this,
						"Flip Tile Clicked!", Toast.LENGTH_SHORT).show();
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
