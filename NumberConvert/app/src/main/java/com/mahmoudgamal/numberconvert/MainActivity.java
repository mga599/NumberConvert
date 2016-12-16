package com.mahmoudgamal.numberconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static final String ACTIVITY_NAME = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(ACTIVITY_NAME, "inCreate");
        setContentView(R.layout.activity_main);

        Button convertBtn = (Button) findViewById(R.id.convertButton);
        final TextView displayNumber = (TextView) findViewById(R.id.convertView);
        final EditText numberInput = (EditText) findViewById(R.id.numberInput);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numberInput.length() > 0)
                    displayNumber.setText(getNumberConverted(numberInput.getText()));
                else
                    displayNumber.setText("Please enter a correct number");
            }
        });
    }

    private static String getNumberConverted (Editable number){
            return NumberConvert.getNumberInString(Integer.parseInt(number.toString()));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(ACTIVITY_NAME, "OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ACTIVITY_NAME, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ACTIVITY_NAME, "onDestroy");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(ACTIVITY_NAME, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ACTIVITY_NAME, "omPause");
    }
}
