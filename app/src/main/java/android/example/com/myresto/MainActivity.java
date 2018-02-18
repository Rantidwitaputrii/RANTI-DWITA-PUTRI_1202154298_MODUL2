package android.example.com.myresto;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Ranti Dwita Putri_1202154298",Toast.LENGTH_LONG).show(); //menghasilkan pesan saat dibuka main activity
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.takeaway:
                if (checked)
                    displayToast(getString(R.string.take_away));//saat diklik takeaway akan ada toast yang muncul
                break;
            case R.id.dinein:
                if (checked)
                    displayToast(getString(R.string.dine_in));//saat diklik dine in akan ada toast yang muncul
                break; // beberapa saat akan hilang
        }
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show(); //agar toast bisa muncul
    }

    public void pesan(View view) { //buttonnya biar bisa diklik
        if (((RadioButton)findViewById(R.id.dinein)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);   //jika diklik dine in akan menuju activity dine in
            startActivity(intent); //radio button untuk Dine In
        }else if (((RadioButton)findViewById(R.id.takeaway)).isChecked()){    //jika diklik take away akan menuju activity take away
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent); //radio button untuk Take away
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();  // jika radio button tidak diklik maka akan mucul toast dan tidak bisa next ke activity selanjutnya
        }

    }

    public void processDatePickerResult(int year, int month, int day) {  //untuk proses date
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute) { //untuk proses time
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
