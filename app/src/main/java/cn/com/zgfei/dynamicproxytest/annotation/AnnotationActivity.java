package cn.com.zgfei.dynamicproxytest.annotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.com.zgfei.dynamicproxytest.R;

/**
 * 参考：
 * http://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 */
public class AnnotationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);

        Button button = (Button) findViewById(R.id.bt_click_annotation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Apple apple = new Apple();
//                apple.setColor("RED");
//                apple.setName("apple");
//                apple.print();

                FruitAnnotationUtils.getFruitInfo(Apple.class);
            }
        });
    }
}
