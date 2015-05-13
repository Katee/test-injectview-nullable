package io.kate.test_injectview_nullable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class MainActivity extends RoboActivity {

    @Nullable
    @InjectView(R.id.text)
    TextView text;
    @Nullable
    @InjectView(R.id.text_land)
    TextView textLand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
