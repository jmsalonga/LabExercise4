package iics.salonga.josemari.activity92918;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastBtn = (Button)findViewById(R.id.toastBtn);
        Button snackbarBtn = (Button)findViewById(R.id.snackbarBtn);
        Button snackbaractBtn = (Button)findViewById(R.id.snackbaractBtn);

        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "TOAST!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(),message,duration).show();
            }
        });
        snackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.activity_main);
                String message = "Snackbar message";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });

        snackbaractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.activity_main);
                String message = "Snackbar message with actions";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbarAct(view, message, duration);
            }
        });
    }

    private void showSnackbar(View view, String message, int duration) {
        Snackbar.make(view, message, duration).show();
    }

    private void showSnackbarAct(View view, String message, int duration) {
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });

        snackbar.show();
    }
}
