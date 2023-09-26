package com.ualr.firstapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.firstapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = mBinding.getRoot();
        setContentView(rootView);
    }

    public void showTextMessage(View view) {
        if(!mBinding.userInputET.getText().toString().matches("")) {
            mBinding.userMsgTV.setText(mBinding.userInputET.getText().toString());
        }
    }

    // TODO 07. Create a new method called cleanTextField to delete the text inside the text field
    public void cleanTextField(View view) {
        mBinding.userInputET.setText("");
    }
}
