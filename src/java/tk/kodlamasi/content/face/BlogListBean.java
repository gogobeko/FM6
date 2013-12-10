/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.kodlamasi.content.face;

import java.util.List; 
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
public class BlogListBean {
    private List<Blog> blogList;

    public BlogListBean () {
                BlogRepository repository = new BlogRepository();
        blogList = repository.list();
        repository.close();
    }
    

    public List<Blog> getBlogList() {
        return blogList;
    }
 
    
    
    
    
}
