package com.npp_telda.dir_regions.mapper;

import com.npp_telda.dir_regions.model.Directory;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DirectoryMapper {
    @Select("Select id, title, shortTitle from directory")
    List<Directory> getAllDirectories();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "shortTitle", column = "shortTitle")
    })

    @Select("SELECT * FROM Directory WHERE id = #{id}")
    Directory getDirectoryById(@Param("id") Long id);

    @Select("SELECT * FROM Directory WHERE title = #{title}")
    List<Directory> getDirectoriesByTitle(@Param("title") String title);

//    @Select("select id, title, shortTitle from Directory where title = #{title}")
//    List<Directory> getDirectoriesByTitle(@Param("title") String title);

    @Select("SELECT * FROM Directory WHERE shortTitle = #{shortTitle}")
    List<Directory> getDirectoriesByShortTitle(@Param("shortTitle") String shortTitle);

    @Insert({"insert into Directory(title,shortTitle) values(#{title},#{shortTitle})"})
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Long.class)
    void addDirectory(Directory Directory);

    @Update("update Directory set title=#{title},shortTitlertTitle=#{shortTitlertTitle} where id=#{id}")
    Integer updateDirectoryById(Directory Directory);

    @Delete("delete from Directory where id=#{id}")
    Integer deleteDirectoryById(@Param("id") Long id);
}
