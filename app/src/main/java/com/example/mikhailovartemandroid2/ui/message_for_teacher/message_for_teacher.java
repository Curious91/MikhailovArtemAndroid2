package com.example.mikhailovartemandroid2.ui.message_for_teacher;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mikhailovartemandroid2.R;

public class message_for_teacher extends Fragment {

    private MessageForTeacherViewModel mViewModel;

    public static message_for_teacher newInstance() {
        return new message_for_teacher();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.message_for_teacher_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MessageForTeacherViewModel.class);
        // TODO: Use the ViewModel
    }

}
