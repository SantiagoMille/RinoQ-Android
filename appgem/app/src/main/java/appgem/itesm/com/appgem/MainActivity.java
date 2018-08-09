package appgem.itesm.com.appgem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton quemadura = findViewById(R.id.Quemaduras);

        ImageButton prevencion = findViewById(R.id.prevencion);

        Button conocemas = findViewById(R.id.conocemas);

        ImageButton emergencia = findViewById(R.id.emergencia);

        quemadura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToQuemaduras();
            }
        });

        prevencion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToPrevencion();
            }
        });

        conocemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToRinoInfo();
            }
        });

        emergencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToEmergencia();
            }
        });

    }

    private void switchToEmergencia() {
        Intent intent = new Intent(MainActivity.this, Emergencia.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    private void switchToRinoInfo() {
        Intent intent = new Intent(MainActivity.this, RinoInfo.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void switchToQuemaduras(){
        Intent intent = new Intent(MainActivity.this, Quemaduras.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void switchToPrevencion(){
        Intent intent = new Intent(MainActivity.this, Prevencion.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }
}
