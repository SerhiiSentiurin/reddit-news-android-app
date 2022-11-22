package com.example.redditnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.redditnews.entityFromJson.Child;
import com.example.redditnews.entityFromJson.Root;
import com.example.redditnews.entityOutput.PublicationInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity {

    @SuppressLint({"SetJavaScriptEnabled", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonMapper jsonMapper = new JsonMapper(objectMapper);

        Button btnGetNews = findViewById(R.id.btn_get_news);
        RecyclerView recyclerView = findViewById(R.id.list);

        btnGetNews.setOnClickListener(v -> {
            Toast.makeText(this, "Loading...", Toast.LENGTH_LONG).show();

            new Thread(() -> {
                List<PublicationInfo> pubsList = createPublication(jsonMapper);
                PublicationAdapter publicationAdapter = new PublicationAdapter(this, pubsList);
                this.runOnUiThread(() -> recyclerView.setAdapter(publicationAdapter));
            }).start();
        });
    }


    private List<PublicationInfo> createPublication(JsonMapper jsonMapper) {
        Root root = jsonMapper.mapJsonToObj(Root.class);
        ArrayList<Child> publicationsList = root.getAllData().getChildren();
        List<PublicationInfo> publicationsOutputList = new ArrayList<>();

        for (Child publication : publicationsList) {
            PublicationInfo publicationInfo = new PublicationInfo();
            long created_utc = publication.getChildData().getCreated_utc();
            String hours = String.valueOf(TimeUnit.MILLISECONDS.toHours(created_utc));
            String createdHoursAgo = "created ".concat(hours).concat(" hours ago.");
            publicationInfo.setAuthorName("author: ".concat(publication.getChildData().getAuthor()));
            publicationInfo.setNumberOfComments(publication.getChildData().getNum_comments().concat(" comments"));
            publicationInfo.setCreatedMillis(createdHoursAgo);
            publicationInfo.setSourceHref(publication.getChildData().getThumbnail());
            publicationsOutputList.add(publicationInfo);
        }
        return publicationsOutputList;
    }


}


//
//    @SuppressLint({"SetJavaScriptEnabled", "SetTextI18n"})
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        TextView contentView = findViewById(R.id.result_text);
//        Button btnGetNews = findViewById(R.id.btn_get_news);
//        btnGetNews.setOnClickListener(v -> {
//            contentView.setText("Loading...");
//            new Thread(() -> {
//                try {
//                    String content = getContent();
//                    contentView.post(() -> contentView.setText(content));
//                } catch (IOException ex) {
//                    contentView.post(() -> {
//                        contentView.setText("Error: " + ex.getMessage());
//                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
//                    });
//                }
//            }).start();
//        });
//    }
//
//    private String getContent() throws IOException {
//        BufferedReader reader = null;
//        InputStream stream = null;
//        HttpsURLConnection connection = null;
//        try {
//            URL url = new URL("https://www.reddit.com/top.json");
//            connection = (HttpsURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//            connection.setReadTimeout(10000);
//            connection.connect();
//            stream = connection.getInputStream();
//            reader = new BufferedReader(new InputStreamReader(stream));
//            StringBuilder builder = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                builder.append(line).append("\n");
//            }
//            return (builder.toString());
//        } finally {
//            if (reader != null) {
//                reader.close();
//            }
//            if (stream != null) {
//                stream.close();
//            }
//            if (connection != null) {
//                connection.disconnect();
//            }
//        }
//    }
