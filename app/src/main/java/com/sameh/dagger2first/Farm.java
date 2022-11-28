package com.sameh.dagger2first;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Farm {
    @Inject
    public Farm() {
    }

    public String getBeans() {
        return "Beans";
    }
}
