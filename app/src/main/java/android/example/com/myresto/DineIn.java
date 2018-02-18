package android.example.com.myresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

    }

    public void pilih(View view) { //untuk button pilih
        EditText editText = (EditText) findViewById(R.id.editText6);
        if (editText!= null){
            String showString = editText.getText().toString();
            Toast.makeText(this, showString,Toast.LENGTH_LONG).show();//menghasilkan pesan saat diklik
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        }
    }


}
