package tw.jason.app.helloworld.mylifecycle;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Page2Activity extends AppCompatActivity {
    private long lastKeyTime ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
    public void doExit(View view){
        finish();
    }

    @Override
    public void finish() {
        Log.i("brad","Page2:finish");
        if(System.currentTimeMillis()-lastKeyTime<=3*1000) {
            super.finish();
        }else{
            Toast.makeText(this,"Press one more time",Toast.LENGTH_SHORT).show();
        }
        lastKeyTime = System.currentTimeMillis();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("brad", "Page2:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("brad", "Page2:onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("brad", "Page2:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("brad", "Page2:onDestroy");
    }

}
