import javax.swing.*;

public class QuantumChess implements Runnable {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new QuantumChess());
    }

    @Override
    public void run() {
        JFrame frame = new JFrame("Quantum Chess");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1100, 800);
        ChessGame qchess = new ChessGame();
        qchess.init();
        frame.getContentPane().add(qchess);
        frame.setVisible(true);
        qchess.start();
    }
}
