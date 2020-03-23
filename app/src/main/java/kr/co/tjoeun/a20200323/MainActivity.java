package kr.co.tjoeun.a20200323;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import kr.co.tjoeun.a20200323.Utils.ContextUtil;
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
//체크박스에 체크가 될때(변화가 있을때마다 체크여부저장)
        binding.idCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //Contextutil이용해서 체크여부를 저장
ContextUtil.setIdCheck(mContext,isChecked);

            }
        });

//로그인 버튼을 누르면=>입력되어있는 이메일을 저장하려고함
        //=>입력되어있는 이메일저장

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //체크박스에 체크가 되어있나?
                if (binding.idCheckBox.isChecked()){
                    //체크가 되어있는 상황
                    String inputEmail = binding.emailEdt.getText().toString();
                    ContextUtil.setEmail(mContext,inputEmail);
                }
               else {
                   //체크가 안된 상황
                    ContextUtil.setEmail(mContext,"");
                }

            }
        });
    }

    @Override
    public void setValus() {
    //앱을 키면,저장된 이메일값을 loginEdt에 입력.
        binding.emailEdt.setText(ContextUtil.getEmail(mContext));
        binding.idCheckBox.setChecked(ContextUtil.isIdCheck(mContext));
    }
}
