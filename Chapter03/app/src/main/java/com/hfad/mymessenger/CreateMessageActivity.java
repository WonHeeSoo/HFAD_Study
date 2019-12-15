package com.hfad.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    // 버튼을 클릭하면 onSendMessage() 호출됨
    public void onSendMessage(View view)
    {
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        startActivity(intent);

    }
}
