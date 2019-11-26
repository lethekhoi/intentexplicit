package lethekhoi.ltk.hcmus.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnIntentSendString, btnIntentSendInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIntentSendString = findViewById(R.id.buttonIntentString);
        btnIntentSendInt = findViewById(R.id.buttonIntentInt);
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
    }

    private <T> void sendIntent(String key, T value) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        if (value instanceof String) {
            intent.putExtra(key, (String) value);
        }
        if (value instanceof Integer) {
            intent.putExtra(key, (Integer) value);
        }
        startActivity(intent);
    }

}
