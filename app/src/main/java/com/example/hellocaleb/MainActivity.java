package com.example.hellocaleb;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.TextColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("Caleb", "Button Clicked");
                ((TextView) findViewById(R.id.textView2)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.ViewColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.ChangeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String theEntry = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(theEntry)) {
                    ((TextView) findViewById(R.id.textView2)).setText("Hello from Caleb!");
                }
                else {
                    ((TextView) findViewById(R.id.textView2)).setText(theEntry);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Reset text color to black
                ((TextView) findViewById(R.id.textView2)).setTextColor(
                        getResources().getColor(R.color.black));

                //Reset background color to colorAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));

                //Reset the back to "Hello from Caleb"
                ((TextView) findViewById(R.id.textView2)).setText("Hello from Caleb!");
            }
        });
    }
}
