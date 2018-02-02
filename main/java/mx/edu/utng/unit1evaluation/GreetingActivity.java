package mx.edu.utng.unit1evaluation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    private TextView txtGreeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        txtGreeting = (TextView)findViewById(R.id.txt_greeting);


        Bundle bundle = this.getIntent().getExtras();


        txtGreeting.setText( "Hello "+bundle.getString("name")+" your age "+bundle.getString("age")+" your phone number "+bundle.getString("phone"));
    }
}
