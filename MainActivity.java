package com.example.jeephysics;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;




public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);





        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.home);
        }




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
                break;


            case R.id.about_us:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new AboutUsFragment()).commit();
                break;

            case R.id.terms:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TermsPolicyFragment()).commit();
                break;
            case R.id.notifications:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey check out my app e-NOTE for first year NIT Rourkela students at: https://play.google.com/store/apps/details?id=com.harsh.enote");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                break;
            case R.id.rate_us:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.harsh.enote"));
                startActivity(browserIntent);
                break;
            case R.id.feedback:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:harshgaya42@gmail.com"));
                startActivity(emailIntent);
                break;
            case R.id.ccube:
                Intent BrowserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ccubenitr.club/"));
                startActivity(BrowserIntent);
                break;
        }
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void phonesweta(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:9304136129"));
        startActivity(callIntent);
    }

    public void phoneharsh(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:9304136129"));
        startActivity(callIntent);
    }

    public void location(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/nit+rourkela/@22.2425197,84.9089783,14.94z"));
        startActivity(browserIntent);
    }

    public void mailweta(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:swetakashyappop10@gmail.com"));
        startActivity(emailIntent);
    }

    public void swetafb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sweta.kashyap.583"));
        startActivity(browserIntent);
    }

    public void swetainsta(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
        startActivity(browserIntent);
    }

    public void emailharsh(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:harshgaya42@gmail.com"));
        startActivity(emailIntent);
    }

    public void fbharsh(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
        startActivity(browserIntent);

    }

    public void harshinsta(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
        startActivity(browserIntent);
    }
}

