package android.example.com.myresto;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

    }

    public void pilih(View view) {
        Intent intent = new Intent(this, Menu.class); //jika diklik agar bisa lanjut ke menu
        startActivity(intent);
    }


    public void showTimePickerDialog(View view) {  //menampilkan time
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    public void showDatePickerDialog(View view) { //menampilkan date

        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));

    }

    }

