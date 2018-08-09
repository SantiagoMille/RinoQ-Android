package appgem.itesm.com.appgem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Quemaduras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quemaduras);

        ImageButton back = findViewById(R.id.backQuem);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToMenu();
            }
        });

        ImageButton top = findViewById(R.id.top);
        ImageButton right = findViewById(R.id.right);
        ImageButton left = findViewById(R.id.left);
        ImageButton bottom = findViewById(R.id.bottom);

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToTop();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToRight();
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToLeft();
            }
        });

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToBottom();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Quemaduras.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void switchToMenu(){
        Intent intent = new Intent(Quemaduras.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void switchToTop(){
        Intent intent = new Intent(Quemaduras.this, Details.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        String x = "{\"title\":\"Segundo grado\",\"sensacion\":\"blablaaa\",\"curacion\":\"blaaaaaa\",\"Efectos\":\"xdxdxd\"}";
        intent.putExtra("details",x);
        startActivity(intent);

    }

    public void switchToBottom(){
        Intent intent = new Intent(Quemaduras.this, Details.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        String x = "{\"title\":\"Cuarto grado\",\"sensacion\":\"blablaaa\",\"curacion\":\"blaaaaaa\",\"Efectos\":\"xdxdxd\"}";
        intent.putExtra("details",x);
        startActivity(intent);

    }

    public void switchToRight(){
        Intent intent = new Intent(Quemaduras.this, Details.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        String x = "{\"title\":\"Tercer grado\",\"sensacion\":\"blablaaa\",\"curacion\":\"blaaaaaa\",\"Efectos\":\"xdxdxd\"}";
        intent.putExtra("details",x);
        startActivity(intent);

    }

    public void switchToLeft(){
        Intent intent = new Intent(Quemaduras.this, Details.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        String x = "{\"title\":\"Primer grado\",\"sensacion\":\"blablaaa\",\"curacion\":\"blaaaaaa\",\"Efectos\":\"xdxdxd\"}";
        intent.putExtra("details",x);
        startActivity(intent);

    }
}
