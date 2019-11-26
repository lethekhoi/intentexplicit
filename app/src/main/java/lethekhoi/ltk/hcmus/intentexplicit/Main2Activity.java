package lethekhoi.ltk.hcmus.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //1: nhan dang string
        //Intent intent = getIntent();
        // String chuoi = intent.getStringExtra(Appconst.KEY_STRING);
        // Log.d("BBB", chuoi);
        // 2:nhan dang string
        Intent intent = getIntent();
        int so = intent.getIntExtra(Appconst.KEY_INT, -1);
        Log.d("BBB", so + "");
    }
}
