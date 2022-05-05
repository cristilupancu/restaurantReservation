package com.example.restaurantepc;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class Mainn extends Activity {
    TextView hellotext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);
        hellotext=(TextView) findViewById(R.id.hellotext);
        Bundle extras = getIntent().getExtras();
        String mail=extras.getString("mail");
        String hello="Buna "+ mail+ "!";
        hellotext.setText(hello);
    }
}