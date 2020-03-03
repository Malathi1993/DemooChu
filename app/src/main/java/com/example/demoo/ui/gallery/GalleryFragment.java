package com.example.demoo.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.demoo.R;

public class GalleryFragment extends Fragment {
    ImageView Image;

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final ImageView imageView = root.findViewById(R.id.image_gallery);
        galleryViewModel.getImage().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                ImageView.setImage(s);
            }
        });
        return root;
    }
}