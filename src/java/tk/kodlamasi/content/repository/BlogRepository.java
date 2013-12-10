/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.kodlamasi.content.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tk.kodlamasi.content.entity.Blog;

/**
 *
 * @author GOGO
 */
public class BlogRepository {
    private EntityManager manager;

    public BlogRepository() {
        manager=Persistence.createEntityManagerFactory("FM6PU").createEntityManager();
    }
    
   
    
    public List<Blog> list(){
        String string = "select blog from Blog as blog";
        Query query = manager.createQuery(string);
        List<Blog> blogList = query.getResultList();
        return blogList;
    }
    
    public Blog find(long blogId){
        return manager.find(Blog.class, blogId);
    }
     
    public void persist(Blog blog){
        manager.getTransaction().begin();
        manager.persist(blog);
        manager.getTransaction().commit();
    }
    public void merge(Blog blog){
        manager.getTransaction().begin();
        manager.merge(blog);
        manager.getTransaction().commit();
    }
    public String remove(long blogId){
        manager.getTransaction().begin();
        Blog whichone= manager.getReference(Blog.class, blogId);
        manager.remove(whichone);
        manager.getTransaction().commit();
        return "deleted";
    }
    
    
    public void close(){
        manager.close();
    }
    
    
}



