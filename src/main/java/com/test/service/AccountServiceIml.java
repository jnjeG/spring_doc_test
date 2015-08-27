package com.test.service;
 
import java.io.ObjectInputStream.GetField;
import java.util.List;
 
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
 
import com.test.bo.User;
import com.test.dao.UserDao;
 
/**  
 *实现类，有个字段引用了UserDao接口，其具体的业务逻辑调用  {@link UserDao#getUser()}实现
 *
 *且有一个set方法，此set方法由spring 容器注入使用，如果没有回报错，
 *这是spring容器依赖注入的一种方法--setter注入
 */
public class AccountServiceIml implements AccountService,InitializingBean,DisposableBean,SmartLifecycle{
  
   private volatile boolean isRunning = false;
   private UserDao userDao;
   
   public List<User> getUser() {
      return userDao.getUser();
   }
   public void setUserDao(UserDao userDao) {
      this.userDao = userDao;
      System.out.println(this+" i am  setMethod");
   }
  
  
 
   /**  
   *   InitializingBean 接口从名字可以看出此方法在 bean的属性被spring赋值之后执行,但是和spring的接口耦合在了一起
   */
   public void afterPropertiesSet() throws Exception {
      System.out.println(this+" i am  afterPropertiesSet");
   }
  
  
   /* *
    * DisposableBean 接口定义的
    */
   public void destroy() throws Exception {
      System.out.println(this+" i am  destroy");
   }
  
  
  
  
   /**  
   * @Description: 采用jsr注解
   * @param  
   * @return void
   */
   @PostConstruct
   public void testPostConstruct(){
      System.out.println(this+" i am  testPostConstruct");
   }
  
   /**  
   * @Description: 采用JSR的注解
   * @param  
   * @return void
   */
   @PreDestroy
   public void testPreDesstroy(){
      System.out.println(this+" i am  testPreDesstroy");
   }
  
  
   /**  
   * @Description: 采用元数据配置，在xml中配置
   * @param  
   * @return void
   */
   public void testInit(){
      System.out.println(this+" i am  testInit");
   }
  
   /**  
   * @Description: 采用元数据配置，在xml中配置
   * @param  
   * @return void
   */
   public void testBeforeDesstroy(){
      System.out.println(this+" i am  testBeforeDesstroy");
   }
  
  
   public void init(){
      System.out.println(this+" i am  init");
   }
  
   public void close(){
      System.out.println(this+" i am  close");
   }
  
  
 
   public boolean isRunning() {
      return isRunning;
   }
  
  
   public void start() {
      System.out.println(this+"spring容器启动啦"+" phase:"+this.getPhase());
      isRunning = true;
   }
  
   public void stop() {
      System.out.println(this+"spring容器关闭啦"+" phase:"+this.getPhase());
      isRunning = false;
   }
     
   public int getPhase() {
      return 100;
   }
  
  
   public boolean isAutoStartup() {
      return true;
   }
  
  /**
   * 只有SmartLifeCircle 才会执行这个方法,
   * 其他类型的LifeCircle 执行stop()方法
   */
   public void stop(Runnable arg0) {
      arg0.run();
      isRunning = false;
      System.out.println(this+" SmartLifeCircle stop"+" phase:"+this.getPhase());
   }
}