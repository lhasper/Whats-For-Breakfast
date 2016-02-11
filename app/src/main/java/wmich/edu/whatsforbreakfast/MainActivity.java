package wmich.edu.whatsforbreakfast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String omelet = "Kalamazoo's Award winning 7 egg omelet is on the way!";
    String pancake = "This short stack is a tall order for anyone.";
    String frenchToast = "Stuffed with fruit, covered with powdered sugar..Nothing French about this choice.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final RadioButton rdoOmlette = (RadioButton) findViewById(R.id.rdoBtnOmelett);
        final RadioButton rdoPancake = (RadioButton) findViewById(R.id.rdoBtnPancakes);
        final RadioButton rdoFrTst = (RadioButton) findViewById(R.id.rdoBtnFrenchToast);
        final Button btnSubmit = (Button) findViewById(R.id.btnMakeMyOrder);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rdoFrTst.isChecked()) {
                    Toast.makeText(MainActivity.this, frenchToast, Toast.LENGTH_LONG).show();
                } else if (rdoPancake.isChecked()) {
                    Toast.makeText(MainActivity.this, pancake, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, omelet, Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
