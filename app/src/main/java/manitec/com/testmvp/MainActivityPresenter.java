package manitec.com.testmvp;

/**
 * Created by mani on 7/10/18.
 */

public class MainActivityPresenter implements MainActivityInterface.Presenter{
    private MainActivityInterface.View view;
    private MainActivityInterface.Model model;

    public MainActivityPresenter(MainActivityInterface.View view) {
        this.view = view;
        this.model = new MainActivityModel(this);
    }

    @Override
    public void showResultPresenter(String result) {
        if(view!=null){
            view.showResult(result);
        }
    }

    @Override
    public void alCuadrado(String data) {
        if(view!=null){
            model.alCuadrado(data);
        }
    }
}
