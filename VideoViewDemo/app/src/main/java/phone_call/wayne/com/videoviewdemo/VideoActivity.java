package phone_call.wayne.com.videoviewdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    private VideoView vv_myvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_video);

        vv_myvideo =(VideoView)findViewById(R.id.vv_myvideo);

       Uri uri = Uri.parse("http://www.androidbegin.com/tutorial/AndroidCommercial.3gp");
        vv_myvideo.setMediaController(new MediaController(this));
        vv_myvideo.setVideoURI(uri);
        vv_myvideo.start();
        //vv_myvideo.requestFocus();
    }
}
