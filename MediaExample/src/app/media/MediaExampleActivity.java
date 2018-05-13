// MediaExampleActivity.java : Defines the entry point for the android application.
// Android: Media Player
// Author: Shweta Patil
// Copyright: Shweta Patil © 2018
package app.media;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class MediaExampleActivity extends Activity implements OnClickListener {
	Button start,stop,pause;
	ProgressBar pb;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        start=(Button)findViewById(R.id.b1);
        pause=(Button)findViewById(R.id.b2);
        stop=(Button)findViewById(R.id.b3);
        pb=(ProgressBar)findViewById(R.id.pb1);
        start.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);   
    }

	@Override
	public void onClick(View v) {
		MediaPlayer mp=MediaPlayer.create(this, R.raw.barfimsg);

		if(v.getId()==R.id.b1)
		{
			mp.start();
		}
		
		if(v.getId()==R.id.b2)
		{
			mp.pause();
		}
		
		if(v.getId()==R.id.b3)
		{
			mp.stop();
		}
	}
}