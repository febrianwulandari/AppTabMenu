package com.febrianwulandari.mytapapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import static androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class MainActivity extends AppCompatActivity {

    private TabLayout tlayout;
    private ViewPager vpager;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_opsi,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Toast.makeText(this,"About",Toast.LENGTH_LONG).show();
                break;
            case R.id.settings:
                Toast.makeText(this,"Settings",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tlayout = findViewById(R.id.tablayout);
        vpager = findViewById(R.id.viewpager);
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpager.setAdapter(adapter);
        tlayout.setupWithViewPager(vpager);

    }
}
