package com.npp_telda.dir_regions.controller;

import com.npp_telda.dir_regions.mapper.DirectoryMapper;
import com.npp_telda.dir_regions.model.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dir")
public class DirectoryController {

    @Autowired
    DirectoryMapper directoryMapper;

    @GetMapping("/all")
    public List<Directory> getAll() {
        return directoryMapper.getAllDirectories();
    }

    @GetMapping("/3")
    public Directory getDirectory(Long id) {
        return directoryMapper.getDirectoryById(3L);
    }

    @GetMapping("/{title}")
    public List<Directory> getByTitle(String title) {
        return directoryMapper.getDirectoriesByTitle(title);
    }

    @GetMapping("/{shortTitle}")
    public List<Directory> getByShortTitle(String shortTitle) {
        return directoryMapper.getDirectoriesByShortTitle(shortTitle);
    }

//    @PostMapping("/add")
//    public void addDirectory(String title, String shortTitle) {
//        directoryMapper.addDirectory(title, shortTitle);
//    }
}
