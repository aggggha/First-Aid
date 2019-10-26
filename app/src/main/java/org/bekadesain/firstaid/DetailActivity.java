package org.bekadesain.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_PHOTO = "photo";
    public static final String EXTRA_SUGGESTION = "suggestion";
    public static final String EXTRA_AVOID = "avoid";

    TextView detailTitle, detailImageSource, detailSuggest, detailAvoid;
    ImageView detailImage;

    String dTitle, dSuggest, dAvoid, dImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailImage = findViewById(R.id.detail_img);
        detailTitle = findViewById(R.id.detail_title);
        detailImageSource = findViewById(R.id.detail_img_source);
        detailSuggest = findViewById(R.id.detail_suggestion);
        detailAvoid = findViewById(R.id.detail_avoid);

        dTitle = getIntent().getStringExtra(EXTRA_NAME);
        dSuggest = getIntent().getStringExtra(EXTRA_SUGGESTION);
        dAvoid = getIntent().getStringExtra(EXTRA_AVOID);
        dImage = getIntent().getStringExtra(EXTRA_PHOTO);

        detailTitle.setText(dTitle);
        detailSuggest.setText(dSuggest);
        detailAvoid.setText(dAvoid);
        detailImageSource.setText("Image source: " + dImage);

        RequestOptions options = new RequestOptions()
                .centerCrop();
        Glide.with(this).load(dImage).apply(options).into(detailImage);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(dTitle);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
