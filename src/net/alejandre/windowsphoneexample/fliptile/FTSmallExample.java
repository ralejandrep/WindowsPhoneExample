package net.alejandre.windowsphoneexample.fliptile;

import net.alejandre.windowsphoneexample.R;
import net.alejandre.windowsphonelib.tiles.SmallFlipTile;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class FTSmallExample extends ActionBarActivity {

	private SmallFlipTile ft;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.small_flip_tile_example);
		
		// getting the view:
		ft = (SmallFlipTile) findViewById(R.id.customsmallfliptile);
		// setting the counter value:
		ft.setCounter(3);
		// setting a click listener:
		ft.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(FTSmallExample.this,
						"Clicked the Small Flip Tile!", Toast.LENGTH_SHORT).show();
			}
		});
		// make the small flip tile visible:
		ft.show();

	}
	
}
