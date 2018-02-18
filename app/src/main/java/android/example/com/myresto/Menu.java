package android.example.com.myresto;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void gambarsate(View view) {
        Intent i = new Intent(Menu.this, DetailMenu.class);  //jika diklik gambar sate maka bisa lanjut ke activity detailmenu
        startActivity(i);
    }

    public void gambarnasi(View view) {
        Intent i = new Intent(Menu.this, DetailMenu2.class); //jika diklik gambar sate maka bisa lanjut ke activity detailmenu
        startActivity(i);
    }

    public void gambarjus(View view) {
    }

    public void gambarteh(View view) {
    }

    public void gambarmie(View view) {
    }
}
