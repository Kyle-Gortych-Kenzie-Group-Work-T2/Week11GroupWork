package com.kenzie.groupwork.discussioncli.cli;

import com.kenzie.groupwork.discussioncli.handler.ExitHandler;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ExitHandlerModule {

    // Provide ExitHandler as a singleton
    @Provides
    @Singleton
    public ExitHandler provideExitHandler() {
        return new ExitHandler(provideDiscussionCliState());
    }

    @Provides
    @Singleton
    public DiscussionCliState provideDiscussionCliState() {
        return new DiscussionCliState();
    }
}
