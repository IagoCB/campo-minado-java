import campo.model.Tabuleiro;
import campo.view.TabuleiroConsole;

public class App {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
        new TabuleiroConsole(tabuleiro);
    }
}
