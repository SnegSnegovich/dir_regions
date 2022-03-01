package com.npp_telda.dir_regions.mapper;

import com.npp_telda.dir_regions.model.Directory;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DirectoryMapper {

    @Select("Select * from directory")
    List<Directory> findAll();

    @Select("SELECT * FROM Directory WHERE id = #{id}")
    Directory getDirectoryById(Long id);

    @Select("SELECT * FROM Directory WHERE title = #{title}")
    List<Directory> getDirectoriesByTitle(String title);

    @Select("SELECT * FROM Directory WHERE shortTitle = #{shortTitle}")
    List<Directory> getDirectoriesByShortTitle(String shortTitle);

    @Insert("insert into Directory(id, title, shortTitle) " +
            " values (#{id}, #{title}, #{shortTitle})")
    int insert(Directory directory);

    @Update("Update Directory set title = #{title}, " +
            " shortTitle = #{shortTitle} where id=#{id}")
    int update(Directory directory);

    @Delete("DELETE FROM Directory WHERE id = #{id}")
    int deleteById(long id);
}