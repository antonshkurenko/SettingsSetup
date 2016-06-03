package io.github.tonyshkurenko.settingssetup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SimpleSettingsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SimpleSettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleSettingsFragment extends PreferenceFragment {

  private OnFragmentInteractionListener mListener;

  public static SimpleSettingsFragment newInstance() {
    final SimpleSettingsFragment fragment = new SimpleSettingsFragment();
    final Bundle args = new Bundle();

    fragment.setArguments(args);
    return fragment;
  }

  public SimpleSettingsFragment() {
    // Required empty public constructor
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_global);
    setHasOptionsMenu(true);

    if (getArguments() != null) {

    }
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {

    switch (item.getItemId()) {
      case android.R.id.home:
        getActivity().finish();
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }

  @Override public void onAttach(Context context) {
    super.onAttach(context);
    if (context instanceof OnFragmentInteractionListener) {
      mListener = (OnFragmentInteractionListener) context;
    } else {
      throw new RuntimeException(
          context.toString() + " must implement OnFragmentInteractionListener");
    }
  }

  @Override public void onDetach() {
    super.onDetach();
    mListener = null;
  }

  public interface OnFragmentInteractionListener {

  }
}
