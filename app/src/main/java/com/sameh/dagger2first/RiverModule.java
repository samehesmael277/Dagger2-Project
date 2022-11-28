package com.sameh.dagger2first;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

    @Singleton
    @Provides
    Revier provideRevier() {
        return new Revier();
    }

        /*
     int sugar;

    public CoffeeModule(int sugar) {
        this.sugar = sugar;

    }
     */

    /*
    @Provides
    int provideSugar() {
        return sugar;
    }
    */

}
