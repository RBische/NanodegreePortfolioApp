package bischof.raphael.nanodegreeportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_bacon_reader).setOnClickListener(this);
        findViewById(R.id.btn_build_it_bigger).setOnClickListener(this);
        findViewById(R.id.btn_capstone_my_own_app).setOnClickListener(this);
        findViewById(R.id.btn_library_app).setOnClickListener(this);
        findViewById(R.id.btn_scores_app).setOnClickListener(this);
        findViewById(R.id.btn_spotify_streamer).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_bacon_reader:
                    Toast.makeText(this,getString(R.string.launch_btn_text)+" "+getString(R.string.btn_bacon_reader)+" !",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build_it_bigger:
                Toast.makeText(this,getString(R.string.launch_btn_text)+" "+getString(R.string.btn_build_it_bigger)+" !",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone_my_own_app:
                Toast.makeText(this,getString(R.string.launch_btn_text)+" "+getString(R.string.btn_capstone_my_own_app)+" !",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_library_app:
                Toast.makeText(this,getString(R.string.launch_btn_text)+" "+getString(R.string.btn_library_app)+" !",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores_app:
                Toast.makeText(this,getString(R.string.launch_btn_text)+" "+getString(R.string.btn_scores_app)+" !",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_spotify_streamer:
                Toast.makeText(this,getString(R.string.launch_btn_text)+" "+getString(R.string.btn_spotify_streamer)+" !",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
