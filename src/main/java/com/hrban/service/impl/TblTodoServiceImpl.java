package com.hrban.service.impl;

import com.hrban.bean.TblTodo;
import com.hrban.mapper.TblTodoMapper;
import com.hrban.service.base.TblTodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author hrban
 * @since 2020-08-18
 */
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo> implements TblTodoService {

}
