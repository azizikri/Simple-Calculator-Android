package com.zikriganteng.counternumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mAuth = FirebaseAuth.getInstance();

    }

    public void Calculator(View view){
        Intent Calculator =  new Intent(getApplicationContext(), CalculatorActivity.class);
        startActivity(Calculator);
    }

    public void signOut(View view){
        mAuth.signOut();
        Toast.makeText(this, "Signed Out.",
                Toast.LENGTH_SHORT).show();
        Intent signOut = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(signOut);
    }

    @Override
    public void onBackPressed()
    {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}