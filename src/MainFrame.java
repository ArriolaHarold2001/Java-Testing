import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {

  String title;
  int x;
  int y;

  public MainFrame(String title, int x, int y){
    this.title = title;
    this.x = x;
    this.y = y;
  }

  public void init(){
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    JLabel label = new JLabel("Example of JLabel");
    JButton button = new JButton();
    button.setText("Click Here");
    panel.add(label);
    panel.add(button);
    this.add(panel);

    setTitle(this.title);
    setSize(this.x,this.y); 
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
