package com.example.parul.mapwithfloat;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class list extends AppCompatActivity {

    EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
    Button e11, e21, e31, e41, e51, e61, e71, e81, e91, e101;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    SharedPreferences sharedPreferences;
    Button b11;
    int w1 = 0, w2 = 0, w3 = 0, w4 = 0, w5 = 0, w6 = 0, w7=0, w8=0, w9=0, w10=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        e1 = findViewById(R.id.one);
        e2 = findViewById(R.id.two);
        e3 = findViewById(R.id.three);
        e4 = findViewById(R.id.four);
        e5 = findViewById(R.id.five);
        e6 = findViewById(R.id.six);
        e7 = findViewById(R.id.six);
        e8 = findViewById(R.id.six);
        e9 = findViewById(R.id.six);
        e10 = findViewById(R.id.six);
        e11 = findViewById(R.id.but1);
        e21 = findViewById(R.id.but2);
        e31 = findViewById(R.id.but3);
        e41 = findViewById(R.id.but4);
        e51 = findViewById(R.id.but5);
        e61 = findViewById(R.id.but6);
        e71 = findViewById(R.id.but7);
        e81 = findViewById(R.id.but8);
        e91 = findViewById(R.id.but9);
        e101 = findViewById(R.id.but10);
        b1 = findViewById(R.id.but11);
        b2 = findViewById(R.id.but22);
        b3 = findViewById(R.id.but33);
        b4 = findViewById(R.id.but44);
        b5 = findViewById(R.id.but55);
        b6 = findViewById(R.id.but66);
        b7 = findViewById(R.id.but77);
        b8 = findViewById(R.id.but88);
        b9 = findViewById(R.id.but99);
        b10 = findViewById(R.id.but1010);
        b11 = findViewById(R.id.button);
        sharedPreferences = getSharedPreferences("Myprefs", Context.MODE_PRIVATE);
        e11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1 = w1 + 1;
                display1(w1);
            }
        });
        e21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w2 = w2 + 1;
                display2(w2);
            }
        });
        e31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w3 = w3 + 1;
                display3(w3);
            }
        });
        e41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w4 = w4 + 1;
                display4(w4);
            }
        });
        e51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w5 = w5 + 1;
                display5(w5);
            }
        });
        e61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w6 = w6 + 1;
                display6(w6);
            }
        });
        e71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w7 = w7 + 1;
                display7(w7);
            }
        });
        e81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w8 = w8 + 1;
                display8(w8);
            }
        });
        e91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w9 = w9 + 1;
                display9(w9);
            }
        });
        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w10 = w10 + 1;
                display10(w10);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1 = w1 - 1;
                display1(w1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w2 = w3 - 1;
                display2(w2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w3 = w3 - 1;
                display3(w3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w4 = w4 - 1;
                display4(w4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w5 = w5 - 1;
                display5(w5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w6 = w6 - 1;
                display7(w6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w7 = w7 - 1;
                display7(w7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w8 = w8 - 1;
                display8(w8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w9 = w9 - 1;
                display9(w9);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w10 = w10 - 1;
                display10(w10);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                String item1 = sharedPreferences.getString("e1", null);
                String item2 = sharedPreferences.getString("e2", null);
                String item3 = sharedPreferences.getString("e3", null);
                String item4 = sharedPreferences.getString("e4", null);
                String item5 = sharedPreferences.getString("e5", null);
                String item6 = sharedPreferences.getString("e6", null);
                String item7 = sharedPreferences.getString("e7", null);
                String item8 = sharedPreferences.getString("e8", null);
                String item9 = sharedPreferences.getString("e9", null);
                String item10 = sharedPreferences.getString("e10", null);
                int e11 = sharedPreferences.getInt("e11", 0);
                int e21 = sharedPreferences.getInt("e21", 0);
                int e31 = sharedPreferences.getInt("e31", 0);
                int e41 = sharedPreferences.getInt("e41", 0);
                int e51 = sharedPreferences.getInt("e51", 0);
                int e61 = sharedPreferences.getInt("e61", 0);
                int e71 = sharedPreferences.getInt("e71", 0);
                int e81 = sharedPreferences.getInt("e81", 0);
                int e91 = sharedPreferences.getInt("e91", 0);
                int e101 = sharedPreferences.getInt("e101", 0);
                if (sharedPreferences.contains(item1)) {
                    e1.setText(sharedPreferences.getString("item1", null));
                }
                if (sharedPreferences.contains(item2)) {
                    e2.setText(sharedPreferences.getString("item2", null));
                }
                if (sharedPreferences.contains(item3)) {
                    e3.setText(sharedPreferences.getString("item3", null));
                }
                if (sharedPreferences.contains(item4)) {
                    e4.setText(sharedPreferences.getString("item4", null));
                }
                if (sharedPreferences.contains(item5)) {
                    e5.setText(sharedPreferences.getString("item5", null));
                }
                if (sharedPreferences.contains(item6)) {
                    e6.setText(sharedPreferences.getString("item6", null));
                }
                if (sharedPreferences.contains(item6)) {
                    e7.setText(sharedPreferences.getString("item6", null));
                }
                if (sharedPreferences.contains(item6)) {
                    e8.setText(sharedPreferences.getString("item6", null));
                }
                if (sharedPreferences.contains(item6)) {
                    e9.setText(sharedPreferences.getString("item6", null));
                }
                if (sharedPreferences.contains(item6)) {
                    e10.setText(sharedPreferences.getString("item6", null));
                }
                check(w1, w2, w3, w4, w5, w6, w7, w8, w9, w10);
            }
        });
    }

    private void display1(int number) {
        TextView displayInteger = findViewById(R.id.tv1);
        displayInteger.setText("" + number);
    }

    private void display2(int number) {
        TextView displayInteger = findViewById(R.id.tv2);
        displayInteger.setText("" + number);
    }

    private void display3(int number) {
        TextView displayInteger = findViewById(R.id.tv3);
        displayInteger.setText("" + number);
    }

    private void display4(int number) {
        TextView displayInteger = findViewById(R.id.tv4);
        displayInteger.setText("" + number);
    }

    private void display5(int number) {
        TextView displayInteger = findViewById(R.id.tv5);
        displayInteger.setText("" + number);
    }

    private void display7(int number) {
        TextView displayInteger = findViewById(R.id.tv7);
        displayInteger.setText("" + number);
    }
    private void display8(int number) {
        TextView displayInteger = findViewById(R.id.tv8);
        displayInteger.setText("" + number);
    }
    private void display9(int number) {
        TextView displayInteger = findViewById(R.id.tv9);
        displayInteger.setText("" + number);
    }
    private void display10(int number) {
        TextView displayInteger = findViewById(R.id.tv10);
        displayInteger.setText("" + number);
    }
    private void display6(int number) {
        TextView displayInteger = findViewById(R.id.tv6);
        displayInteger.setText("" + number);
    }

    private void check(int w1, int w2, int w3, int w4, int w5, int w6, int w7, int w8, int w9, int w10) {
        int sum = w1 + w2 + w3 + w4 + w5 + w6 + w7 + w8 + w9 + w10;
        TextView weight = findViewById(R.id.wt);
        weight.setText("" + sum);
        if (sum > 12) {
            Toast.makeText(list.this, "The weight of the bag has exceeded 12kgs. Please reduce some things.", Toast.LENGTH_SHORT).show();
        }
    }
}
