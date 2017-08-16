package com.example.sly.sum;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sum_and_product(View view) {
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText = (EditText) findViewById(R.id.editText);
        int first = Integer.valueOf(editText2.getText().toString());
        int second = Integer.valueOf(editText4.getText().toString());
        int add = first + second;
        int product = first * second;
        editText3.setText(Integer.toString(add));
        editText.setText(Integer.toString(product));
    }


    public void clear(View view) {
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText = (EditText) findViewById(R.id.editText);
        editText2.setText("");
        editText2.requestFocus();
        editText2.setText("");
        editText3.setText("");
        editText4.setText("");
        editText.setText("");
    }


    public void quit() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)


                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {


                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
