package com.example.looptransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Button button=(Button)findViewById(R.id.button);
   //Button button2=(Button)findViewById(R.id.button2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,ActivityOne.class);
                intent.putExtra("name","李想");
                intent.putExtra("age",20);
            startActivityForResult(intent,0);
            }
        });

        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,ActivityTwo.class);
                intent.putExtra("name","王维");
                intent.putExtra("age",25);
                startActivityForResult(intent,1);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str, Toast.LENGTH_LONG).show();
        }

        if(requestCode==1 && resultCode==1){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str, Toast.LENGTH_LONG).show();
        }

    }
}
