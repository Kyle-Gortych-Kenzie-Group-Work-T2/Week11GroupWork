package com.kenzie.groupwork.discussioncli.cli;


import com.kenzie.groupwork.discussioncli.handler.CreateTopicHandler;
import com.kenzie.groupwork.discussioncli.handler.CreateTopicMessageHandler;
import com.kenzie.groupwork.discussioncli.handler.ViewTopicMessagesHandler;
import dagger.Component;

import javax.inject.Singleton;
@Singleton
@Component(modules = {ATAUserInputModule.class, ExitHandlerModule.class, MapperModule.class})
public interface DiscussionCliComponent {
    DiscussionCli provideDiscussionCli();

    ViewTopicMessagesHandler provideViewTopicMessagesHandler();






}
