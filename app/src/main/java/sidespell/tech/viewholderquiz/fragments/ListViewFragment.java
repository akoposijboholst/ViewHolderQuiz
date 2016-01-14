package sidespell.tech.viewholderquiz.fragments;

import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import sidespell.tech.viewholderquiz.R;
import sidespell.tech.viewholderquiz.adapter.ListViewAdapter;
import sidespell.tech.viewholderquiz.model.ListViewModel;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {

    private TypedArray images;
    private String[] titles;
    private String[] genre;
    ArrayList<ListViewModel> movies;

    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_listview, container, false);

        images = getResources().obtainTypedArray(R.array.movies_pictures);
        titles = getResources().getStringArray(R.array.movie_titles);
        genre = getResources().getStringArray(R.array.movie_genres);

        movies = new ArrayList<>();
        for(int x = 0; x < titles.length; x++){
            movies.add(new ListViewModel(titles[x], genre[x], images.getResourceId(x, -1)));
        }
        ListViewAdapter adapter = new ListViewAdapter(view.getContext(), this.getId(), movies);

        ListView listView = new ListView(view.getContext());
        listView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    }
}
