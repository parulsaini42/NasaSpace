package com.example.parul.mapwithfloat;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView acv;
    String S,query;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        //autoCompleteTextView
        int layoutItemId = android.R.layout.simple_dropdown_item_1line;
        String[] placeArr = getResources().getStringArray(R.array.items);
        List<String> placeList = Arrays.asList(placeArr);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, layoutItemId, placeList);

        AutoCompleteTextView acv = (AutoCompleteTextView) findViewById(R.id.autoCompleteView);
        acv.setAdapter(adapter);
        acv.setThreshold(1);

        acv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                S=parent.getItemAtPosition(position).toString();
                if(S.equals("India"))
                {   //query= "www.imd.gov.in/";
                    //Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                            //Uri.parse(query));
                   // startActivity(intent);
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.imd.gov.in/"));
                    startActivity(browserIntent);
                }
                else if (S.equals("Belgium"))
                {

                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.meteo.be/meteo/view/en/65239-Home.html"));
                    startActivity(browserIntent);
                }
                else if (S.equals("Australia"))
                {

                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bom.gov.au/"));
                    startActivity(browserIntent);
                }
                else if (S.equals("Austria"))
                {

                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zamg.ac.at/cms/en/weather\n"));
                    startActivity(browserIntent);
                }
            }

        });
    }

    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter(MainActivity.this,XMENArray));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);

            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 6000);

        final Button button = (Button) findViewById(R.id.tsunami);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent t =  new Intent(MainActivity.this,Tsunami.class);
                startActivity(t);
            }
        });
        final Button button1 = (Button) findViewById(R.id.cyclone);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent c =  new Intent(MainActivity.this,Cyclones.class);
                startActivity(c);
            }
        });
        final Button button2 = (Button) findViewById(R.id.dust);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent d =  new Intent(MainActivity.this,Dust.class);
                startActivity(d);
            }
        });

        final Button button3 = (Button) findViewById(R.id.earth);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent e =  new Intent(MainActivity.this,Earthquake.class);
                startActivity(e);
            }
        });
        final Button button4 = (Button) findViewById(R.id.floods);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                Intent f=  new Intent(MainActivity.this,Floods.class);
                startActivity(f);
            }
        });

        final Button button5 = (Button) findViewById(R.id.news_floods);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                query="floods news";
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query); // query contains search string
                startActivity(intent);
            }
        });
        final Button button6 = (Button) findViewById(R.id.news_cyclone);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                query="cyclone news";
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query); // query contains search string
                startActivity(intent);
            }
        });
        final Button button7 = (Button) findViewById(R.id.news_tsunami);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                query="tsunami news";
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query); // query contains search string
                startActivity(intent);

            }
        });
        final Button button8 = (Button) findViewById(R.id.news_dust);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                query="dust storm news";
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query); // query contains search string
                startActivity(intent);

            }
        });
        final Button button9 = (Button) findViewById(R.id.news_earth);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                query="earthquake news";
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query); // query contains search string
                startActivity(intent);

            }
        });
    }
public void maps(View v)
{
    Intent intentToMaps =  new Intent(this,MapsActivity.class);
    startActivity(intentToMaps);
}
public void help(View v)
    {
        Intent helpcall =  new Intent(this,Helpline.class);
        startActivity(helpcall);
    }
    public void sos(View v)
    {
        Intent intent =  new Intent(this,sos.class);
        startActivity(intent);
    }
    public void plan(View v)
    {
        Intent intent =  new Intent(this,list.class);
        startActivity(intent);
    }


}
