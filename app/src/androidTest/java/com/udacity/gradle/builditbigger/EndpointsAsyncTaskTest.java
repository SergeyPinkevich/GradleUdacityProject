package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.util.Pair;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * @author Sergey Pinkevich
 */
public class EndpointsAsyncTaskTest {

    @Test
    public void testVerifyJoke() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        EndpointsAsyncTask testTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                if (result != null){
                    assertTrue(result.length() > 0);
                    latch.countDown();
                }
            }
        };
        testTask.execute(new Pair<Context, String>(InstrumentationRegistry.getContext(), "Sergey"));
        latch.await();
    }
}