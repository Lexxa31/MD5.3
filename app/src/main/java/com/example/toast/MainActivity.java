package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Всплывающее уведомление. Выключи утюг!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView AndrImageView = new ImageView(getApplicationContext());
        AndrImageView.setImageResource(R.drawable.ic_launcher_foreground);
        toastContainer.addView(AndrImageView, 0);
        toast.show();
    }
}
