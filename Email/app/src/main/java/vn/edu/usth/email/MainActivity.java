package vn.edu.usth.email;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onShowInbox(View view){
        Intent intent = new Intent(this,InboxActivity.class);
        startActivity(intent);
    }
    public void onShowSent(View view){
        Intent intent = new Intent(this, SentActivity.class);
        startActivity(intent);
    }
    public void onShowSpam(View view){
        Intent intent = new Intent(this, SpamActivity.class);
        startActivity(intent);
    }
}