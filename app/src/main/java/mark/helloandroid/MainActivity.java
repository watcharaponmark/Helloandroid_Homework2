package mark.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast T1=Toast.makeText(this,"Hello",Toast.LENGTH_LONG);
        T1.setGravity(0,0,-180);
        T1.show();
        Button bt1 = (Button) findViewById(R.id.button_1);
        bt1.setOnClickListener(this);
        Button bt2=(Button) findViewById(R.id.button_2);
        bt2.setOnClickListener(this);
        Button bt3=(Button) findViewById(R.id.button_3);
        bt3.setOnClickListener(this);
        Button bt4=(Button) findViewById(R.id.button_4);
        bt4.setOnClickListener(this);
        Button bt5=(Button) findViewById(R.id.button_5);
        bt5.setOnClickListener(this);
        Button bt6=(Button) findViewById(R.id.button_6);
        bt6.setOnClickListener(this);
        Button bt7=(Button) findViewById(R.id.button_7);
        bt7.setOnClickListener(this);
        Button bt8=(Button) findViewById(R.id.button_8);
        bt8.setOnClickListener(this);
        Button bt9=(Button) findViewById(R.id.button_9);
        bt9.setOnClickListener(this);
        Button bt0=(Button) findViewById(R.id.button_0);
        bt0.setOnClickListener(this);
        Button btc=(Button) findViewById(R.id.clear_button);
        btc.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        TextView tv1=(TextView)findViewById(R.id.digit_text_view);
        Toast T=Toast.makeText(this,"ป้อนรหัสผ่าน 8 ตัวอักษร",Toast.LENGTH_SHORT);
        T.setGravity(0,0,-180);
        int id= view.getId();
        if(this.str.length()!=8) {
            if (id == R.id.button_1) {
                this.str += "1";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_2) {
                this.str += "2";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_3) {
                this.str += "3";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_4) {
                this.str += "4";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_5) {
                this.str += "5";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_6) {
                this.str += "6";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_7) {
                this.str += "7";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_8) {
                this.str += "8";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_9) {
                this.str += "9";
                tv1.setText(this.str);
                T.show();
            } else if (id == R.id.button_0) {
                this.str += "0";
                tv1.setText(this.str);
                T.show();
            }
        }
             if (id == R.id.clear_button) {
                 if( !str.equals("")){
                     this.str = str.substring(0, str.length() - 1);
                     tv1.setText(this.str);
                     T.show();
                 }
                 else {
                     tv1.setText("********");
                     T.show();
                 }

            }


    }
}
