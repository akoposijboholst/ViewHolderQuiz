package sidespell.tech.viewholderquiz.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import sidespell.tech.viewholderquiz.R;
import sidespell.tech.viewholderquiz.model.ListViewModel;

/**
 * Created by JustineYrvin on 1/14/2016.
 */
public class ListViewAdapter extends ArrayAdapter<ListViewModel>{

    Context context;
    int layoutResourceId;
    ArrayList<ListViewModel> objects;

    public ListViewAdapter(Context context, int resource, ArrayList<ListViewModel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutResourceId = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layoutResourceId, parent, false);
            viewHolder = new ViewHolder();
            convertView.setTag(viewHolder);

            viewHolder.title = (TextView)convertView.findViewById(R.id.movie_title);
            viewHolder.genre = (TextView)convertView.findViewById(R.id.movie_genre);
            viewHolder.poster = (ImageView)convertView.findViewById(R.id.movie_picture);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ListViewModel model = objects.get(position);
        viewHolder.title.setText(model.getTitle());
        viewHolder.genre.setText(model.getGenre());
        viewHolder.poster.setImageResource(model.getPoster());

        return convertView;
    }

    public static class ViewHolder{
        public ImageView poster;
        public  TextView title;
        public TextView genre;
    }
}

