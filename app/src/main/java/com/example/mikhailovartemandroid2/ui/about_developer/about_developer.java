package com.example.mikhailovartemandroid2.ui.about_developer;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mikhailovartemandroid2.R;

public class about_developer extends Fragment {

    private AboutDeveloperViewModel aboutDeveloperViewModelViewModel;

    public static about_developer newInstance() {
        return new about_developer();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.about_developer_fragment, container, false);
        aboutDeveloperViewModelViewModel = ViewModelProviders.of(this).get(AboutDeveloperViewModel.class);
        View root = inflater.inflate(R.layout.about_developer_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        aboutDeveloperViewModelViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = ViewModelProviders.of(this).get(AboutDeveloperViewModel.class);
//        // TODO: Use the ViewModel
//    }

}
