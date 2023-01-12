package com.example.toolbarproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PerfilUsuari extends AppCompatActivity {

  private Toolbar toolbar1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_perfil_usuari);
    initItems();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menutoolbar, menu);
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
    toolbar1 = findViewById(R.id.toolbarPerfil);
    setSupportActionBar(toolbar1);
  }
}