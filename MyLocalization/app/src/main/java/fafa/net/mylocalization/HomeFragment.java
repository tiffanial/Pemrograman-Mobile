package fafa.net.mylocalization;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_home,null);

        TextView tvGoal = root.findViewById(R.id.tv_goal);
        TextView tvPlural = root.findViewById(R.id.tv_plural);
        TextView tvXliff = root.findViewById(R.id.tv_xliff);

        int goal1 = 2;
        int goal2 = 0;

        String football = String.format(getResources().getString(R.string.goal), "Lilypali", "Irfan Bachdim", goal1, goal2);
        tvGoal.setText(football);

        int songCount = 5;
        String pluralText = getResources().getQuantityString(R.plurals.numberOfSongsAvailable, songCount, songCount);
        tvPlural.setText(pluralText);

        tvXliff.setText(getResources().getString(R.string.app_homeurl));

        return root;
    }
}
