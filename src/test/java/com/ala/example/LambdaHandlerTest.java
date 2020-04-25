package com.ala.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LambdaHandlerTest {

    @Mock
    private Context context;

    @Mock
    private LambdaLogger logger;

    private LambdaHandler lambdaHandler = new LambdaHandler();

    @Test
    void shouldReturn42() {
        Mockito.when(context.getLogger()).thenReturn(logger);
        assertThat(lambdaHandler.handleRequest("foo", context)).isEqualTo(42);
    }

}