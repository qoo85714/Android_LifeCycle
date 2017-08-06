package tw.jason.app.helloworld.mylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Page4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
    }

    @Override
    public void finish() {
        setResult(147);
        super.finish();
    }
}
