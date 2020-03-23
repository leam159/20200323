package kr.co.tjoeun.a20200323;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BasActivity extends AppCompatActivity {
    Context mContext = this;
    public  abstract void setEvents();
    public  abstract void setValus();

}
