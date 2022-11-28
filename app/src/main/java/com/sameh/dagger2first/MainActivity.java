package com.sameh.dagger2first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent appComponent = ((MainApplication) getApplication()).getAppComponent();

        CoffeeComponent coffeeComponent = appComponent.getCoffeeComponentBuilder()
                .milk(4).sugar(2).build();
        coffeeComponent.inject(this);

        Log.d("myTAG", "onCreate: " +
                "\n coffee1: " + coffee +
                "\n coffee2: " + coffee2 +

                "\n river for coffee1: " + coffee.revier +
                "\n river for coffee2: " + coffee2.revier +

                "\n farm for coffee1: " + coffee.farm +
                "\n farm for coffee2: " + coffee2.farm
                );



        /*
        old
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.create();
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder()
                .coffeeModule(new CoffeeModule(3)).build();

        coffee.connectElectricity();
        Log.d("myTAG", "onCreate: "+ coffeeComponent.getCoffee().getCoffeeCup());
        */
    }
}