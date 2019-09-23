package com.example.android.lesson_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText mValueField;
    private Button mAddBtn;

    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootRef = new Firebase("https://leeson1.firebaseio.com/");
        mValueField = (EditText) findViewById(R.id.editText3);
        mAddBtn = (Button) findViewById(R.id.addBtn);

        mAddBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String value = mValueField.getText().toString();
                Firebase childRef =  mRootRef.child("Age");
                childRef.setValue(value);
            }

    }
    );
    }
}
