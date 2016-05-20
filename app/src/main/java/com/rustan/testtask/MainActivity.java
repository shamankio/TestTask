package com.rustan.testtask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText editText;
    public static final String NAME = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void clickButton(View view) {
        String name = editText.getText().toString();
        Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(NAME, name);
        startActivity(intent);
    }
}
