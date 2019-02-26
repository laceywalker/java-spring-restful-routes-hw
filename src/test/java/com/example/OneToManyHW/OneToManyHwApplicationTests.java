package com.example.OneToManyHW;

import com.example.OneToManyHW.repositories.FileRepository;
import com.example.OneToManyHW.repositories.FolderRepository;
import com.example.OneToManyHW.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyHwApplicationTests {


	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	public void contextLoads() {
	}

}
