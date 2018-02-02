package mx.edu.utng.unit1evaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OperationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
    }

    public void nextActivity(View view){
        startActivity(new Intent(this, CalculatorActivity.class ));
    }

    public void nextActivity2(View view){
        startActivity(new Intent(this,FormActivity.class));
    }
}
