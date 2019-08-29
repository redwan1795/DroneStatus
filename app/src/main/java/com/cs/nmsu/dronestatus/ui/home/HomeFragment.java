package com.cs.nmsu.dronestatus.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.cs.nmsu.dronestatus.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        final TextView textStatus = root.findViewById(R.id.Status_Text);
        homeViewModel.getTextStatus().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textStatus.setText(s);
            }
        });

        final TextView textAction = root.findViewById(R.id.Action_Text);
        homeViewModel.getTextAction().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textAction.setText(s);
            }
        });

        final TextView textBattery = root.findViewById(R.id.Battery_Text);
        homeViewModel.getTextBattery().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textBattery.setText(s);
            }
        });
        return root;
    }
}