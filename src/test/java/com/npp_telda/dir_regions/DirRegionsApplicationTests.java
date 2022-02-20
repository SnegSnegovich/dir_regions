//package com.npp_telda.dir_regions;
//
//import com.npp_telda.dir_regions.config.PersistenceConfig;
//import com.npp_telda.dir_regions.mapper.DirectoryMapper;
//import com.npp_telda.dir_regions.model.Directory;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = PersistenceConfig.class)
//class DirRegionsApplicationTests {
//
//	@Autowired
//	DirectoryMapper directoryMapper;
//
//	@Test
//	public void whenRecordsInDatabase_shouldReturnArticleWithGivenId() {
//		Directory directory = directoryMapper.getArticle(1L);
//
//		assertThat(article).isNotNull();
//		assertThat(article.getId()).isEqualTo(1L);
//		assertThat(article.getAuthor()).isEqualTo("Baeldung");
//		assertThat(article.getTitle()).isEqualTo("Working with MyBatis in Spring");
//	}
//
//}
