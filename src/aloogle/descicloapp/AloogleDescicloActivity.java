// Latest modification 2012-4-30
package aloogle.descicloapp ;
import android.content.*;
import android.os.*;
import android.text.*;
import android.view.*;
import android.widget.*;
public class AloogleDescicloActivity extends ActionBarActivity
{
	private boolean mAlternateTitle = false ;
	public void onCreate(Bundle savedInstanceState)
	{
		super . onCreate(savedInstanceState);
		setContentView(R . layout. main);
		findViewById(R . id. toggle_title). setOnClickListener(new View. OnClickListener() {
				@Override
				public void onClick(View view)
				{
					if (mAlternateTitle)
					{
						setTitle(R.string.app_name);
					}
					else
					{
						setTitle(R.string.alternate_title);
					}
					mAlternateTitle = ! mAlternateTitle;
				}
			});
		findViewById(R . id. sobre_button). setOnClickListener(new View. OnClickListener() {
				@Override
				public void onClick(View view)
				{
					Intent janelaSobre = new Intent("aloogle.descicloapp.SOBRE");
                    startActivity(janelaSobre);
				}
			});
		findViewById(R . id. sair_button). setOnClickListener(new View. OnClickListener() {
				@Override
				public void onClick(View view)
				{
					finish();
				}
			});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater menuInflater = getMenuInflater();
		menuInflater . inflate(R . menu. main, menu);
// Calling super after populating the menu is necessary here to ensure that the
// action bar helpers have a chance to handle this event.
		return super . onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item . getItemId())
		{
			case android .R . id. home:
				Toast . makeText(this , "Futuro ínicio..." , Toast . LENGTH_SHORT). show();
				break ;
			case R . id. menu_refresh :
				Toast . makeText(this , "Menu falso..." , Toast . LENGTH_SHORT). show();
				break ;
			case R . id. menu_search :
				Toast . makeText(this , "Futura pesquisa..." , Toast .LENGTH_SHORT). show();
				break ;
			case R . id. menu_share :
				Intent sharingIntent = new Intent();
				sharingIntent . setAction(Intent. ACTION_SEND);
				sharingIntent . putExtra(Intent . EXTRA_TEXT , "Veja a nova versão do aplicativo da Desciclopédia!! http://goo.gl/xHxSB");
				sharingIntent . setType("text/plain");
				startActivity(Intent.createChooser(sharingIntent, "Compartilhar no..."));
				break;
			case R.id.settings:
				Intent janelaPref = new Intent("aloogle.descicloapp.PREFERENCIAS");
				startActivity(janelaPref);
				break ;
		}
		return super . onOptionsItemSelected(item);
	}
}
