package com.example.cosain.maps;

import android.content.Intent;
import android.gesture.GestureLibrary;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class Gesture extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {
    private GestureLibrary gestureLib;

    TextView output_text;
    private GestureDetectorCompat DetectMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);
        output_text = (TextView) findViewById(R.id.outputText);
        DetectMe = new GestureDetectorCompat(this,this);
        DetectMe.setOnDoubleTapListener(this);

    }

//    @Override
//    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
//        Toast.makeText(getApplicationContext(),"Single Tap",Toast.LENGTH_LONG).show();
//        return true;
//    }
//
//    @Override
//    public boolean onDoubleTap(MotionEvent motionEvent) {
//        Toast.makeText(getApplicationContext(),"double tap",Toast.LENGTH_LONG).show();
//        return true;
//    }
//
//    @Override
//    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
//        Toast.makeText(getApplicationContext(),"double Tap event",Toast.LENGTH_LONG).show();
//        return true;
//    }
//
//    @Override
//    public boolean onDown(MotionEvent motionEvent) {
//        Toast.makeText(getApplicationContext(),"down",Toast.LENGTH_LONG).show();
//        return true;
//    }
//
//    @Override
//    public void onShowPress(MotionEvent motionEvent) {
//
//    }
//
//    @Override
//    public boolean onSingleTapUp(MotionEvent motionEvent) {
//        Toast.makeText(getApplicationContext(),"Single Tap up",Toast.LENGTH_LONG).show();
//        return true;
//    }
//
//    @Override
//    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
//        Toast.makeText(getApplicationContext(),"on scroll",Toast.LENGTH_LONG).show();
//        return true;
//    }
//
//    @Override
//    public void onLongPress(MotionEvent motionEvent) {
//        Toast.makeText(getApplicationContext(),"long press",Toast.LENGTH_LONG).show();
//
//    }
//
//    @Override
//    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
//        Toast.makeText(getApplicationContext(),"on fling",Toast.LENGTH_LONG).show();
//        return true;
//    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        output_text.setText("onSingleTapConfirmed");
        Intent intent = new Intent(this, AlarmActivity.class);
        startActivity(intent);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Intent intent = new Intent(this, Speech.class);
        startActivity(intent);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
       output_text.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        output_text.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        output_text.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        output_text.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        output_text.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        output_text.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Intent intent = new Intent(this, Speech.class);
        startActivity(intent);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.DetectMe.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

// Following functions are overrided to show text when a particular method called.


}


