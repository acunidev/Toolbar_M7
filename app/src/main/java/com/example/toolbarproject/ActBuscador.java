package com.example.toolbarproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView.OnQueryTextListener;
import androidx.appcompat.widget.Toolbar;

public class ActBuscador extends AppCompatActivity {

  private ArrayAdapter<String> arrayAdapter;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_act_buscador);
    initItems();

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menutoolbarsearch, menu);
    MenuItem menuItem = menu.findItem(R.id.test1);
    SearchView searchView = (SearchView) menuItem.getActionView();
    searchView.setQueryHint("Escriu aqui per buscar");

    searchView.setOnQueryTextListener(new OnQueryTextListener() {
      @Override
      public boolean onQueryTextSubmit(String query) {
        return false;
      }

      @Override
      public boolean onQueryTextChange(String newText) {
        arrayAdapter.getFilter().filter(newText);
        return false;
      }
    });

    return super.onCreateOptionsMenu(menu);
  }

  @Override
  public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()) {
      case R.id.userProfile:
        startActivity(new Intent(this, PerfilUsuari.class));
        return true;
      case R.id.searcher:
        startActivity(new Intent(this, ActBuscador.class));
        return true;
      case R.id.test1:
        startActivity(new Intent(this, ActBuscador.class));
        return true;
    }
    return super.onOptionsItemSelected(item);
  }

  private void initItems() {
    ListView listView = findViewById(R.id.listView);

    String[] randomWords = {
        "pillow",
        "cash",
        "abolish",
        "technique",
        "budge",
        "winner",
        "access",
        "fair",
        "architecture",
        "security",
        "halt",
        "element",
        "mug",
        "kidney",
        "counter",
        "tool",
        "rider",
        "scatter",
        "objective",
        "drink",
        "sport",
        "kneel",
        "bury",
        "workshop",
        "posture",
        "unit",
        "barrel",
        "bolt",
        "quit",
        "advantage",
        "graphic",
        "bill",
        "appreciate",
        "herb",
        "favor",
        "trail",
        "urgency",
        "transparent",
        "final",
        "pill",
        "floor",
        "brand",
        "horror",
        "bark",
        "scheme",
        "jelly",
        "fitness",
        "accent",
        "interest",
        "article"
    };

    arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, randomWords);
    listView.setAdapter(arrayAdapter);

    Toolbar toolbar1 = findViewById(R.id.toolbarSearch);
    setSupportActionBar(toolbar1);
  }

}
