package mx.edu.utng.primaria;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


/**
 * Created by Santana on 1/21/2017.
 */
public class Alphabet extends AppCompatActivity  implements View.OnClickListener{
    private ImageButton imageA,imageB,imageC,imageD,imageE,imageF,
            imageG,imageH,imageI,imageJ,imageK,imageL,imageM,imageN,
            imageO,imageP,imageQ,imageR,imageS,imageT,imageU,imageV,imageW,imageX,imageY,imageZ;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet);
        imageA=(ImageButton)findViewById(R.id.image_a);
        imageB=(ImageButton)findViewById(R.id.image_b);
        imageC=(ImageButton)findViewById(R.id.image_c);
        imageD=(ImageButton)findViewById(R.id.image_d);
        imageE=(ImageButton)findViewById(R.id.image_e);
        imageF=(ImageButton)findViewById(R.id.image_f);
        imageG=(ImageButton)findViewById(R.id.image_g);
        imageH=(ImageButton)findViewById(R.id.image_h);
        imageI=(ImageButton)findViewById(R.id.image_i);
        imageJ=(ImageButton)findViewById(R.id.image_j);
        imageK=(ImageButton)findViewById(R.id.image_k);
        imageL=(ImageButton)findViewById(R.id.image_l);
        imageM=(ImageButton)findViewById(R.id.image_m);
        imageN=(ImageButton)findViewById(R.id.image_n);
        imageO=(ImageButton)findViewById(R.id.image_o);
        imageP=(ImageButton)findViewById(R.id.image_p);
        imageQ=(ImageButton)findViewById(R.id.image_q);
        imageR=(ImageButton)findViewById(R.id.image_r);
        imageS=(ImageButton)findViewById(R.id.image_s);
        imageT=(ImageButton)findViewById(R.id.image_t);
        imageU=(ImageButton)findViewById(R.id.image_u);
        imageV=(ImageButton)findViewById(R.id.image_v);
        imageW=(ImageButton)findViewById(R.id.image_w);
        imageX=(ImageButton)findViewById(R.id.image_x);
        imageY=(ImageButton)findViewById(R.id.image_y);
        //imageZ=(ImageButton)findViewById(R.id.image_z);

        imageA.setOnClickListener(this);
        imageB.setOnClickListener(this);
        imageC.setOnClickListener(this);
        imageD.setOnClickListener(this);
        imageE.setOnClickListener(this);
        imageF.setOnClickListener(this);
        imageG.setOnClickListener(this);
        imageH.setOnClickListener(this);
        imageI.setOnClickListener(this);
        imageJ.setOnClickListener(this);
        imageK.setOnClickListener(this);
        imageL.setOnClickListener(this);
        imageM.setOnClickListener(this);
        imageN.setOnClickListener(this);
        imageO.setOnClickListener(this);
        imageP.setOnClickListener(this);
        imageQ.setOnClickListener(this);
        imageR.setOnClickListener(this);
        imageS.setOnClickListener(this);
        imageT.setOnClickListener(this);
        imageU.setOnClickListener(this);
        imageW.setOnClickListener(this);
        imageX.setOnClickListener(this);
        imageY.setOnClickListener(this);
       // imageZ.setOnClickListener(this);
        imageV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case (R.id.image_a):
                MediaPlayer medpl = MediaPlayer.create(this, R.raw.lettera);
                medpl.start();
                break;
            case (R.id.image_b):
                MediaPlayer mp = MediaPlayer.create(this, R.raw.safre);
                mp.start();
                break;
            case (R.id.image_c):
              /*  MediaPlayer mep = MediaPlayer.create(this, R.raw.safre);
                mep.start();*/
                break;
            case (R.id.image_d):
               /* MediaPlayer medp = MediaPlayer.create(this, R.raw.safre);
                medp.start();*/
                break;
            case (R.id.image_e):
              /*  MediaPlayer medpl = MediaPlayer.create(this, R.raw.safre);
                medpl.start();*/
                break;
            case (R.id.image_f):

                break;
            case (R.id.image_g):

                break;
            case (R.id.image_h):

                break;
            case (R.id.image_i):

                break;
            case (R.id.image_j):

                break;
            case (R.id.image_k):

                break;
            case (R.id.image_l):

                break;
            case (R.id.image_m):

                break;
            case (R.id.image_n):

                break;
            case (R.id.image_o):

                break;
            case (R.id.image_p):

                break;
            case (R.id.image_q):

                break;
            case (R.id.image_r):

                break;
            case (R.id.image_s):

                break;
            case (R.id.image_t):
                break;
            case (R.id.image_u):

                break;
            case (R.id.image_v):

                break;
            case (R.id.image_w):

                break;
            case (R.id.image_x):

                break;
            case (R.id.image_y):

                break;
            /*case (R.id.image_z):

                break;
*/

        }
    }
}
