
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MultiplyHandler implements ActionListener {
	TextField No1;
	public MultiplyHandler(TextField T) {
	No1 = T;
	}
	public void actionPerformed(ActionEvent A) {
		Button btn =(Button) A.getSource();
		No1.setText(No1.getText()*btn.getLabel());
	}
}