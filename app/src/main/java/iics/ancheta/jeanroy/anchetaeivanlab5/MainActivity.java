package iics.ancheta.jeanroy.anchetaeivanlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clickMapButton = (Button) findViewById(R.id.mapButton);
        Button clickActivity1Button = (Button)findViewById(R.id.activity1Button);

        clickMapButton.setOnClickListener((v) -> {
            Uri gmmIntentUri = Uri.parse("geo:14.5793653,121.0220352");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if(mapIntent.resolveActivity(getPackageManager()) !=  null) {
                startActivity(mapIntent);
            }

        });

        clickActivity1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveLinear= new Intent (getApplicationContext(), Main2Activity.class);
                startActivity(moveLinear);
            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LAB5", "onStart() was executed");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LAB5", "onResume() was executed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LAB5", "onPause() was executed");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LAB5", "onStop() was executed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LAB5", "onDestroy() was executed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LAB5", "onRestart() was executed");
    }

}
