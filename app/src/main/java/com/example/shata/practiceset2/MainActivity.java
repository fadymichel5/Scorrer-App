package com.example.shata.practiceset2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int inTeamA=0;
    int inTeamB=0;
    int outTeamA=0;
    int outTeamB=0;
    int foulTeamA=0;
    int foulTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
    }

    public void displayInTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.in_A);
        scoreView.setText(String.valueOf(score));}
    public void displayOutTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.out_A);
        scoreView.setText(String.valueOf(score));}
    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_A);
        scoreView.setText(String.valueOf(score));}
    public void addInTeamA(View v ){
        inTeamA++;
        displayInTeamA(inTeamA);}
    public void addOutTeamA(View v){
        outTeamA++;
        displayOutTeamA(outTeamA);}
    public void addFoulTeamA(View v){
        foulTeamA++;
        displayFoulTeamA(foulTeamA);}
    public void displayInTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.in_B);
        scoreView.setText(String.valueOf(score));}
    public void displayOutTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.out_B);
        scoreView.setText(String.valueOf(score));}
    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_B);
        scoreView.setText(String.valueOf(score));}
    public void addInTeamB(View v ){
        inTeamB++;
        displayInTeamB(inTeamB);}
    public void addOutTeamB(View v){
        outTeamB++;
        displayOutTeamB(outTeamB);}
    public void addFoulTeamB(View v){
        foulTeamB++;
        displayFoulTeamB(foulTeamB);}
    public void reset(View v){
        inTeamA=0;
        inTeamB=0;
        outTeamA=0;
        outTeamB=0;
        foulTeamA=0;
        foulTeamB=0;
        displayInTeamB(0);
        displayOutTeamA(0);
        displayInTeamA(0);
        displayOutTeamB(0);
        displayFoulTeamA(0);
        displayFoulTeamB(0);}
}