package com.mohamedhassan.souqcom.Activites.MenuItemFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.mohamedhassan.souqcom.R;

public class HomeAnd_KitchenFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home_and_kitchen, container, false);

        return root;
    }
}
