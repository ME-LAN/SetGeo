package com.product.blackdogs.setgeo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.product.blackdogs.setgeo.R;

/**
 * Created by Milan Marwadi on 21-08-2016.
 */
public class NearbyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.nearby_activity,container,false);


        return rootView;
    }
}
