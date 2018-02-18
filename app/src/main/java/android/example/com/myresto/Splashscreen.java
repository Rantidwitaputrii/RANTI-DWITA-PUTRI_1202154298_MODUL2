package android.example.com.myresto;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Splashscreen extends AppCompatActivity {
    private static int splashInterval = 2000; //agar pas splashnya keluar cuma 2 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this, MainActivity.class); //agar splashscreen bisa lanjut ke main activity
                startActivity(i);

            }


            private void finish() { //akan berhenti dengan sendirinya


            }
        },splashInterval);


    };
}
