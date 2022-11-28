package com.sameh.dagger2first;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {

    CoffeeComponent.Builder getCoffeeComponentBuilder();

}
