package com.example.demoo.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mImage;

    public GalleryViewModel() {
        mImage = new MutableLiveData<>();
        mImage.setValue("This is gallery fragment");
    }

    public LiveData<String> getImage() {
        return mImage;
    }
}