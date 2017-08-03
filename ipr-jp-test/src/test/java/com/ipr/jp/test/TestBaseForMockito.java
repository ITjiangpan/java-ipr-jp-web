package com.ipr.jp.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;

/**     
 *
 * @author jiangpan 
 * @title TestBaseForMockito.java
 * @date 2017年6月2日 
 *     
 */
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/applicationContext-test.xml"})
public class TestBaseForMockito {
	
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

}
