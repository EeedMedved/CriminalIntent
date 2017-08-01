package com.example.medvedev.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by medvedev on 28.07.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
