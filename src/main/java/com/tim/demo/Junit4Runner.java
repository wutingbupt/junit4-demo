package com.tim.demo;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class Junit4Runner extends BlockJUnit4ClassRunner{

    public Junit4Runner(Class<?> klass) throws InitializationError {
        super(klass);
    }
    
    @Override
    public void run(final RunNotifier notifier){
        notifier.addListener(new Junit4Listener());
        super.run(notifier);
    }
}
