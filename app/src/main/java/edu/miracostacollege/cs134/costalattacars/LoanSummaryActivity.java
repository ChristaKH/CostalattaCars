package edu.miracostacollege.cs134.costalattacars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoanSummaryActivity extends AppCompatActivity
{

    private TextView MonthlyPaymentAmount;
    private TextView carStickerPriceAmount;
    private TextView SalesTaxRateAmount;
    private TextView TaxAmount;
    private TextView DownPaymentAmount;
    private TextView TotalCostAmount;
    private TextView BorrowedAmount;
    private TextView InterestAmount;
    private TextView LoanTermAmount;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_summary);

        // Connect instance variables to values in xml
        MonthlyPaymentAmount = findViewById( R.id.MonthlyPaymentAmount);
        carStickerPriceAmount = findViewById(R.id.carStickerPriceAmount);
        SalesTaxRateAmount = findViewById(R.id.SalesTaxRateAmount);
        TaxAmount = findViewById(R.id.TaxAmount);
        DownPaymentAmount = findViewById(R.id.DownPaymentAmount);
        TotalCostAmount = findViewById(R.id.TotalCostAmount);
        BorrowedAmount = findViewById(R.id.BorrowedAmount);
    }
}
