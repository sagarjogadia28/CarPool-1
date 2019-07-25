package com.example.carpool.fragmentScreens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carpool.R;

public class RidesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rides, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_rides_list);
        //RecyclerView.Adapter adapter = new RidesAdapter();
        //recyclerView.setAdapter(adapter);
        return view;
    }
}
