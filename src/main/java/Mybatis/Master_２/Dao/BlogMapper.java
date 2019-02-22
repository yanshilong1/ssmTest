package Mybatis.Master_２.Dao;

import Mybatis.Master_２.Domain.Blog;

/**
 * @Author: yanshilong
 * @Date: 19-2-22 下午3:12
 * @Version 1.0
 */
public interface BlogMapper {
    public Blog selectBlog(Blog blog);
    public void saveBlog (Blog blog);
    public void updateBlog (Blog blog);
    public void deleteBlog (Blog blog);


}
