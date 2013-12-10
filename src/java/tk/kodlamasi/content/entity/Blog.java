/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.kodlamasi.content.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author GOGO
 */
@Entity @Table(name="Blog")
public class Blog implements Serializable {
@Id @GeneratedValue(strategy= GenerationType.IDENTITY)    
    @Column(name="BlogID")
    private long blogId;
    @Column(name="BlogName",length=100,nullable=false,unique=true)
    private String blogName;
    @Column(name="BlogBody",length=3000)
    private String blogBody;

    
    public String getBlogBody() {
        return blogBody;
    }

    public void setBlogBody(String blogBody) {
        this.blogBody = blogBody;
    }

    public long getBlogId() {
        return blogId;
    }

    public void setBlogId(long blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }
    
    
    
}
