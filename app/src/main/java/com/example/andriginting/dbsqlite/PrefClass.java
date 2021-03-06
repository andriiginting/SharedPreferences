package com.example.andriginting.dbsqlite;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Andri Ginting on 11/26/2017.
 */

public class PrefClass {
    private String KEY_NAME = "name";
    private String KEY_EMAIL = "email";
    private String KEY_LOVE_MU = "love_mu";
    private String KEY_PHONE_NUMBER = "phone_number";
    private String KEY_AGE = "age";

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public PrefClass(Context context){
        String PREFS_NAME = "UserPref";
        preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void setName(String name){
        editor = preferences.edit();
        editor.putString(KEY_NAME, name);
        editor.apply();
    }

    public String getName(){
        return preferences.getString(KEY_NAME, null);
    }

    void setEmail(String email){
        editor = preferences.edit();
        editor.putString(KEY_EMAIL, email);
        editor.apply();
    }

    String getEmail(){
        return preferences.getString(KEY_EMAIL, null);
    }

    void setLoveMU(boolean status){
        editor = preferences.edit();
        editor.putBoolean(KEY_LOVE_MU, status);
        editor.apply();
    }

    boolean isLoveMU(){
        return preferences.getBoolean(KEY_LOVE_MU, false);
    }

    void setPhoneNumber(String phoneNumber){
        editor = preferences.edit();
        editor.putString(KEY_PHONE_NUMBER, phoneNumber);
        editor.apply();
    }

    String getPhoneNumber(){
        return preferences.getString(KEY_PHONE_NUMBER, null);
    }

    void setAge(int age){
        editor = preferences.edit();
        editor.putInt(KEY_AGE, age);
        editor.apply();
    }

    int getAge(){
        return preferences.getInt(KEY_AGE, 0);
    }
}
