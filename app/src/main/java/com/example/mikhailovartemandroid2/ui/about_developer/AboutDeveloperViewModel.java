package com.example.mikhailovartemandroid2.ui.about_developer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutDeveloperViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AboutDeveloperViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("это фрагмент о разработчике");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
