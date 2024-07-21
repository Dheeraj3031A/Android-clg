package com.notdheeraj06.p7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
// Handle item selection
        if (id == R.id.action_settings) {
// Open settings activity or perform desired action
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(intent); // Start MainActivity2
            return true;}
        return super.onOptionsItemSelected(item);
    }
}