package ca.ulaval.ima.tp1;

import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ULavalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulaval);

        getWindow().getDecorView().setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.uLaval, null));

        Button closeButton = findViewById(R.id.fermer);
        closeButton.setText(getString(R.string.closeButton));
        closeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
