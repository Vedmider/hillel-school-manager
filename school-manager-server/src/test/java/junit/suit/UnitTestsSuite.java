package junit.suit;

import junit.test.com.hillel.application.SchoolServiceTest;
import org.junit.platform.suite.api.*;

import static junit.suit.Constants.INTEGRATION_TEST;
import static junit.suit.Constants.UNIT_TEST;

@IncludeTags(UNIT_TEST)
@ExcludeTags(INTEGRATION_TEST)
@SelectPackages("junit.test")
@SelectClasses(SchoolServiceTest.class)
@ExcludePackages("co.pipin.the.first")
@Suite
public class UnitTestsSuite {
}
