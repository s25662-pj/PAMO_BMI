package pjatk.pamo.bmi;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CaloriesCalculatorActivity extends AppCompatActivity {

    EditText ageInput, weightInput, heightInput;
    Spinner activityLevel;
    RadioGroup genderGroup;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);

        ageInput = findViewById(R.id.ageInput);
        weightInput = findViewById(R.id.weightInput);
        heightInput = findViewById(R.id.heightInput);
        activityLevel = findViewById(R.id.activityLevel);
        genderGroup = findViewById(R.id.genderGroup);
        result = findViewById(R.id.resultText);

        findViewById(R.id.calculateButton).setOnClickListener(v -> calculateCalories());
    }

    void calculateCalories() {
        double weight = Double.parseDouble(weightInput.getText().toString());
        double height = Double.parseDouble(heightInput.getText().toString());
        int age = Integer.parseInt(ageInput.getText().toString());
        String gender = ((RadioButton) findViewById(genderGroup.getCheckedRadioButtonId())).getText().toString();

        double bmr = gender.equals("Mężczyzna")
                ? 66.5 + (13.75 * weight) + (5.003 * height) - (6.75 * age)
                : 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);

        double multiplier;
        switch (activityLevel.getSelectedItemPosition()) {
            case 0: multiplier = 1.2; break;
            case 1: multiplier = 1.375; break;
            case 2: multiplier = 1.55; break;
            case 3: multiplier = 1.725; break;
            case 4: multiplier = 1.9; break;
            default: multiplier = 1.0;
        }

        double dailyCalories = bmr * multiplier;
        result.setText(String.format("Twoje dzienne zapotrzebowanie: %.0f kcal", dailyCalories));
    }
}
