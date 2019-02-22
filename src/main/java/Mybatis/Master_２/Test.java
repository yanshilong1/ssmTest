package Mybatis.Master_２;

import Mybatis.Master_1.Usertest;
import Mybatis.Master_２.Dao.BlogMapper;
import Mybatis.Master_２.Domain.Blog;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Author: yanshilong
 * @Date: 19-2-22 下午3:18
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {


        String resource="conf.xml";

        InputStream inputStream= Usertest.class.getClassLoader().getResourceAsStream(resource);

        //System.out.println(inputStream);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();

        BlogMapper blogMapper=session.getMapper(BlogMapper.class);

        Blog blog=new Blog();
        Blog blog1=new Blog();
        blog.setId(3);

        blog1.setId(3);
        blog1.setUpassword("123");
        blog1.setUusername("123456");

     //   Blog ren=blogMapper.selectBlog(blog);

      //   blogMapper.saveBlog(blog1);
       // blogMapper.deleteBlog(blog1);
        blogMapper.updateBlog(blog1);
         session.commit();
       // System.out.println(ren.getUusername());

        session.close();


    }
}
