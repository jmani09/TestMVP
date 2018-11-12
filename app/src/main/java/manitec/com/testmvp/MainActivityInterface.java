package manitec.com.testmvp;

/**
 * Created by mani on 7/10/18.
 */

public interface MainActivityInterface {
    interface View{
        void showResult(String result);
    }

    interface Presenter{
        void showResultPresenter(String result);
        void alCuadrado(String data);
    }

    interface Model{
        void alCuadrado(String data);
    }
}
