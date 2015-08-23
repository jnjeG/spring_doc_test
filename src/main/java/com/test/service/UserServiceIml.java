package com.test.service;
 
import java.util.List;
 
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
 
import com.test.bo.User;
import com.test.dao.UserDao;
 
/**  
 *ʵ���࣬�и��ֶ�������UserDao�ӿڣ�������ҵ���߼�����  {@link UserDao#getUser()}ʵ��
 *
 *����һ��set��������set������spring ����ע��ʹ�ã����û�лر���
 *����spring��������ע���һ�ַ���--setterע��
 */
public class UserServiceIml implements UserService,InitializingBean,DisposableBean,SmartLifecycle{
  
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
   *   InitializingBean �ӿڴ����ֿ��Կ����˷����� bean�����Ա�spring��ֵ֮��ִ��,���Ǻ�spring�Ľӿ��������һ��
   */
   public void afterPropertiesSet() throws Exception {
      System.out.println(this+" i am  afterPropertiesSet");
   }
  
  
   /* *
    * DisposableBean �ӿڶ����
    */
   public void destroy() throws Exception {
      System.out.println(this+" i am  destroy");
   }
  
  
  
  
   /**  
   * @Description: ����jsrע��
   * @param  
   * @return void
   */
   @PostConstruct
   public void testPostConstruct(){
      System.out.println(this+" i am  testPostConstruct");
   }
  
   /**  
   * @Description: ����JSR��ע��
   * @param  
   * @return void
   */
   @PreDestroy
   public void testPreDesstroy(){
      System.out.println(this+" i am  testPreDesstroy");
   }
  
  
   /**  
   * @Description: ����Ԫ�������ã���xml������
   * @param  
   * @return void
   */
   public void testInit(){
      System.out.println(this+" i am  testInit");
   }
  
   /**  
   * @Description: ����Ԫ�������ã���xml������
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
      System.out.println(this+"spring����������");
      isRunning = true;
   }
  
   /**  
   *   
   */
   public void stop() {
      System.out.println(this+"spring�����ر���");
      isRunning = false;
   }
     
   public int getPhase() {
      return 0;
   }
  
  
   public boolean isAutoStartup() {
      return true;
   }
  
  
   public void stop(Runnable arg0) {
      arg0.run();
      isRunning = false;
      System.out.println(this+"  this is stop");
   }
}