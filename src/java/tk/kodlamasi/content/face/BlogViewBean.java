/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.kodlamasi.content.face;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import tk.kodlamasi.content.entity.Blog;
import tk.kodlamasi.content.repository.BlogRepository;

/**
 *
 * @author GOGO
 */
@ManagedBean
@RequestScoped
public class BlogViewBean {
    private Blog blog;

    public BlogViewBean() {
        HttpServletRequest request = (HttpServletRequest) FacesContext
                .getCurrentInstance().getExternalContext().getRequest();
        long blogId=0;
        if(request.getParameter("blogId")!=null && 
                !request.getParameter("blogId").equals("")){
            blogId = Long.parseLong(request.getParameter("blogId"));
        }
        BlogRepository repository = new BlogRepository();
        blog = repository.find(blogId);
        repository.close();
    }

    public Blog getBlog() {
        return blog;
    }

    
    
    
    
}
