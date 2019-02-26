package com.example.OneToManyHW.components;

import com.example.OneToManyHW.models.File;
import com.example.OneToManyHW.models.Folder;
import com.example.OneToManyHW.models.User;
import com.example.OneToManyHW.repositories.FileRepository;
import com.example.OneToManyHW.repositories.FolderRepository;
import com.example.OneToManyHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
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

        User user2 = new User("Tony");
        userRepository.save(user2);

        Folder folder = new Folder("the big one", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("the small one", user2);
        folderRepository.save(folder2);

        File file = new File("Document", "exe", 200, folder);
        fileRepository.save(file);


    }
}
