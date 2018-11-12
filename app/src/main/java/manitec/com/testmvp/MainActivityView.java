package manitec.com.testmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityView extends AppCompatActivity implements MainActivityInterface.View {
private TextView tvAlCuadrado;
private EditText edAlCuadrado;
private MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAlCuadrado = (TextView) findViewById(R.id.tvAlCuadrado);
        edAlCuadrado = (EditText) findViewById(R.id.edAlCuadrado);
        presenter = new MainActivityPresenter(this);

    }

    public void calcular(View view){
        presenter.alCuadrado(edAlCuadrado.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvAlCuadrado.setText(result);
    }
}
