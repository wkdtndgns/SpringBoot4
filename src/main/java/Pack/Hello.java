package Pack;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


class Dao {

  InputStream is = null;
  SqlSessionFactory sf = null;
  SqlSession session = null;

  Dao() {
    try {
      is = Resources.getResourceAsStream("mybatis-config.xml");
    } catch (Exception e) {
      e.printStackTrace();
    }

    sf = new SqlSessionFactoryBuilder().build(is);
    try {
      is.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  void insert() {
    session = sf.openSession();

    try {
      int result = session.insert("test02", "mybatis1");
      if (result > 0) {
        session.commit();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
  }

  void select() {
    session = sf.openSession();
    try {
      List<String> ls = session.selectList("test01");
      System.out.println(ls);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
  }

  void update(){
    session = sf.openSession();
    try {
      int result = session.update("test03","mybatis");
      if( result > 0){
        session.commit();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
  }

  void delete(){
    session = sf.openSession();
    try {
      int result = session.delete("test04","update");
      if( result > 0 ){
        session.commit();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
  }
}

public class Hello {

  SqlSession session = null;

  public static void main(String[] args) {

    System.out.println(1);
    InputStream is = null;
    SqlSessionFactory sf = null;
    SqlSession session = null;
    try {
      is = Resources.getResourceAsStream("mybatis-config.xml");
      System.out.println(is);
      sf = new SqlSessionFactoryBuilder().build(is);
      session = sf.openSession();


      // update
//      int result = session.update("test03","mybatis");
//      if( result > 0){
//        session.commit();
//      }

      // delete
//      int result = session.delete("test04","update");
//      if( result > 0 ){
//        session.commit();
//      }

      Person p = new Person("test01", "test02");
      int result = session.insert("test05", p);
      if (result > 0) {
        session.commit();
      }

      // select
      List<Person> ls = session.selectList("test06");
      System.out.println(ls);

      System.out.println("end");
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        is.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
