package com.sameh.dagger2first;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {
    /*
    dagger first go to class
    1- and go to constructor (constructor injection)
    2- and go to fields in class (arguments) (field injection)
    3- and go to (method injection)
     */

    // must be public and not final or private
    // field injection
    @Inject
    Farm farm;

    Revier revier;
    int sugar;
    int milk;

    // constructor injection
    @Inject
    public Coffee(Revier revier, @Sugar int sugar, @Milk int milk) {
        this.revier = revier;
        this.sugar = sugar;
        this.milk = milk;
    }

    // method injection
    @Inject
    public void connectElectricity() {
        Log.d("myTAG", "connectElectricity: connecting .....");
    }

    public String getCoffeeCup() {
        return farm.getBeans() + " + " + revier.getWater() + " sugar: " + sugar + " milk: " + milk;
    }
}
