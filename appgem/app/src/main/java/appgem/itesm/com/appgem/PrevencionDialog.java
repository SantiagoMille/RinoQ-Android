package appgem.itesm.com.appgem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PrevencionDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevencion_dialog);

        Intent intent = getIntent();
        String kk = intent.getStringExtra("titulo");

        TextView titulo = findViewById(R.id.titulooo);
        titulo.setText(kk);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(PrevencionDialog.this, Prevencion.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
