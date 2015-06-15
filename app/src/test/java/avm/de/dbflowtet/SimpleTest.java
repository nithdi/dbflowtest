package avm.de.dbflowtet;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class SimpleTest {

    @Test
    public void testSomething() throws Exception {
        Assert.assertFalse(false);
    }

    @Test
    public void testElse() throws Exception {
        Assert.assertFalse(false);
    }

    @Test
    public void testSomethingElse() throws Exception {
        Assert.assertFalse(false);
    }

    @Test
    public void testMe() throws Exception {
        Assert.assertFalse(true);
    }

}