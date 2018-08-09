package appgem.itesm.com.appgem.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import appgem.itesm.com.appgem.Ind_Class.MenuOption;
import appgem.itesm.com.appgem.R;

/**
 * Created by santi on 6/28/2018.
 */

public class MenuOptionsAdapter extends RecyclerView.Adapter<MenuOptionsAdapter.OptionsViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<MenuOption> mDataSource;
    private ListItemClickListener mClickListener;


    public MenuOptionsAdapter(ListItemClickListener listener) {
        mClickListener = listener;
    }

    public void setData(Context context, ArrayList<MenuOption> data){
        mDataSource = data;
        mContext = context;
        notifyDataSetChanged();
    }

    @Override
    public OptionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.options_menu_item;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, parent, false);
        OptionsViewHolder viewHolder = new OptionsViewHolder(view);

        return viewHolder;
    }

    public void onBindViewHolder(OptionsViewHolder holder, int position) {
        Picasso.get().load(mDataSource.get(position).getIcono()).into(holder.logo);
        holder.nombre.setText(mDataSource.get(position).getTexto());
    }

    public interface ListItemClickListener {
        void onListItemClick(String clickedItemIndex);
    }

    public class OptionsViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{

        public ImageView logo;
        public TextView nombre;

        public OptionsViewHolder(View view){
            super(view);
            logo = (ImageView) view.findViewById(R.id.image_option);
            nombre = (TextView) view.findViewById(R.id.text_option);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int clickedPos = getAdapterPosition();
            mClickListener.onListItemClick(clickedPos+"");
        }
    }

    //3
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        if(mDataSource==null){
            return 0;
        }else{
            return mDataSource.size();
        }
    }
}
