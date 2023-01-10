package com.xdev.mp.JsonResult;

import com.xdev.mp.enums.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;


@Data
public class Result<T> implements Serializable {
    private  Integer code;
    private  String  msg;
    private  T       data;


    public static <T> Result<T> build(Integer code, String msg) {
        Result<T> result = build(code,msg,null);
        return result;
    }

    public static <T> Result<T> build(Integer code, String msg,T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> build(ResultCodeEnum resultCodeEnum) {
        Result<T> result = build(resultCodeEnum,null);
        return result;
    }

    public static <T> Result<T> build(ResultCodeEnum resultCodeEnum,T data) {
        Result<T> result = new Result<>();
        result.setCode(resultCodeEnum.getCode());
        result.setMsg(resultCodeEnum.getMsg());
        result.setData(data);
        return result;
    }

    /**
     * 操作成功
     * @param data
     * @param <T>
     * @return
     */
    public static<T> Result<T> ok(T data){
        return build(ResultCodeEnum.SUCCESS,data);
    }

    /**
     * 操作成功
     * @param <T>
     * @return
     */
    public static<T> Result<T> ok(){
        return Result.ok(null);
    }
    /**
     * 操作失败
     * @param data
     * @param <T>
     * @return
     */
    public static<T> Result<T> fail(T data){
        return  build(ResultCodeEnum.FAIL,data);
    }
    /**
     * 操作失败
     * @param <T>
     * @return
     */
    public static<T> Result<T> fail(){
        return Result.fail(null);
    }

    /**
     * 操作失败
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static<T> Result<T> fail(Integer code,String msg){
        Result<T> result=fail();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 操作成功或失败
     * @param success
     * @param <T>
     * @return
     */
    public static<T> Result<T> bool(Boolean success){
        if(success){
            return  Result.ok();
        }
        return Result.fail();
    }

    public Result<T> msg(String msg){
        this.setMsg(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }
}
