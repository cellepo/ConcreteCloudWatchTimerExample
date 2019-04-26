package com.filocomune.automation.serverless.awslambda.file;

import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
import com.filocomune.automation.serverless.awslambda.CloudWatchTimerLambda;

import static com.filocomune.automation.serverless.awslambda.util.LambdaRuntimeUtil.log;

import java.io.File;

public class NewFileLambda extends CloudWatchTimerLambda {

    private File localFile;

    @Override
    protected void process(ScheduledEvent scheduledEvent){
        localFile = new File("/tmp/NewFileLambda");
        log("Created localFile: " + localFile.getAbsolutePath());
    }

}
