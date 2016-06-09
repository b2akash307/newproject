package com.example.malli.tabs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * Created by malli on 6/9/2016.
 */
public class Test extends Activity {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);

        final TabHost tabs=(TabHost)findViewById(R.id.tabhost);

        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("buttontab");
        spec.setContent(R.id.text);
        spec.setIndicator("Tab");
        tabs.addTab(spec);

       // Button btn=(Button)tabs.getCurrentView().findViewById(R.id.buttontab);

       // btn.setOnClickListener(new View.OnClickListener() {
          //  public void onClick(View view) {

         for(int i =0 ; i < 5 ; i++) {
             spec = tabs.newTabSpec("tag1");

             spec.setContent(new TabHost.TabContentFactory() {
                 public View createTabContent(String tag) {
                     //return (new AnalogClock(Test.this));
                     return (new TextView(Test.this));
                 }
             });
             spec.setIndicator("Tab");
             spec.setContent(R.id.text);
             tabs.addTab(spec);
         }
         //   }
        //});
    }
}