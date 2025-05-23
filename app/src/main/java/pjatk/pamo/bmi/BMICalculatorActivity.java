package pjatk.pamo.bmi;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.db.williamchart.view.LineChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import kotlin.Pair;


public class BMICalculatorActivity extends AppCompatActivity {

    private LineChartView lineChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
        EditText weightInput = findViewById(R.id.weightInput);
        EditText heightInput = findViewById(R.id.heightInput);
        Button calculateButton = findViewById(R.id.calculateButton);
        TextView resultText = findViewById(R.id.resultText);
        LineChartView lineChart = findViewById(R.id.lineChart);


        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = weightInput.getText().toString();
                String heightStr = heightInput.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                    try {
                        double weight = Double.parseDouble(weightStr);
                        double heightCm = Double.parseDouble(heightStr);

                        double bmi = BmiUtils.calculateBmi(weight, heightCm);
                        String classification = BmiUtils.classifyBmi(bmi);

                        int color;
                        switch (classification) {
                            case "Niedowaga":
                                color = Color.YELLOW;
                                break;
                            case "Optimum":
                                color = Color.GREEN;
                                break;
                            case "Nadwaga":
                                color = Color.YELLOW;
                                break;
                            default:
                                color = Color.RED;
                                break;
                        }

                        resultText.setText(String.format("Twoje BMI: %.2f\n%s", bmi, classification));
                        resultText.setTextColor(color);

                    } catch (IllegalArgumentException e) {
                        resultText.setText(e.getMessage());
                        resultText.setTextColor(Color.RED);
                    }
                } else {
                    resultText.setText("Podaj wagę i wzrost!");
                    resultText.setTextColor(Color.RED);
                }
            }
        });



        List<kotlin.Pair<String, Float>> entries = new ArrayList<>();
        entries.add(new kotlin.Pair<>("Pn", 60f));
        entries.add(new kotlin.Pair<>("Wt", 62f));
        entries.add(new kotlin.Pair<>("Sr", 58f));
        entries.add(new kotlin.Pair<>("Cz", 56f));
        entries.add(new kotlin.Pair<>("Pt", 52f));
        entries.add(new Pair<>("So", 50f));

        lineChart.show(entries);


    }
}
