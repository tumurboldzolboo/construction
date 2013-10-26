package csms.edu.mn.devis.ubbuilding;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Calculate extends Activity {

	ImageButton homeButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculate);
		homeButton = (ImageButton) findViewById(R.id.homeButton);
		homeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				homePage();
			}
			});
}

	public void homePage(){
	Intent callHome = new Intent(this, MainActivity.class);
	startActivity(callHome);

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.apartment, menu);
		return true;
	}

}
