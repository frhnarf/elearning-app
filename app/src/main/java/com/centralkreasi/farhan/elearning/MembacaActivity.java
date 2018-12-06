package com.centralkreasi.farhan.elearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MembacaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.membacainggris);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(MembacaActivity.this, MenuActivity.class));
        finish();
    }
}
