package com.example.clarissapink.leafapp.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.clarissapink.leafapp.EventHandler.EventHandler;
import com.example.clarissapink.leafapp.R;
/**
 * This class will manage the footer buttons and displays Debt Repayment result
 *
 * @author YongLing
 *
 */
public class ApplicableGrantResultView extends AppCompatActivity {

    EventHandler eventHandler;

    /**
     * This method will save the state of the application in a bundle
     * @param savedInstanceState save state created previously
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicable_grant_result);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


        Bundle grantResult = getIntent().getExtras();
        eventHandler = grantResult.getParcelable("eventHandler");

        /**
         * Displays the loan amount user entered in ApplicableGrantView screen
         */
        TextView typeOfApplicantView = (TextView) findViewById(R.id.displayApplicantType);
        TextView monthlyIncomeView = (TextView) findViewById(R.id.displayIncome);
        TextView salesLaunchView = (TextView) findViewById(R.id.displayPeriod);
        TextView grantedAmtView = (TextView) findViewById(R.id.displayGrantResult);

        typeOfApplicantView.setText(eventHandler.getSelectedTypeOfApplicant());
        monthlyIncomeView.setText(eventHandler.getSelectedMonthlyIncome());
        salesLaunchView.setText(eventHandler.getSelectedSalesLaunch());
        grantedAmtView.setText(eventHandler.findGrant());

    }

    /**
     * This method navigates to FlatAvailableView
     * @param view stores what the user interact with the button
     */
    public void btn1(View view) {
        Intent intent = new Intent(this, FlatAvailableView.class);
        intent.putExtra("eventHandler", eventHandler);
        startActivity(intent);
    }

    /**
     * This method navigates to AffordableFlatView
     * @param view stores what the user interact with the button
     */
    public void btn2(View view) {
        Intent intent = new Intent(this, AffordableFlatView.class);
        intent.putExtra("eventHandler", eventHandler);
        startActivity(intent);
    }

    /**
     * This method navigates to ApplicableGrantView
     * @param view stores what the user interact with the button
     */
    public void btn3(View view) {
        Intent intent = new Intent(this, ApplicableGrantView.class);
        intent.putExtra("eventHandler", eventHandler);
        startActivity(intent);
    }

    /**
     * This method navigates to DebtRepaymentView
     * @param view stores what the user interact with the button
     */
    public void btn4(View view) {
        Intent intent = new Intent(this, DebtRepaymentView.class);
        intent.putExtra("eventHandler", eventHandler);
        startActivity(intent);
    }

}
