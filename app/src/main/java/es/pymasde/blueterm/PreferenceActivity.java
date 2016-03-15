package es.pymasde.blueterm;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import java.util.List;

/**
 * Created by brettrosen on 3/14/16.
 */
public class PreferenceActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    /**
     * Populate the activity with the top-level headers.
     */
    @Override
    public void onBuildHeaders(List<android.preference.PreferenceActivity.Header> target) {
    }

    public static class PreferenceFragment extends PreferenceFragment
    {
        @Override
        public void onCreate(final Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);


            addPreferencesFromResource(R.xml.preferences);
        }
    }


}
