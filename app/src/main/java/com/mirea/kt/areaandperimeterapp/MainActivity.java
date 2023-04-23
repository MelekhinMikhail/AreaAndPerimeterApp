package com.mirea.kt.areaandperimeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mirea.kt.areaandperimeterapp.util.AreaAndPerimeterCalculator;
import com.mirea.kt.areaandperimeterapp.util.Valid;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView resultTriangle = findViewById(R.id.tvResultTriangle);
        TextView resultRectangle = findViewById(R.id.tvResultRectangle);
        EditText triangleA = findViewById(R.id.etTriangleA);
        EditText triangleB = findViewById(R.id.etTriangleB);
        EditText triangleC = findViewById(R.id.etTriangleC);
        EditText rectangleA = findViewById(R.id.etRectangleA);
        EditText rectangleB = findViewById(R.id.etRectangleB);

        button.setOnClickListener(x -> {
            Log.i("area_and_square_app_tag", "Click submit button");
            String trA = triangleA.getText().toString();
            String trB = triangleB.getText().toString();
            String trC = triangleC.getText().toString();

            String recA = rectangleA.getText().toString();
            String recB = rectangleB.getText().toString();

            if (Valid.isValidNumber(trA) && Valid.isValidNumber(trB) && Valid.isValidNumber(trC)
                && Valid.isValidNumber(recA) && Valid.isValidNumber(recB)) {

                double triangleArea = AreaAndPerimeterCalculator.calcTriangleArea(Double.parseDouble(trA), Double.parseDouble(trB),
                        Double.parseDouble(trC));

                double trianglePerimeter = AreaAndPerimeterCalculator.calcTrianglePerimeter(
                        Double.parseDouble(trA), Double.parseDouble(trB), Double.parseDouble(trC));

                double rectangleArea = AreaAndPerimeterCalculator.calcRectangleArea(
                        Double.parseDouble(recA), Double.parseDouble(recB));

                double rectanglePerimeter = AreaAndPerimeterCalculator.calcRectanglePerimeter(
                        Double.parseDouble(recA), Double.parseDouble(recB));

                String textTriangle = "Треугольник: S = " + String.format("%.3f",triangleArea) + "  P = " + trianglePerimeter;
                String textRectangle = "Прямоугольник: S = " + rectangleArea + "  P = " + rectanglePerimeter;
                resultTriangle.setText(textTriangle);
                resultRectangle.setText(textRectangle);
            } else {
                resultTriangle.setText("Неправильный формат введенных чисел!");
                resultRectangle.setText("");
            }
        });
    }
}