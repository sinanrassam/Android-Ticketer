package com.example.ticketer.Tasks;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class RegisterTask extends AsyncTask<String, Void, Void> {
    public static final String API_URL = "http://localhost:8080/TicketerRestfulService/api";

    @SuppressLint("StaticFieldLeak")
    private Context mContext;

    public RegisterTask(Context context) {
        this.mContext = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected Void doInBackground(String... parameters) {
        try {
            String postData = URLEncoder.encode("firstName", "UTF-8") + "=" + URLEncoder.encode(parameters[0], "UTF-8") + "&";
            postData += URLEncoder.encode("lastName", "UTF-8") + "=" + URLEncoder.encode(parameters[1], "UTF-8") + "&";
            postData += URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(parameters[2], "UTF-8") + "&";
            postData += URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(parameters[3], "UTF-8") + "&";
            postData += URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(parameters[4], "UTF-8");

            URL url = new URL(API_URL + "/users/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            // Send the request to the server
            OutputStream outputStream = conn.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            bufferedWriter.write(postData);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    protected void onPostExecute(Void param) {
        Toast.makeText(mContext, "Process done!", Toast.LENGTH_SHORT).show();
    }
}