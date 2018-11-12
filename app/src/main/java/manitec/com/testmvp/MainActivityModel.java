package manitec.com.testmvp;

/**
 * Created by mani on 7/10/18.
 */

public class MainActivityModel implements MainActivityInterface.Model {
    private MainActivityInterface.Presenter presenter;
    private double resultado;

    public MainActivityModel(MainActivityInterface.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void alCuadrado(String data) {
        resultado = Double.valueOf(data) * Double.valueOf(data);
        presenter.showResultPresenter(String.valueOf(resultado));
    }
}
