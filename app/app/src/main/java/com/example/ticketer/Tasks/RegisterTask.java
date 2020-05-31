package com.example.ticketer.Tasks;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Xml;

public class RegisterTask extends AsyncTask<String, Void, Xml> {
    @SuppressLint("StaticFieldLeak")
    private Context mContext;

    public RegisterTask(Context context) {
        this.mContext = context;
    }

    @Override
    protected Xml doInBackground(String... parameters) {
    }

    @Override
    protected void onPostExecute(Xml data) {

    }
}