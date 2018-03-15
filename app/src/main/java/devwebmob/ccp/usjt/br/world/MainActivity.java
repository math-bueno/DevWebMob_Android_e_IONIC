package devwebmob.ccp.usjt.br.world;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * @author Matheus Bueno  RA:81612420
 * DEVWEBMOB
 * CCP3AN-MCA
 */
public class MainActivity extends Activity {
    Spinner spinnerContinente;
    public static final String CHAVE = "br.usjt.desmob.atlas.txtContinente";
    String continente = "Todos";

    /**
     * @author Matheus Bueno  RA:81612420
     * DEVWEBMOB
     * CCP3AN-MCA
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerContinente = (Spinner)findViewById(R.id.spinnerContinente);
        spinnerContinente.setOnItemSelectedListener(new ContinenteSelecionado());
    }

    /**
     * @author Matheus Bueno  RA:81612420
     * DEVWEBMOB
     * CCP3AN-MCA
     */
    public void listarPaises(View view){
        Intent intent = new Intent(this, ListaPaisesActivity.class);

        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }

    /**
     * @author Matheus Bueno  RA:81612420
     * DEVWEBMOB
     * CCP3AN-MCA
     */
    private class ContinenteSelecionado implements AdapterView.OnItemSelectedListener {
        /**
         * @author Matheus Bueno  RA:81612420
         * DEVWEBMOB
         * CCP3AN-MCA
         */
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            continente = (String) parent.getItemAtPosition(position);
        }
        /**
         * @author Matheus Bueno  RA:81612420
         * DEVWEBMOB
         * CCP3AN-MCA
         */
        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
