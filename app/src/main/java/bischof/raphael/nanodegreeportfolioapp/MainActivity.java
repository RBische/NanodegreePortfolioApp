package bischof.raphael.nanodegreeportfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
        Show the message depending on the view clicked. OnClick events are defined in the layout file.
     */
    public void displayToast(View view) {
        Button button = (Button) view;
        String buttonText = (String) button.getText();
        Context context = getApplicationContext();
        // open_app would add "Opens the app "
        CharSequence text = getString(R.string.launch_btn_text)+" "
                + buttonText+"!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
