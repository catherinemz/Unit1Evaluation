package mx.edu.utng.unit1evaluation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtAge;
    private EditText edtPhone;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        edtName =(EditText)findViewById(R.id.type_your_name);
        edtAge =(EditText)findViewById(R.id.type_your_age);
        edtPhone=(EditText)findViewById(R.id.type_phone_number);

        btnSend =(Button)findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(FormActivity.this, GreetingActivity.class);

                Bundle b = new Bundle();
                b.putString("name",edtName.getText().toString());
                b.putString("age", edtAge.getText().toString());
                b.putString("phone",edtPhone.getText().toString());

                intent.putExtras(b);

                startActivity(intent);
            }
        });
    }

}
