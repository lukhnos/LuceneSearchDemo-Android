package org.lukhnos.lucenesearchdemo;

import android.app.Application;
import android.test.ApplicationTestCase;

public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testTrivial() {
        assertTrue(true);
    }
}
