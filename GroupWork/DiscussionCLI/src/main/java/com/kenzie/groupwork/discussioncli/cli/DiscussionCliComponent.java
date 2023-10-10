package com.kenzie.groupwork.discussioncli.cli;


import dagger.Component;

import javax.inject.Singleton;
@Singleton
@Component(modules = {ATAUserInputModule.class, ExitHandlerModule.class, MapperModule.class})
public interface DiscussionCliComponent {
    DiscussionCli provideDiscussionCli();
}
