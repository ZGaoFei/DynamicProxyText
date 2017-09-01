package cn.com.zgfei.dynamicproxytest.reflect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.com.zgfei.dynamicproxytest.R;
import cn.com.zgfei.dynamicproxytest.logger.LoggerUtils;

/**
 * 参考：
 * http://blog.csdn.net/liujiahan629629/article/details/18013523
 * http://www.sczyh30.com/posts/Java/java-reflection-1/#%E4%B8%80%E3%80%81%E5%9B%9E%E9%A1%BE%EF%BC%9A%E4%BB%80%E4%B9%88%E6%98%AF%E5%8F%8D%E5%B0%84%EF%BC%9F
 */
public class ReflectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflect);

        Button button = (Button) findViewById(R.id.bt_click_reflect);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                PersonReflect.printField("cn.com.zgfei.dynamicproxytest.reflect.Person");

//                PersonReflect.getFields(Person.class);

//                PersonReflect.getField(Person.class);

//                PersonReflect.getConstructors(Person.class);

                PersonReflect.getOther(String.class);
                LoggerUtils.e("====", "====");

            }
        });
    }
}
