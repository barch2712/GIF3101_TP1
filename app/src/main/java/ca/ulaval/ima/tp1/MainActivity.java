package ca.ulaval.ima.tp1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String lastName = "Barnard";
        String firstName = "Christian";
        Calendar calendar = Calendar.getInstance();
        calendar.set(1994, Calendar.DECEMBER, 27, 0, 0, 0);
        Date birthDate = calendar.getTime();
        String idul = "chbar109";

        TextView myFullName = findViewById(R.id.myFullName);
        myFullName.setText(String.format("%s %s", firstName, lastName));
        myFullName.setTextSize(32);
        final Profil profil = new Profil(lastName, firstName, birthDate, idul);
        final String UrlToLoad = "https://www.youtube.com/watch?v=TltXDGAIUjw";

        Button siteWebExtButton = findViewById(R.id.siteWebExt);
        siteWebExtButton.setText(getString(R.string.siteWebExtButtonText));
        siteWebExtButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(UrlToLoad));
                startActivity(browserIntent);
            }
        });

        Button monProfileWVButton = findViewById(R.id.monProfileWV);
        monProfileWVButton.setText(getString(R.string.siteWebWvButtonText));
        monProfileWVButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MonProfilWv.class);
                intent.putExtra("UrlToLoad", UrlToLoad);
                startActivity(intent);
            }
        });

        Button uLavalButton = findViewById(R.id.uLaval);
        uLavalButton.setText(getString(R.string.uLavalButtonText));
        uLavalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ULavalActivity.class);
                startActivity(intent);
            }
        });

        Button monProfileButton = findViewById(R.id.monProfile);
        monProfileButton.setText(getString(R.string.monProfilButtonText));
        monProfileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MonProfil.class);
                intent.putExtra("profil", profil);
                startActivity(intent);
            }
        });
    }
}
