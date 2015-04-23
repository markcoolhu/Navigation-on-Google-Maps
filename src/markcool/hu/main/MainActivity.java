package markcool.hu.main;

import markcool.hu.navigation.R;
import android.net.Uri;
import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		double startLatitude = 24.772018;
		double startLongitude = 121.002129;
		
		double endLatitude = 24.7909902;
		double endLongitude = 121.0024402;
		
		String saddr = "saddr=" + startLatitude + "," + startLongitude;
		String daddr = "daddr=" + endLatitude + "," + endLongitude;
		String uriString = "http://maps.google.com/maps?" + saddr + "&" + daddr;
		
		Uri uri = Uri.parse(uriString);
		
		Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
		
		// If you want to get rid of the dialog, 
		// Before the startActivity() add this
		intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
		
		startActivity(intent);
	

			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
