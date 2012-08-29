package au.edu.qut.inn372.greenhat.activity;

import android.os.Bundle;
import android.os.StrictMode;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import au.edu.qut.inn372.greenhat.bean.Calculator;
import au.edu.qut.inn372.greenhat.controller.CalculatorRemoteController;

public class LoginActivity extends Activity {

	@SuppressLint({ "NewApi", "NewApi", "NewApi" })
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
    
    /** Called when the user clicks the Send button */
    public void calculate(View view) {
    	TextView textView = (TextView)findViewById(R.id.textView1);
    	EditText inputSize = (EditText)findViewById(R.id.editText1);
    	EditText inputCost = (EditText)findViewById(R.id.editText2);
    	textView.setText("calculated");
    	try {
			Calculator calculator = new Calculator();
			calculator.getEquipment().setCost(new Double(inputCost.getText().toString()));
			calculator.getEquipment().setSize(new Double(inputSize.getText().toString()));
			CalculatorRemoteController controller = new CalculatorRemoteController();
			calculator = controller.calcEnergyProduction(calculator);
			textView.setText("Daily Soler Power =" + calculator.getResult() + " KW(p)");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
