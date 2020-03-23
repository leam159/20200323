package kr.co.tjoeun.a20200323;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.renderscript.ScriptGroup;

import kr.co.tjoeun.a20200323.databinding.ActivityMainBinding;

public class MainActivity extends BasActivity {
ActivityMainBinding binding =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
   setEvents();
   setValus();
    }

    @Override
    public void setEvents() {

    }

    @Override
    public void setValus() {

    }
}
