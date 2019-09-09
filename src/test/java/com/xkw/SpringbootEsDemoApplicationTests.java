package com.xkw;

import com.xkw.domain.Resource;
import com.xkw.es.EsResourceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEsDemoApplicationTests {

    @Autowired
    EsResourceRepository resourceRepository;

    @Test
    public void contextLoads() {
        Resource resource = new Resource();
        resource.setId(1);
        resource.setCourseId(11);
        resource.setTitle("test Title1234");
//        resource.setCreateTime(LocalDateTime.now());
//        resource.setUpdateTime(new Date());
        resource.setUpdateTime1(LocalDateTime.now());

        resourceRepository.save(resource);
    }

    @Test
    public void testGetResource() {
        Resource resource = resourceRepository.findById(1).orElse(null);
        System.out.println(resource);
    }
}
