package org.bekadesain.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tentang");

        ImageView profilePic = findViewById(R.id.about_img);

        Glide.with(this)
                .load(R.drawable.about)
                .apply(new RequestOptions().override(180,180))
                .into(profilePic);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
