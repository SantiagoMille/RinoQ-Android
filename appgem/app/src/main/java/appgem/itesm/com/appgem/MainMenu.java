package appgem.itesm.com.appgem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import appgem.itesm.com.appgem.Ind_Class.MenuOption;
import appgem.itesm.com.appgem.adapters.MenuOptionsAdapter;

public class MainMenu extends AppCompatActivity implements MenuOptionsAdapter.ListItemClickListener{

    private RecyclerView options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        options = findViewById(R.id.recyclerView2);
        options.setItemAnimator(new DefaultItemAnimator());
        GridLayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        options.setHasFixedSize(true);
        options.setLayoutManager(mLayoutManager);
        ArrayList<MenuOption> optiones = new ArrayList<>();
        optiones.add(new MenuOption("Tipos de quemaduras","file:///android_asset/logo_igem2.png"));
        optiones.add(new MenuOption("Tipos de quemaduras","file:///android_asset/logo_igem2.png"));
        optiones.add(new MenuOption("Me quemé (¿Que hacer?)","file:///android_asset/logo_igem2.png"));

        MenuOptionsAdapter adapter = new MenuOptionsAdapter(this);

        options.setAdapter(adapter);

        adapter.setData(getBaseContext(),optiones);
    }

    @Override
    public void onListItemClick(String clickedItemIndex) {
        int position = Integer.parseInt(clickedItemIndex);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        Log.d("HHHHHH", String.valueOf(hasCapture));
    }
}
