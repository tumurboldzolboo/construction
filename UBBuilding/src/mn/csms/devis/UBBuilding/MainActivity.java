package mn.csms.devis.UBBuilding;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	ImageButton apartmentImage;
	ImageButton houseImage;
	ImageButton officeImage;
	ImageButton newsImage;
	ImageButton priceInfoImage;
	ImageButton calculateImage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		apartmentImage = (ImageButton) findViewById(R.id.apartmentButton);
		houseImage = (ImageButton) findViewById(R.id.houseButton);
		officeImage = (ImageButton) findViewById(R.id.officeButton);
		newsImage = (ImageButton) findViewById(R.id.newsButton);
		priceInfoImage = (ImageButton) findViewById(R.id.priceInfoButton);
		calculateImage = (ImageButton) findViewById(R.id.calculateButton);
		
			apartmentImage.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					apartPage();
				}
				});
			houseImage.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					housePage();
				}
				});
			officeImage.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					officePage();
				}
				});
			newsImage.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
				newsPage();
				}
				});
			priceInfoImage.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					pricePage();
				}
				});
			calculateImage.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					calculatePage();
				}
				});
	}
	
	public void apartPage(){
    	Intent callApart = new Intent(this, Apartment.class);
    	startActivity(callApart);
	}
	public void housePage(){
    	Intent callHouse = new Intent(this, House.class);
    	startActivity(callHouse);
	}
	public void officePage(){
    	Intent callOffice = new Intent(this, Office.class);
    	startActivity(callOffice);
	}
	public void newsPage(){
    	Intent callNews = new Intent(this, News.class);
    	startActivity(callNews);
	}
	public void pricePage(){
    	Intent callPrice = new Intent(this, PriceInfo.class);
    	startActivity(callPrice);
	}
	public void calculatePage(){
    	Intent callCalculate = new Intent(this, Calculate.class);
    	startActivity(callCalculate);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
