package Mybatis.Master_1;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Author: yanshilong
 * @Date: 19-2-22 下午12:25
 * @Version 1.0
 */
public class Usertest {

    public static void main(String[] args) {

        String resource="conf.xml";

        InputStream inputStream=Usertest.class.getClassLoader().getResourceAsStream(resource);

        System.out.println(inputStream);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement="/home/syl/IdeaProjects/MYssm/src/main/java/Mapping/userMapping.getUser";
        User user=sqlSession.selectOne(statement,2);

        //Mybatis.Master_1.User user=sqlSession.selectOne(statement);
        System.out.println(user);

    }
}
