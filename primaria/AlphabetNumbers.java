package mx.edu.utng.primaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class AlphabetNumbers extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final RecyclerView rvList = (RecyclerView)findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);
        LinearLayoutManager manager = new GridLayoutManager(AlphabetNumbers.this, 2);
        rvList.setLayoutManager(manager);

        List<Activities> activitiesList = new ArrayList<Activities>();
        activitiesList.add(new Activities(R.drawable.abc, "Alphabet", "Listening",R.color.enable));
        activitiesList.add(new Activities(R.drawable.numbers, "Numbers", "Listening",R.color.enable));
        activitiesList.add(new Activities(R.drawable.icon_android, "Alphabet", "Writing",R.color.enable));
        activitiesList.add(new Activities(R.drawable.icon_android, "Numbers", "Writing",R.color.enable));
        activitiesList.add(new Activities(R.drawable.test, "Test", "Final Test Activity",R.color.enable));
        activitiesList.add(new Activities(R.drawable.test, "Resources", "Videos",R.color.enable));

        ActivitiesAdapter adapter = new ActivitiesAdapter(activitiesList);
        adapter.setOnclicListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(rvList.getChildPosition(v)){
                    case 0://por el momento a  alfabet
                        startActivity(new Intent(getApplicationContext(),Alphabet.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),NumbersListening.class));
                        break;
                    case 2:
                        //clase a llamar AlphabetWrititng
                        startActivity(new Intent(getApplicationContext(),AlphabetListening.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(),NumbersListening.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(),Test.class));
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(),AdditionalMaterial.class));
                }
            }
        });
        rvList.setAdapter(adapter);
    }

    }



