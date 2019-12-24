package firnanda.uangconvert.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import firnanda.uangconvert.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAbout extends Fragment {

    private static final String ARG_NAME = "name";
    private String name;

    public FragmentAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.Fragment_About, container, false);
        TextView nameText = view.findViewById(R.id.name_text);
        nameText.setText(name);
        return view;
    }
    public static FragmentAbout newInstance(String name) {
        FragmentAbout fragment = new FragmentAbout();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        fragment.setArguments(args);
        return fragment;
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_NAME);
        }
    }

}
