package com.kenzie.groupwork.discussioncli.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class TopicMessageDaoTest {
    // PARTICIPANTS - add at least one relevant test (remember to mock DynamoDBMapper!)
    // You can use MemberDaoTest as a guide!
    private TopicMessageDao topicMessageDao;

    @Mock
    private DynamoDBMapper mapper;


    @BeforeEach
    public void setup() {
        initMocks(this);
        topicMessageDao = new TopicMessageDao(mapper);
    }


    @Test
    void saveTopicMessage_withValidTopicMessage_shouldSaveSuccessfully() {
        // GIVEN
        // creating a new topic message
        TopicMessage newTopic = new TopicMessage();

        // ensures DynamoDB can handle the new topic message for saving

        doNothing().when(mapper).save(newTopic);

        // WHEN
        //save the new topic message and get the result
        TopicMessage result = topicMessageDao.saveTopicMessage(newTopic);

        // THEN
        //check if the result is the same as the topic message we initially created
        assertEquals(newTopic, result);

    }
}
