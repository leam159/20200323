package kr.co.tjoeun.a20200323.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtil {
    //메모장 처럼 데이터를 저장할 공간의 이름으로 쓸변수
    private static final String prefName ="myPref";
    //항목명도 자동완성으로 지원할 수 있도록 미리 변수화
    private static final String EMAIL ="EMAIL";

    //해당항목을 값을 저장(stter)/조회(getter)하는 메서드 2개생성
    //setter
    public static void setEmail(Context context, String email){
        //메모장을 이용해서 값을 기록=>메모장파일 열기기
//메모장은context를 이용해서 열어야한다=>context변수 파라미터로 필요함
        //메모장을 열때 1)어떤메모장? 2)어떤모드?-Context.mode_privaie
        SharedPreferences pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE);
        //열린 메모장에 항목(hey)/값저정(value)저장
        pref.edit().putString(EMAIL,email).apply();

   }

}
