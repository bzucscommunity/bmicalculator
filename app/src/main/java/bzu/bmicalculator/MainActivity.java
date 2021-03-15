package bzu.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight,height;
    TextView calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = findViewById(R.id.height_input);
        weight = findViewById(R.id.weight_input);
        calculate = findViewById(R.id.result);
    }
    public double calculateBMI(View v) {
        String heightInput = height.getText().toString().trim();
        String weightInput = weight.getText().toString().trim();

        if (heightInput != null && !"".equals(heightInput)
                && weightInput != null  &&  !"".equals(weightInput)) {
            double heightValue = Double.parseDouble(heightInput) / 100;
            double weightValue = Double.parseDouble(weightInput);

           return  weightValue / (heightValue * heightValue);
        }
        return 0;
    }
    public void btn_onClick(View view){
        Double result=calculateBMI(view);
        calculate.setText("Your BMI is: "+result.toString());
        calculate.setVisibility(View.VISIBLE);
    }
}