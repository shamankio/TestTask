package com.rustan.testtask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

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

        // fill DB
        new UserInfo("title1", "english", 10, 20).save();
        new UserInfo("title2", "ukraine", 61, 4).save();
        new UserInfo("title3", "chine", 50, 30).save();
        new UserInfo("title4", "spain", 80, 40).save();
        new UserInfo("title5", "italian", 90, 35).save();
        new UserInfo("title6", "english", 75, 50).save();
        new UserInfo("title7", "russian", 30, 40).save();
        new UserInfo("title8", "chine", 28, 20).save();
        new UserInfo("title9", "ukraine", 76, 90).save();
    }

    public void clickButton(View view) {
        String name = editText.getText().toString();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(NAME, name);
        startActivity(intent);
    }
}
