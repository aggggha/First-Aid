package org.bekadesain.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        checkConnection();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainScreen = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(mainScreen);
                finish();
            }
        }, 1000);
    }

    protected void checkConnection() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo != null && networkInfo.isConnectedOrConnecting()) {

        } else {
            Toast.makeText(SplashScreenActivity.this, "Tidak ada koneksi internet" +
                    "\nGambar mungkin tidak akan muncul sampai ada koneksi internet", Toast.LENGTH_LONG).show();
        }
    }
}
