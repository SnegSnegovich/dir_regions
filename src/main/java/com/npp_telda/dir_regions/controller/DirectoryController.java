package com.npp_telda.dir_regions.controller;

import com.npp_telda.dir_regions.mapper.DirectoryMapper;
import com.npp_telda.dir_regions.model.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/id/{id}")
    public Directory getDirectory(@PathVariable("id") Long id) {
        return directoryMapper.getDirectoryById(id);
    }

    @GetMapping("/title/{title}")
    public List<Directory> getByTitle(@PathVariable("title") String title) {
        return directoryMapper.getDirectoriesByTitle(title);
    }

    @GetMapping("/shortTitle/{shortTitle}")
    public List<Directory> getByShortTitle(@PathVariable("shortTitle") String shortTitle) {
        return directoryMapper.getDirectoriesByShortTitle(shortTitle);
    }

    @PostMapping("/add")
    public void addDir(@RequestBody Directory directory) {
        directoryMapper.addDirectory(directory);
       }
}
