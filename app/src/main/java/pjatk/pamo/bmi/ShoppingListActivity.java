package pjatk.pamo.bmi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class ShoppingListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        recyclerView = findViewById(R.id.recyclerViewShopping);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ShoppingItem> shoppingItems = Arrays.asList(
                new ShoppingItem("2 jajka"),
                new ShoppingItem("1 szklanka mąki"),
                new ShoppingItem("1/2 szklanki mleka"),
                new ShoppingItem("1 łyżeczka soli")
        );

        adapter = new ShoppingListAdapter(shoppingItems);
        recyclerView.setAdapter(adapter);
    }
}
