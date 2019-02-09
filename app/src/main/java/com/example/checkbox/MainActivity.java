package com.example.checkbox;

import android.preference.CheckBoxPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox java,python,c,cpp,kotlin;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        java = findViewById(R.id.checkbox1);
        python = findViewById(R.id.checkbox2);
        c = findViewById(R.id.checkbox3);
        cpp = findViewById(R.id.checkbox4);
        kotlin = findViewById(R.id.checkbox5);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result=new StringBuilder();
                result.append("Selected Courses: ");
                if(java.isChecked()){
                    result.append("\nJava");

                }
                if(python.isChecked()){
                    result.append("\nPython");

                }
                if(c.isChecked()){
                    result.append("\nC");

                }
                if(cpp.isChecked()){
                    result.append("\nC++");

                }
                if(kotlin.isChecked()){
                    result.append("Kotlin");
                }

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch(view.getId()){
            case R.id.checkbox1:
                str = checked? "Java Selected":"Java Deselected";
            break;
            case R.id.checkbox2:
                str = checked? "Python Selected":"Java Deselected";
            break;
            case R.id.checkbox3:
                str = checked? "C Selected":"Java Deselected";
            break;
            case R.id.checkbox4:
                str = checked? "C++ Selected":"Java Deselected";
            break;
            case R.id.checkbox5:
                str = checked? "Kotlin Selected":"Java Deselected";
            break;
        }
        Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();

    }
}
