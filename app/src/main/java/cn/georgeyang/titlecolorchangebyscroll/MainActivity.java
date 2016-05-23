package cn.georgeyang.titlecolorchangebyscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.georgeyang.widget.ScrollChangeScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        ScrollChangeScrollView scrollView = (ScrollChangeScrollView) findViewById(R.id.scrollView);
        scrollView.setShouldSlowlyChange(true);
        scrollView.setupTitleView(findViewById(R.id.tv_title));
        scrollView.setupByWhichView(findViewById(R.id.img));//如果这个view屏幕超过屏幕，标题完全变黑
    }
}
