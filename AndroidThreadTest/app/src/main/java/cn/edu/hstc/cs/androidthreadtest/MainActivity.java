package cn.edu.hstc.cs.androidthreadtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final int UPDATE_TEXT = 1;
    private TextView text;

    private Handler handler = new Handler() {
        public void handleMessage(Message mag){
            switch (mag.what) {
                case UPDATE_TEXT://进行UI操作
                    text.setText("Nice to meet you");
                    break;
                    default:
                        break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        Button changeText = (Button) findViewById(R.id.change_text);
        changeText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.change_text:
               new Thread(new Runnable() {
                   @Override
                   public void run() {
                       Message message=new Message();
                       message.what=UPDATE_TEXT;
                       handler.sendMessage(message);
//                       try{
//                           Thread.sleep(5000);
//
//                       }catch(Exception e){
//                           handler.sendMessage("woshi");
//
//                       }
                   }
               }).start();
               break;
               default:
                   break;
       }
    }
}
