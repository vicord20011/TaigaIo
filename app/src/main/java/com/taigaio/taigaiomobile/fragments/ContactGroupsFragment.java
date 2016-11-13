package com.taigaio.taigaiomobile.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.taigaio.taigaiomobile.R;

/**
 * Created by z003as0n on 21.09.2016.
 */
public class ContactGroupsFragment extends Fragment {
    View view;
    TextView contactTextView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.contact_groups, container, false);
        contactTextView = (TextView) view.findViewById(R.id.contactTextView);
        return view;
    }
}
