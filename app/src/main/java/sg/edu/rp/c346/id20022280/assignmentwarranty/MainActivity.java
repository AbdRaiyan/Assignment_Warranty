package sg.edu.rp.c346.id20022280.assignmentwarranty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btLink,btList;
    TextView tvTitle,tvDesc,tvLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLink = findViewById(R.id.buttonWebsite);
        btList = findViewById(R.id.buttonAccess);
        tvTitle = findViewById(R.id.textViewTitle);
        tvDesc = findViewById(R.id.textViewDesc);
        tvLink = findViewById(R.id.textViewCredit);

        btList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ItemListActivity.class);
                startActivity(intent);
            }
        });

        tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ItemListActivity.class);
                startActivity(intent);
            }
        });

        tvDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ItemListActivity.class);
                startActivity(intent);
            }
        });

        btLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLink = new Intent(Intent.ACTION_VIEW, Uri.parse("github.com/AbdRaiyan"));
                startActivity(intentLink);
            }
        });

        tvLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLink = new Intent(Intent.ACTION_VIEW, Uri.parse("github.com/AbdRaiyan"));
                startActivity(intentLink);
            }
        });

    }
}