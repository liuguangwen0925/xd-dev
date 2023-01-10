package com.xdev.mp.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CustomMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {

        //创建人ID
        Object createBy = getFieldValByName("createBy", metaObject);
        if (createBy == null) {
            setFieldValByName("createBy", "1600690703739654145", metaObject);
        }

        //创建人
        Object createUser = getFieldValByName("createUser", metaObject);
        if (createUser == null) {
            setFieldValByName("createUser", "张三", metaObject);
        }

        //创建日期
        Object createTime = getFieldValByName("createTime", metaObject);
        if (createTime == null) {
            setFieldValByName("createTime", new Date(), metaObject);
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {

        //修改人ID
        Object updateBy = getFieldValByName("updateBy", metaObject);
        if (updateBy == null) {
            setFieldValByName("updateBy", "1600690703739654146", metaObject);
        }

        //修改人
        Object updateUser = getFieldValByName("updateUser", metaObject);
        if (updateUser == null) {
            setFieldValByName("updateUser", "李四", metaObject);
        }

        //修改日期
        Object fieldValue = getFieldValByName("updateTime", metaObject);
        if (fieldValue == null) {
            setFieldValByName("updateTime", new Date(), metaObject);
        }
    }


}
