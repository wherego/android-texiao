package com.example.yangfeng.floatview;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取启动按钮
        Button start = (Button)findViewById(R.id.button);
        //获取移除按钮
        Button remove = (Button)findViewById(R.id.button2);
        //绑定监听
        start.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, FxService.class);
                //启动FxService
                startService(intent);
                finish();
            }
        });

        remove.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                //uninstallApp("com.phicomm.hu");
                Intent intent = new Intent(MainActivity.this, FxService.class);
                //终止FxService
                stopService(intent);
            }
        });

    }
}
