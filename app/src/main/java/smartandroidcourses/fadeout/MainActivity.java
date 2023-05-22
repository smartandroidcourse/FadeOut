package smartandroidcourses.fadeout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import smartandroidcourses.Fadeout;

public class MainActivity extends AppCompatActivity {

    Button start,reset;
    Fadeout fade_out_particle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fade_out_particle = findViewById(R.id.fade_out_particle);

        //start FadeOut
        start = findViewById(R.id.start_fade);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fade_out_particle.startAnimation();

            }
        });

        //reset FadeOut
        reset = findViewById(R.id.reset_fade);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fade_out_particle.reset();

            }
        });


    }
}