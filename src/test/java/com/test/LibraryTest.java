/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.lib.Library;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        //comment
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
