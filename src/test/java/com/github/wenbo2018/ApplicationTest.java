package com.github.wenbo2018;


import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class ApplicationTest {

//    private MockMvc mvc;
//    @Before
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
//    }
//
//    @Resource
//    private UserDao userDao;
//    @Test
//    public void testAddUser(){
//        User user=new User();
//        user.setAge(10);
//        user.setName("wenbo");
//        userDao.addUser(user);
//    }

}
