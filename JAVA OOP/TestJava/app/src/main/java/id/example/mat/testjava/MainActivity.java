package id.example.mat.testjava;

import android.support.v4.util.ObjectsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textSword,textRapier,textWeapon,textObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sword sword;
        Rapier rapier;
        Weapon weapon;
        Object obj;
        sword = new Rapier(5,10);
        rapier = new Rapier(12,2);
        weapon = new Rapier(20,3);
        obj = new Rapier(3,5);

        textSword = findViewById(R.id.text_sword);
        textRapier = findViewById(R.id.text_rapier);
        textWeapon = findViewById(R.id.text_weapon);
        textObject = findViewById(R.id.text_object);

        textSword.setText("Rapier As Sword With Given Sound : "+sword.attack("SSzzzsad"));
        textRapier.setText("Rapier With weight : "+rapier.getWeight()+" And Shrapness : "+rapier.getSharpness());
        textWeapon.setText("Rapier As Weapon With Sound : "+ weapon.attack());
        textObject.setText("Rapier as Object :"+obj.toString());

    }
}
