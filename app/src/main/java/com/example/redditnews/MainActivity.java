package com.example.redditnews;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"SetJavaScriptEnabled", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contentView = findViewById(R.id.result_text);
        Button btnGetNews = findViewById(R.id.btn_get_news);
        btnGetNews.setOnClickListener(v -> {
            contentView.setText("Loading...");
            new Thread(() -> {
                try {
                    String content = getContent();
                    contentView.post(() -> contentView.setText(content));
                } catch (IOException ex) {
                    contentView.post(() -> {
                        contentView.setText("Error: " + ex.getMessage());
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                    });
                }
            }).start();
        });
    }

    private String getContent() throws IOException {
        BufferedReader reader = null;
        InputStream stream = null;
        HttpsURLConnection connection = null;
        try {
            URL url = new URL("https://www.reddit.com/top.json");
            connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(10000);
            connection.connect();
            stream = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            return (builder.toString());
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (stream != null) {
                stream.close();
            }
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
