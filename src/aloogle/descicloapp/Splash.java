// Latest modification 2012-4-28
package aloogle.descicloapp;
 
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
 
public class Splash extends ActionBarActivity
{
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
		song=MediaPlayer.create(Splash.this, R.raw.tree);
        setContentView(R.layout.splash);
        song.start();
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent janelaInicial = new Intent("aloogle.descicloapp.ALOOGLEDESCICLOACTIVITY");
                    startActivity(janelaInicial);
                }
            }
        };
        timer.start();
    }
 
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        song.release();
        finish();
    }
 
}
