package sg.edu.rp.c346.id21033869.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tBtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroupGender);

        tBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action

                btnDisplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Code for the action
                        String stringResponse = etInput.getText().toString();
                        int checkedRadioId = rgGender.getCheckedRadioButtonId();
                        if(checkedRadioId == R.id.radioButtonMale){
                            // Write the code when male selected
                            stringResponse = "He said " + etInput.getText().toString();                      }
                        else{
                            // Write the code when female selected
                            stringResponse = "She said " + etInput.getText().toString();
                        }
                        tvDisplay.setText(stringResponse);
                    }
                });



    }
        });
    };
}