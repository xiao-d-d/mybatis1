import com.mybatis.mi.entity.Order;
import com.mybatis.mi.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
      /*  UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("ad");
        user.setPassword("123456");
        int insert = mapper.insert(user);
        System.out.println(insert);*/
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
       /* Order order = mapper.selectOrderByNo(123);
        //映射关系 先保存主表获取主表的ID 将主表的ID的值设置给从表的外键
        //一对一保存
        //更新 假删除
        //外键 删除时 setnull 更新时 cascade级联更新(主表更新从表也会更新)
        //一对多 (一对一与一对多 优选一对多)
        //多表查询 笛卡尔积 查询效率低
        //一对一 不用多表查询
        //一对多 一个订单多个商品
        System.out.println(order);*/

    }
}
