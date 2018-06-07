package iammert.com.statusview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import iammert.com.library.Status;
import iammert.com.library.StatusView;

public class MainActivity extends AppCompatActivity {

    Button complete;
    Button error;
    Button loading;
    Button idle;
    Button reconnectingWithDelay;
    StatusView statusView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusView = (StatusView) findViewById(R.id.status);
        complete = (Button) findViewById(R.id.complete);
        error = (Button) findViewById(R.id.error);
        loading = (Button) findViewById(R.id.loading);
        idle = (Button) findViewById(R.id.idle);
        reconnectingWithDelay = (Button) findViewById(R.id.reconnect);

        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statusView.setStatus(Status.COMPLETE);
            }
        });

        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statusView.setStatus(Status.ERROR);
            }
        });

        loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statusView.setStatus(Status.LOADING);
            }
        });

        idle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statusView.setStatus(Status.IDLE);
            }
        });

        reconnectingWithDelay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusView.setStatus(Status.RECONNECTING);
            }
        });
    }
}
