package com.pixplicity.devfest.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pixplicity.mobdevcon.R;

/**
 * A fragment showcasing some custom components.
 */
public class Fonts2Fragment extends Fragment {

	public Fonts2Fragment() {}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fr_fonts_styled,
				container, false);
		return rootView;
	}
}