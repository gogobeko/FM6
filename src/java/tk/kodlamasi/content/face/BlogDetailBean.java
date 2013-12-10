/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.kodlamasi.content.face;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import tk.kodlamasi.content.entity.Blog;
import tk.kodlamasi.content.repository.BlogRepository;

/**
 *
 * @author GOGO
 */
@ManagedBean
@RequestScoped
public class BlogDetailBean {
    public Blog blog;

    public BlogDetailBean() {
        blog = new Blog();
    }

    public Blog getBlog() {
        return blog;
    }
    
    public void save(){
        BlogRepository repository = new BlogRepository();
        repository.persist(blog);
        repository.close();
    }
    
    public void merge(){
        BlogRepository repository = new BlogRepository();
        repository.merge(blog);
        repository.close();
    }
    
    public String remove(long blogId){
        BlogRepository repository = new BlogRepository();
        repository.remove(blogId);
        repository.close();
        return "deleted";
    }
    
}
