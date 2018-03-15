package devwebmob.ccp.usjt.br.world;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Matheus Bueno  RA:81612420
 * DEVWEBMOB
 * CCP3AN-MCA
 */
public class Detalhe_Pais_Activity extends Activity {

    /**
     * @author Matheus Bueno  RA:81612420
     * DEVWEBMOB
     * CCP3AN-MCA
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        TextView txtPais = findViewById(R.id.txtPais);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListaPaisesActivity.PAIS);
        txtPais.setText(pais.toString());
    }
}
