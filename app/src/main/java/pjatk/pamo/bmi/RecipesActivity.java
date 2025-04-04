package pjatk.pamo.bmi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipesActivity extends AppCompatActivity {
    TextView recipeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        recipeView = findViewById(R.id.recipeText);

        // Przykładowe przepisy
        String recipe1 = "✅ Dieta wegetariańska:\n- Owsianka z bananem i orzechami\n- Sałatka z ciecierzycą\n- Pieczone warzywa z tofu";
        String recipe2 = "✅ Dieta klasyczna:\n- Jajecznica z warzywami\n- Kurczak z ryżem i brokułami\n- Twarożek z pomidorami";

        recipeView.setText(recipe1 + "\n\n" + recipe2);
    }
}
