package com.example.OneToManyHW.Components;

import com.example.OneToManyHW.models.File;
import com.example.OneToManyHW.models.Folder;
import com.example.OneToManyHW.models.User;
import com.example.OneToManyHW.repositories.FileRepository;
import com.example.OneToManyHW.repositories.FolderRepository;
import com.example.OneToManyHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user = new User("Jim");
        userRepository.save(user);

        Folder folder = new Folder();
        folderRepository.save(folder);

        File file = new File("Document", "exe", 200, folder );
        fileRepository.save(file);


    }
}
