package com.digibizna.custompopup;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mShowDialog=(Button) findViewById(R.id.btnShowDialog);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder=new AlertDialog.Builder(MainActivity.this);
                View mview=getLayoutInflater().inflate(R.layout.dialog_login,null);
                final EditText mEmail=(EditText) mview.findViewById(R.id.etEmail);
                final EditText mPassword=(EditText) mview.findViewById(R.id.etPassword);
                Button mLogin=(Button) mview.findViewById(R.id.btnLogin);
                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!mEmail.getText().toString().isEmpty() && !mPassword.getText().toString().isEmpty()){
                            Toast.makeText(MainActivity.this,"Login successful",Toast.LENGTH_SHORT).show();

                        }else{


                            Toast.makeText(MainActivity.this,"Please Fill any empty fields",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            mbuilder.setView(mview);
            AlertDialog dialog=mbuilder.create();
            dialog.show();

            }
        });
    }
}
