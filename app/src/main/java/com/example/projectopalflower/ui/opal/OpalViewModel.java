package com.example.projectopalflower.ui.opal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OpalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OpalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is opal fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}