package com.kenzie.groupwork.discussioncli.cli;

import com.kenzie.groupwork.discussioncli.cli.input.ATAUserInput;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;


@Module
public class ATAUserInputModule {

    // Provide ATAUserInput as a singleton
    @Provides
    @Singleton
    public ATAUserInput provideATAUserInput() {
        return new ATAUserInput();
    }
}
