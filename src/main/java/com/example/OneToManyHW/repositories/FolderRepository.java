package com.example.OneToManyHW.repositories;

import com.example.OneToManyHW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
