package io.github.tonyshkurenko.settingssetup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class SimpleSettingsActivity extends AppCompatActivity
    implements SimpleSettingsFragment.OnFragmentInteractionListener {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple_settings);

    final Toolbar toolbar = ((Toolbar) findViewById(R.id.toolbar));

    setSupportActionBar(toolbar);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true); // show arrow

    //getSupportActionBar().setDisplayShowHomeEnabled(true); // show logo
    //getSupportActionBar().setIcon(R.mipmap.ic_launcher); // show logo

    if (savedInstanceState == null) {
      getFragmentManager().beginTransaction()
          .add(R.id.content, SimpleSettingsFragment.newInstance())
          .commit();
    }
  }
}
