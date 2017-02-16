package mx.edu.utng.primaria;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fabActivity1;
    private FloatingActionButton fabActivity2;
    private FloatingActionButton fabActivity3;
    private FloatingActionButton fabActivity4;
    private ImageView ivTest;

    private TextView tvAbNu;
    private TextView tvAnCo;
    private TextView tvFaRo;
    private TextView tvFgDe;
    private TextView tvObCa;
    private int califTest=8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabActivity1 = (FloatingActionButton)findViewById(R.id.fab_activity_1);
        fabActivity2 = (FloatingActionButton)findViewById(R.id.fab_activity_2);
        fabActivity3 = (FloatingActionButton)findViewById(R.id.fab_activity_3);
        fabActivity4 = (FloatingActionButton)findViewById(R.id.fab_activity_4);
        ivTest =(ImageView)findViewById(R.id.bt_certificate);

        tvAbNu = (TextView)findViewById(R.id.tv_al_nu);
        tvAnCo = (TextView)findViewById(R.id.tv_an_co);
        tvFaRo = (TextView)findViewById(R.id.tv_fa_ro);
        tvFgDe = (TextView)findViewById(R.id.tv_fg_de);
        tvObCa = (TextView)findViewById(R.id.tv_ob_ca);

        tvAbNu.setText("Alphabet\nNumbers");
        tvAnCo.setText("Animal\nColors");
        tvFaRo.setText("Family\nClothes");
        tvFgDe.setText("Geometric Figures\nSports");
        tvObCa.setText("Objects");


        fabActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AlphabetNumbers.class));
            }
        });


        fabActivity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random r = new Random();
                int calif = r.nextInt(10);

                if (calif >= califTest) {
                    startActivity(new Intent(getApplicationContext(),AnimalsColors.class));
                    // fabActivity2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    // fabActivity2.setBackgroundResource(R.color.verde);
                    Toast.makeText(MainActivity.this, "Calif= "+calif, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Calif= "+calif, Toast.LENGTH_SHORT).show();

                }
            }
        });

        fabActivity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FamilyClothes.class));
            }
        });
        ivTest.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(),Test.class));
    }
    });
    }


}
