package mx.edu.utng.primaria;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Husky Siberiano on 04/02/2017.
 */
public class FamilyClothes extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final RecyclerView rvList = (RecyclerView)findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);
        LinearLayoutManager manager = new GridLayoutManager(FamilyClothes.this, 2);
        rvList.setLayoutManager(manager);

        List<Activities> activitiesList = new ArrayList<Activities>();
        activitiesList.add(new Activities(R.drawable.abc, "Family", "Listening",R.color.enable));
        activitiesList.add(new Activities(R.drawable.numbers, "Clothes", "Listening",R.color.enable));
        activitiesList.add(new Activities(R.drawable.icon_android, "Family", "Writing",R.color.enable));
        activitiesList.add(new Activities(R.drawable.icon_android, "Clothes", "Writing",R.color.enable));
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
