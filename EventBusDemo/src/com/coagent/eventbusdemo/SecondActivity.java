package com.coagent.eventbusdemo;

import com.coagent.eventbusdemo.model.MainMessage;

import de.greenrobot.event.EventBus;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SecondActivity extends Activity implements View.OnClickListener {
  private  Button btnMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnMain = (Button) findViewById(R.id.btnMain);
        btnMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMain:
                EventBus.getDefault().post(new MainMessage("传递信息：aikaifa"));
                finish();
                break;
        }
    }

}
