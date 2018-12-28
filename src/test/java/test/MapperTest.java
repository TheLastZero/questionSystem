package test;

import com.zerozrz.bean.Survey;
import com.zerozrz.bean.UserInfo;
import com.zerozrz.dao.SurveyMapper;
import com.zerozrz.dao.UserInfoMapper;
import com.zerozrz.utils.MD5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 测试dao层的工作
 * @author zero
 * 
 * 推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 * 1、导入SpringTest模块
 * 2、使用@ContextConfiguration 指定spring配置文件的位置
 * 3、直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

	@Autowired
	UserInfoMapper userInfoMapper;


//	@Autowired
//	SqlSession sqlSession;
//	
//	@Test
//	public void testSelect(){
//		System.out.println(userInfoMapper);
//		
//		List<UserInfo> userInfoList = userInfoMapper.selectByExample(null);
//		System.out.println(userInfoList);
//	}
	
	/**
	 * 测试crud
	 */
	@Test
	public void testCRUD(){
		//1、创建SpringIOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、从容器中获取mapper
		UserInfoMapper userInfoMapper = ioc.getBean(UserInfoMapper.class);
		System.out.println(userInfoMapper);

		List<UserInfo> userInfoList = userInfoMapper.selectByExample(null);

		System.out.println(userInfoList);


		SurveyMapper surveyMapper = ioc.getBean(SurveyMapper.class);
		System.out.println(surveyMapper);

		List<Survey> surveyList = surveyMapper.selectByExample(null);

		System.out.println(surveyList);

		//1、插入几个部门
//		departmentMapper.insertSelective(new Department(null, "开发部"));
//		departmentMapper.insertSelective(new Department(null, "测试部"));
		
		//2、生成员工数据，测试员工插入
//		employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 1));
		
		
		//3、批量插入多个员工：批量，使用可以执行批量操作的sqlSession
		/*for(){
			employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 1));
		}*/
		
//		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//		for(int i=0; i<1000;i++){
//			String uid = UUID.randomUUID().toString().substring(0,5)+i;
//			mapper.insertSelective(new Employee(null,uid,"M",uid+"@atguigu.com",1));
//		}
//		
//		System.out.println("批量完成");
		
		 
	}
	
	@Test
	public void testSalt(){
		String s = MD5.encryptPassword("123", "rty");
		System.out.println(s);
	}
	
	
	
}
