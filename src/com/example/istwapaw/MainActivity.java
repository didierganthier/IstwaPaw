package com.example.istwapaw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
TextView StoryText;
Button Choice1;
Button Choice2;
int storyIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StoryText = (TextView) findViewById(R.id.storyTextView);
        Choice1 = (Button)findViewById(R.id.buttonTop);
        Choice2 = (Button)findViewById(R.id.buttonBottom);
        
        Choice1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(storyIndex==1){
				StoryText.setText(R.string.T3_Story);
				Choice1.setText(R.string.T3_Ans1);
				Choice2.setText(R.string.T3_Ans2);
				storyIndex=3;
				}else if(storyIndex==3){
					StoryText.setText(R.string.T6_End);
					Choice1.setVisibility(View.GONE);
					Choice2.setVisibility(View.GONE);
				}else{
					StoryText.setText(R.string.T3_Story);
					Choice1.setText(R.string.T3_Ans1);
					Choice2.setText(R.string.T3_Ans2);
					storyIndex=3;
				}
			}
        });
        
        Choice2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(storyIndex==1){
					StoryText.setText(R.string.T2_Story);
				Choice1.setText(R.string.T2_Ans1);
				Choice2.setText(R.string.T2_Ans2);
				storyIndex=2;
				}
				else if(storyIndex==2){
					StoryText.setText(R.string.T4_End);
					Choice1.setVisibility(View.GONE);
					Choice2.setVisibility(View.GONE);
				}else{
					StoryText.setText(R.string.T5_End);
					Choice1.setVisibility(View.GONE);
					Choice2.setVisibility(View.GONE);
				}
			}
		});
    }
}
