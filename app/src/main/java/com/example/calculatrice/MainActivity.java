package com.example.calculatrice;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button bu0, bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, buClear, buBack, buMod, buDiv, buMul, buSous, buSub, buEqual, buPoint, buPar;
    private TextView txtPetite, txtGrand ;
    private String result , res ,resultP;
    private boolean checkPar = false ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find All Button and TextView
        {
            // Find Button Numbers
            {
                bu0 = findViewById(R.id.bu0ID);
                bu1 = findViewById(R.id.bu1ID);
                bu2 = findViewById(R.id.bu2ID);
                bu3 = findViewById(R.id.bu3ID);
                bu4 = findViewById(R.id.bu4ID);
                bu5 = findViewById(R.id.bu5ID);
                bu6 = findViewById(R.id.bu6ID);
                bu7 = findViewById(R.id.bu7ID);
                bu8 = findViewById(R.id.bu8ID);
                bu9 = findViewById(R.id.bu9ID);
            }

            // Find Button Operation
            {
                buMod = findViewById(R.id.buModID);
                buDiv = findViewById(R.id.buDivID);
                buMul = findViewById(R.id.buMulID);
                buSous = findViewById(R.id.buSousID);
                buSub = findViewById(R.id.buSubID);
                buEqual = findViewById(R.id.buEqualID);
            }

            // Find Other Buttons
            {
                buClear = findViewById(R.id.buClearID);
                buBack = findViewById(R.id.buBackID);
                buPar = findViewById(R.id.buParID);
                buPoint = findViewById(R.id.buPointID);
            }

            // Find Text View
            {
                txtPetite = findViewById(R.id.txtPetiteID);
                txtGrand = findViewById(R.id.txtGrandID);
            }
        }

        // Listener All Button
        {
            // Listener Button Numbers
            {
                bu0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "0");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "0");
                        }
                    }
                });

                bu1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "1");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "1");
                        }
                    }
                });

                bu2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "2");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "2");
                        }
                    }
                });

                bu3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "3");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "3");
                        }
                    }
                });

                bu4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "4");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "4");
                        }
                    }
                });

                bu5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "5");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "5");
                        }
                    }
                });

                bu6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "6");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "6");
                        }
                    }
                });

                bu7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "7");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "7");
                        }
                    }
                });

                bu8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "8");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "8");
                        }
                    }
                });

                bu9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if(res.isEmpty()) {
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "9");
                        } else {
                            txtPetite.setText("");
                            txtGrand.setText("");
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "9");
                        }
                    }
                });
            }

            // Listener Button Operation
            {
                buMod.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = txtPetite.getText().toString();

                        if(!result.isEmpty()){
                            result = result.replaceAll("×", "*");
                            result = result.replaceAll("%", "/100");
                            result = result.replaceAll("÷", "/");

                            double finalR = eval(result);
                            finalR = finalR / 100;

                            txtGrand.setText("=" + String.valueOf(finalR));
                        } else{

                        }
                    }
                });

                buDiv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if (res.isEmpty()){
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "÷");
                        } else {
                            res = res.substring(1,res.length()-0);
                            result = res + "÷";
                            txtPetite.setText(result);
                            txtGrand.setText("");
                        }
                    }
                });

                buMul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if (res.isEmpty()){
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "×");
                        } else {
                            res = res.substring(1,res.length()-0);
                            result = res + "×";
                            txtPetite.setText(result);
                            txtGrand.setText("");
                        }
                    }
                });

                buSous.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if (res.isEmpty()){
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "-");
                        } else {
                            res = res.substring(1,res.length()-0);
                            result = res + "-";
                            txtPetite.setText(result);
                            txtGrand.setText("");
                        }
                    }
                });

                buSub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if (res.isEmpty()){
                            result = txtPetite.getText().toString();
                            txtPetite.setText(result + "+");
                        } else {
                            res = res.substring(1,res.length()-0);
                            result = res + "+";
                            txtPetite.setText(result);
                            txtGrand.setText("");
                        }
                    }
                });

                buEqual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        res = txtGrand.getText().toString();
                        double finalR;
                        if(res.isEmpty()){
                            result = txtPetite.getText().toString();

                            result = result.replaceAll("×","*");
                            result = result.replaceAll("%","/100");
                            result = result.replaceAll("÷","/");

                            finalR = eval(result);

                            txtGrand.setText("="+String.valueOf(finalR));
                        } else {
                            result = txtPetite.getText().toString();

                            result = result.replaceAll("×","*");
                            result = result.replaceAll("%","/100");
                            result = result.replaceAll("÷","/");

                            finalR = eval(result);

                            txtGrand.setText("="+String.valueOf(finalR));
                        }

                    }
                });
            }

            // Listener Other Button
            {
                buClear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtPetite.setText("");
                        txtGrand.setText("");
                    }
                });

                buBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        result = txtPetite.getText().toString();
                        res = txtGrand.getText().toString();
                        if (result.isEmpty()) {
                            // On ne peut pas effacer le vide
                        } else {
                            if(res.isEmpty()) {
                                result = result.substring(0, result.length() - 1);
                                txtPetite.setText(result);
                            } else {
                                // One ne peut pas effacer le processus lorsque le résultat apparait
                            }
                        }
                    }
                });

                buPoint.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        resultP = txtPetite.getText().toString();
                        res = txtGrand.getText().toString();
                        if (res.isEmpty()) {
                            if (resultP.isEmpty()){
                                result = txtPetite.getText().toString();
                                txtPetite.setText(result + "0.");
                            } else{
                                result = txtPetite.getText().toString();
                                txtPetite.setText(result + ".");
                            }
                        } else {
                            // On ne peut pas ajouter un point lorsque le résultat apparait
                        }
                    }
                });

                buPar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        res = txtGrand.getText().toString();
                        if (res.isEmpty()){
                            if (checkPar) {
                                result = txtPetite.getText().toString();
                                txtPetite.setText(result + ")");
                                checkPar = false;
                            } else {
                                result = txtPetite.getText().toString();
                                txtPetite.setText(result + "(");
                                checkPar = true;
                            }
                        } else {
                            // On ne peut pas ajouter de parenthéses lorsque le résultat apparait
                        }

                    }
                });
            }
        }

    }

    // eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}