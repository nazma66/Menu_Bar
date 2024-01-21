package com.example.menu_rnd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
@Override

public boolean onOptionsItemSelected(MenuItem item){
    int id= item.getItemId();
    if(id==R.id.action_settings){
        return true;
    }
    ImageView iv = findViewById(R.id.imageview);
    if (id == R.id.action_home){
        iv.setImageResource(R.drawable.img);
    }

    if (id == R.id.action_bird){
        iv.setImageResource(R.drawable.bird);
    }

    if (id == R.id.action_cat){
        iv.setImageResource(R.drawable.cat);
    }

    if (id == R.id.action_glass){
        iv.setImageResource(R.drawable.glass);
    }
    return super.onOptionsItemSelected(item);
}

}


