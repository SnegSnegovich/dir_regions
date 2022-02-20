package com.npp_telda.dir_regions.mapper;

import com.npp_telda.dir_regions.model.Directory;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DirectoryMapper {
    @Select("select * from Directory")
    List<Directory> getAllDirectories();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "shortTitle", column = "shortTitle")
    })

    @Select("select title as title,shortTitle as shortTitle,id as id from Directory where id=#{id}")
    Directory getDirectoryById(@Param("id") Long id);

    @Select("select * from Directory where title like concat('%',#{title},'%')")
    List<Directory> getDirectoriesByTitle(@Param("title") String title);

    @Select("select * from Directory where shortTitle like concat('%',#{shortTitle},'%')")
    List<Directory> getDirectoriesByShortTitle(@Param("shortTitle") String shortTitle);

    @Insert({"insert into Directory(title,shortTitle) values(#{title},#{shortTitle})"})
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Integer.class)
    Integer addDirectory(Directory Directory);

    @Update("update Directory set title=#{title},shortTitle=#{shortTitle} where id=#{id}")
    Integer updateDirectoryById(Directory Directory);

    @Delete("delete from Directory where id=#{id}")
    Integer deleteDirectoryById(@Param("id") Long id);
}
