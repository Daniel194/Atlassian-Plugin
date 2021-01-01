package ut.tech.lungu.atlassian.plugin;

import org.junit.Test;
import tech.lungu.atlassian.plugin.api.MyPluginComponent;
import tech.lungu.atlassian.plugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}