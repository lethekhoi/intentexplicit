package lethekhoi.ltk.hcmus.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnIntentSendString, btnIntentSendInt, btnIntentSendObject, btnIntentObjectbyParcelable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIntentSendString = findViewById(R.id.buttonIntentString);
        btnIntentSendInt = findViewById(R.id.buttonIntentInt);
        btnIntentSendObject = findViewById(R.id.buttonIntentObject);
        btnIntentObjectbyParcelable = findViewById(R.id.buttonObjectbyParcelable);
        btnIntentSendString.setOnClickListener(view ->
                {
                    //statement
//                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
////                    intent.putExtra(Appconst.KEY_STRING, "Hello main 2");
////
////                    startActivity(intent);
                    sendIntent(Appconst.KEY_STRING, "Hello main 2");

                }
        );
        btnIntentSendInt.setOnClickListener(view ->
                {
//                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                    intent.putExtra(Appconst.KEY_INT, 123456);
//
//                    startActivity(intent);
                    sendIntent(Appconst.KEY_INT, 12345);
                }
        );

        //task : đua object sang generic
        //task chuyen dang mang object

        btnIntentSendObject.setOnClickListener(v -> {
            Sinhvien sinhvien = new Sinhvien("Nguyen Van A", "24");
//            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//            intent.putExtra(Appconst.KEY_OBJECT, sinhvien);
//
//            startActivity(intent);

            sendIntent(Appconst.KEY_OBJECT, sinhvien);

        });
        btnIntentObjectbyParcelable.setOnClickListener(v -> {
            Sinhvien sinhvien = new Sinhvien("Nguyen Van A", "24");
            ArrayList<Sinhvien> sinhviens = new ArrayList<>();
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra(Appconst.KEY_OBJECT_PARCEL, sinhvien);

            startActivity(intent);
        });


    }

    private <T> void sendIntent(String key, T value) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        if (value instanceof String) {
            intent.putExtra(key, (String) value);
        }
        if (value instanceof Integer) {
            intent.putExtra(key, (Integer) value);
        }

        if (value instanceof Sinhvien) {
            intent.putExtra(key, (Serializable) value);
        }

        startActivity(intent);
    }

}
