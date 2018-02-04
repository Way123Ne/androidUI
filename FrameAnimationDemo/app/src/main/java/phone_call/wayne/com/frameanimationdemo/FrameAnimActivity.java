package phone_call.wayne.com.frameanimationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class FrameAnimActivity extends AppCompatActivity {
    private ImageView iv_myImage;
    private Button btn_start, btn_stop;
    private AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_anim);

        iv_myImage = (ImageView) findViewById(R.id.iv_myImage);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_stop = (Button) findViewById(R.id.btn_stop);

        //为一个ImageView控件设置背景；frame.xml文件放在res/drawable下ok(官方建议),自己尝试放在res/anim下不行
        iv_myImage.setBackgroundResource(R.drawable.frame);

        anim = (AnimationDrawable) iv_myImage.getBackground();

        //动画开始播放
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim.start();
            }
        });
        //停止播放
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim.stop();
            }
        });
    }

}
