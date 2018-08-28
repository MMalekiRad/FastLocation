package libs.simorgh.fastlocation;
//  MMalekiRad
//  mmalekirad.ir

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import libs.simorgh.mmr.fastlocation.HeminFastLocation;

public class MainActivity extends AppCompatActivity {

    private HeminFastLocation heminFastLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        heminFastLocation = new HeminFastLocation(this);
        if (heminFastLocation.getLatitude() != -1)
        Toast.makeText(this, "Lat: " + heminFastLocation.getLatitude() + "\nLon: " +
                heminFastLocation.getLongitude(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        heminFastLocation.stopUsingGPS();
    }
}
