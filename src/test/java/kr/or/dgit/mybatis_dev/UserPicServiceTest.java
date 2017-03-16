package kr.or.dgit.mybatis_dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.services.UserPicService;

//메소드 실행순서
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserPicServiceTest {
	private static UserPicService userPicService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		userPicService = new UserPicService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		userPicService = null;
	}

	@Before
	public void setUp() {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() {
		System.out.println("tearDown()");
	}

	///////////////////////////////
	@Test
	public void aTestInsertUserPic() {
		byte[] pic = null;
		// System.getProperty("user.dir")D:\workspace_mybatis\mybatis_dev까지 나옴
		File file = new File(System.getProperty("user.dir")+"\\Datafiles\\jjh.jpg"); 
		try (InputStream is = new FileInputStream(file);){
			// try() 안에 넣어서 자동 close 하는 건 1.8부터 된다. 1.6, 1.7일 경우 안 되므로 finally 해서 close()해줘야 함.
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		UserPic userPic = new UserPic(1, "전지현", pic, "인어공주 전지현");
		int res = userPicService.insertUserPic(userPic);
		Assert.assertEquals(1, res);
	}
	
	
	@Test
	public void bTestSelectUserPicById() {
		
	}
}
