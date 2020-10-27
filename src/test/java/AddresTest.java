import com.mybatis.mi.entity.User;
import com.mybatis.mi.mapper.AddresMapper;
import com.mybatis.mi.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class AddresTest {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(AddresTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        AddresMapper mapper = sqlSession.getMapper(AddresMapper.class);
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张风");
        user.setPassword("123456");
        int insert = mapper1.insert(user);
        User user1 = mapper1.selectById(3);
        System.out.println(user1);


    }
}
