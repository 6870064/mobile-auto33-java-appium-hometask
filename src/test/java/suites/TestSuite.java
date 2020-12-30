package suites;

import com.company.tests.Android.ArticleTests;
import com.company.tests.Android.ChangeAppConditionTests;
import com.company.tests.Android.HomeTaskTests;
import com.company.tests.Android.SearchTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ArticleTests.class,
        ChangeAppConditionTests.class,
        HomeTaskTests.class,
        SearchTests.class
})
public class TestSuite {
}
