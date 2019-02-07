package edu.miracostacollege.cs134.costalattacars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import edu.miracostacollege.cs134.costalattacars.R;
import edu.miracostacollege.cs134.costalattacars.model.CarLoan;

public class MainActivity extends AppCompatActivity
{
    private EditText carPriceEditText;
    private EditText downPaymentEditText;
    private RadioGroup loanTermRadioGroup;

    // Make reference to model (CarLoan)
    private CarLoan loan;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the controller variables to the view
        carPriceEditText.findViewById( R.id.carPriceEditText);
        downPaymentEditText.findViewById(R.id.downPaymentEditText);
        loanTermRadioGroup.findViewById(R.id.loanTermRadioGroup);
    }
}
