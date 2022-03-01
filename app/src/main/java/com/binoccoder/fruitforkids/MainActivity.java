package com.binoccoder.fruitforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button click;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mapping
        name=(EditText)findViewById(R.id.et_name);
        click=(Button)findViewById(R.id.btn_click);
        display=(TextView)findViewById(R.id.tv_name);

        click.setOnClickListener(v -> {
            String userName=name.getText().toString();
            display.setText(userName);
        });
    }
    public void clockwise(View view){
        ImageView image=(ImageView)findViewById(R.id.iv_image);
        image.setAnimation(
                AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.myanimation
                )
        );
    }
}