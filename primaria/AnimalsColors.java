package mx.edu.utng.primaria;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Husky Siberiano on 04/02/2017.
 */
public class AnimalsColors extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final RecyclerView rvList = (RecyclerView)findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);
        LinearLayoutManager manager = new GridLayoutManager(AnimalsColors.this, 2);
        rvList.setLayoutManager(manager);

        List<Activities> activitiesList = new ArrayList<Activities>();
        activitiesList.add(new Activities(R.drawable.abc, "Animals", "Listening",R.color.enable));
        activitiesList.add(new Activities(R.drawable.numbers, "Colors", "Listening",R.color.enable));
        activitiesList.add(new Activities(R.drawable.icon_android, "Animals", "Writing",R.color.enable));
        activitiesList.add(new Activities(R.drawable.icon_android, "Colors", "Writing",R.color.enable));
        activitiesList.add(new Activities(R.drawable.test, "Test", "Final Test Activity",R.color.enable));

        ActivitiesAdapter adapter = new ActivitiesAdapter(activitiesList);
        adapter.setOnclicListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(rvList.getChildPosition(v)){
                    case 0:
                        startActivity(new Intent(getApplicationContext(),AlphabetListening.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),NumbersListening.class));
                        break;
                   /* case 2:
                        startActivity(new Intent(getApplicationContext(),AlphabetWrititng.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(),NumbersWriting.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(),TestActivity1.class));
                        break;*/
                }
            }
        });
        rvList.setAdapter(adapter);
    }

}
