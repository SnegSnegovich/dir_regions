package com.npp_telda.dir_regions.controller;

import com.npp_telda.dir_regions.mapper.DirectoryMapper;
import com.npp_telda.dir_regions.model.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dirs")
public class DirectoryController {

    @Autowired
    DirectoryMapper directoryMapper;

    @GetMapping("/all")
    public List<Directory> getAll() {
        return directoryMapper.findAll();
    }

    @GetMapping("/{id}")
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

    @PostMapping()
    public Directory createDirectory(@RequestBody Directory directory) {
        int id = directoryMapper.insert(directory);
        return directoryMapper.getDirectoryById(directory.getId());
    }

    @PutMapping("/update/{id}")
    public Directory updateDirectory(@PathVariable Long id,
                                     @RequestBody Directory directory) {
        directoryMapper.update(new Directory(id, directory.getTitle(), directory.getShortTitle()));
        return directoryMapper.getDirectoryById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteDirectory
            (@PathVariable Long id) {
        directoryMapper.deleteById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
