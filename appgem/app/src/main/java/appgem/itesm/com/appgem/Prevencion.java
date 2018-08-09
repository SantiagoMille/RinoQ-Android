package appgem.itesm.com.appgem;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Prevencion extends AppCompatActivity {

    private AlertDialog ad;
    private Context mCont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevencion);
        mCont = this;

        Button escondido = findViewById(R.id.invisible);

        escondido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mCont);
                builder.setMessage("AIUDAAAAAA")
                        .setTitle("Oh rayos");

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Prevencion.this, PrevencionDialog.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        intent.putExtra("titulo","Prevención");
                        startActivity(intent);
                    }
                });

                ad = builder.create();

                ad.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Prevencion.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
