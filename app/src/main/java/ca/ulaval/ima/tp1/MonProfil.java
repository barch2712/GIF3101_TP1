package ca.ulaval.ima.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class MonProfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_profil);

        Intent intent = getIntent();
        Profil profil = intent.getParcelableExtra("profil");
        String firstName = profil.getFirstName();
        String lastName = profil.getLastName();
        Date birthDate = profil.getDate();
        String idul = profil.getIdul();

        TextView firstNameTextView = findViewById(R.id.firstName);
        firstNameTextView.setText(String.format("Prénom : %s", firstName));

        TextView lastNameTextView = findViewById(R.id.lastName);
        lastNameTextView.setText(String.format("Nom : %s", lastName));

        TextView birthDateTextView = findViewById(R.id.birthDate);
        birthDateTextView.setText(String.format("Date de naissance : %s", birthDate));

        TextView idulTextView = findViewById(R.id.idul);
        idulTextView.setText(String.format("IDUL : %s", idul));
    }
}
