package robot.mr.p_026_intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTime = (Button) findViewById(R.id.time);
        Button buttonDate = (Button) findViewById(R.id.date);

        buttonTime.setOnClickListener(this);
        buttonDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch(v.getId()){
            case R.id.time:
                intent = new Intent("info.MR.ROBOT.intent.action.time");
                startActivity(intent);
                break;
            case R.id.date:
                intent = new Intent("info.MR.ROBOT.intent.action.date");
                startActivity(intent);
                break;
        }
    }
}
