package com.ala.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String, Integer> {

    @Override
    public Integer handleRequest(String input, Context context) {
        LambdaLogger lambdaLogger = context.getLogger();
        lambdaLogger.log("input: " + input);
        return 42;
    }
}
