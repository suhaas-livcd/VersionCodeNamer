package com.hosteloha.versioncodenamer;

import android.os.Bundle;
import android.widget.TextView;

import com.hosteloha.versioncodenamerlib.VersionCodeNamer;
import com.hosteloha.versioncodenamerlib.VersioningType;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int versionCode = BuildConfig.VERSION_CODE;
        String versionName = BuildConfig.VERSION_NAME;

        TextView appVersionName = findViewById(R.id.application_version_name);
        String customVersionName = VersionCodeNamer.getName(versionCode, VersioningType.CHEMICAL_ELEMENTS);
        appVersionName.setText(customVersionName);

        TextView appVersionCode = findViewById(R.id.application_version_code);
        appVersionCode.setText("v " + versionName);

    }
}
