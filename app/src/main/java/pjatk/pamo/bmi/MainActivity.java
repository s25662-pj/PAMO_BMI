package pjatk.pamo.bmi;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weightInput = findViewById(R.id.weightInput);
        EditText heightInput = findViewById(R.id.heightInput);
        Button calculateButton = findViewById(R.id.calculateButton);
        TextView resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = weightInput.getText().toString();
                String heightStr = heightInput.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                    double weight = Double.parseDouble(weightStr);
                    double heightCm = Double.parseDouble(heightStr);

                    if (heightCm > 0) {
                        // Konwersja wzrostu z cm na metry
                        double heightMeters = heightCm / 100;
                        double bmi = weight / (heightMeters * heightMeters);

                        // Klasyfikacja BMI i zmiana koloru
                        String classification;
                        int color;

                        if (bmi < 18.5) {
                            classification = "Niedowaga";
                            color = Color.YELLOW;
                        } else if (bmi >= 18.5 && bmi < 25) {
                            classification = "Optimum";
                            color = Color.GREEN;
                        } else if (bmi >= 25 && bmi < 30) {
                            classification = "Nadwaga";
                            color = Color.YELLOW;
                        } else {
                            classification = "Otyłość";
                            color = Color.RED;
                        }

                        // Ustawienie wyniku i koloru
                        resultText.setText(String.format("Twoje BMI: %.2f\n%s", bmi, classification));
                        resultText.setTextColor(color);
                    } else {
                        resultText.setText("Wzrost musi być większy niż 0!");
                        resultText.setTextColor(Color.RED);
                    }
                } else {
                    resultText.setText("Podaj wagę i wzrost!");
                    resultText.setTextColor(Color.RED);
                }
            }
        });
    }
}

