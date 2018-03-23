// Latest modification 2012-4-30
package aloogle.descicloapp;
import android.os.Bundle ;
import android.preference.PreferenceActivity ;
public class Preferencias extends PreferenceActivity {
	@Override
	protected void onCreate ( Bundle savedInstanceState ) {
		super . onCreate( savedInstanceState );
		addPreferencesFromResource ( R. layout.settings ) ;
	}
}
