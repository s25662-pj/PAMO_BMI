package pjatk.pamo.bmi;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_bmi).setOnClickListener(v -> startActivity(new Intent(this, BMICalculatorActivity.class)));
        findViewById(R.id.btn_calories).setOnClickListener(v -> startActivity(new Intent(this, CaloriesCalculatorActivity.class)));
        findViewById(R.id.btn_recipes).setOnClickListener(v -> startActivity(new Intent(this, RecipesActivity.class)));
        findViewById(R.id.btn_shopping).setOnClickListener(v -> startActivity(new Intent(this, ShoppingListActivity.class)));
    }
}
